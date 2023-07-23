package tinatabo.kotlinApiRest.movieapi.utils.mapper

import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import tinatabo.kotlinApiRest.movieapi.dto.MovieDTO
import tinatabo.kotlinApiRest.movieapi.entity.Movie

@Service
class MovieMapper: Mapper<Movie, MovieDTO> {
    override fun fromEntity(entity: Movie): MovieDTO = MovieDTO(
        entity.id,
        entity.name,
        entity.rating
    )

    override fun toEntity(domain: MovieDTO): Movie = Movie(
        domain.id,
        domain.name,
        domain.rating
    )
}
