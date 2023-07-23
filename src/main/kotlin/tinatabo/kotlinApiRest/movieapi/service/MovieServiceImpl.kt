package tinatabo.kotlinApiRest.movieapi.service

import org.springframework.stereotype.Service
import tinatabo.kotlinApiRest.movieapi.dto.MovieDTO
import tinatabo.kotlinApiRest.movieapi.repository.MovieRepository
import tinatabo.kotlinApiRest.movieapi.utils.exceptions.MovieException
import tinatabo.kotlinApiRest.movieapi.utils.mapper.MovieMapper

@Service
class MovieServiceImpl(
    private  val movieRepository: MovieRepository,
    private val movieMapper: MovieMapper
) : MovieService {

    //-- Funcion para método GET: Obtener lista con todas las peliculas de la BBDD
    override fun getMovies(): List<MovieDTO> {
        val movies = movieRepository.getAllMovies()

        if (movies.isEmpty()){
            throw MovieException("List of movies is empty.")
        }

        return movies.map{
            movieMapper.fromEntity(it)
        }
    }

    //-- Funcion para obtener UNA pelicula identificandola por su ID
    override fun getMovie(id: Int): MovieDTO {
        val optionalMovie = movieRepository.findById(id)
        val movie = optionalMovie.orElseThrow{MovieException("Movie with id = $id is not present")}
        return movieMapper.fromEntity(movie)
    }

    //-- Funcion para el método POST: Añade una pelicula a la BBDD
    override fun createMovie(movieDTO: MovieDTO): MovieDTO {
        //-- Control de errores
        if (movieDTO.id != -1){
            throw MovieException("Id must be null or -1.")
        }

        //-- como el id de una pelicula se genera solo al introducirlo en la BBDD tenemos el
        //-- problema de que para pasarle el MovieDTO tenemos name, tenemos rating pero no
        //-- tenemos ID.
        //-- Para solucionar esto:
        val movie = movieRepository.save(movieMapper.toEntity(movieDTO))

        //-- Entity no tiene ID, pero dto sí, por ello al retornar usamos el método fromEntity
        //-- así sí tendrá un ID
        return movieMapper.fromEntity(movie)
    }
}