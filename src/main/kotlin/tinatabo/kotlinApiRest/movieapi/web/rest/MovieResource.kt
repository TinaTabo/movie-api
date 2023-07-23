package tinatabo.kotlinApiRest.movieapi.web.rest

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import tinatabo.kotlinApiRest.movieapi.dto.MovieDTO
import tinatabo.kotlinApiRest.movieapi.service.MovieService

@RestController
class MovieResource(
    private val movieService: MovieService
) {

    @GetMapping
    fun getMovies(): ResponseEntity<List<MovieDTO>>{
        return ResponseEntity.ok(movieService.getMovies())
    }

    @GetMapping("/{id}")
    fun getMovie(@PathVariable id: Int) =
        ResponseEntity.ok(movieService.getMovie(id))

    @PostMapping
    fun createMovie(@RequestBody movieDTO: MovieDTO): ResponseEntity<MovieDTO>{
        return ResponseEntity(movieService.createMovie(movieDTO), HttpStatus.CREATED)
    }
}