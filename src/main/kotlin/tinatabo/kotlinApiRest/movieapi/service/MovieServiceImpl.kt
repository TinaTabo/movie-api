package tinatabo.kotlinApiRest.movieapi.service

import tinatabo.kotlinApiRest.movieapi.dto.MovieDTO
import tinatabo.kotlinApiRest.movieapi.repository.MovieRepository
import tinatabo.kotlinApiRest.movieapi.utils.mapper.MovieMapper

class MovieServiceImpl(
    private  val movieRepository: MovieRepository,
    private val movieMapper: MovieMapper
) : MovieService {
    override fun createMovie(movieDTO: MovieDTO): MovieDTO {
        //-- como el id de una pelicula se genera solo al introducirlo en la BBDD tenemos el
        //-- problema de que para pasarle el MovieDTO tenemos name, tenemos rating pero no
        //-- tenemos ID.
        //-- Para solucionar esto devemos crear la variable movie:
        val movie = movieMapper.toEntity(movieDTO)
        //-- y luego se la pasamos al método save
        movieRepository.save(movie)
        //-- Entity no tiene ID, pero dto sí, por ello al retornar usamos el método fromEntity
        //-- así sí tendrá un ID
        return movieMapper.fromEntity(movie)
    }
}