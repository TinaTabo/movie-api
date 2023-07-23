package tinatabo.kotlinApiRest.movieapi.service

import tinatabo.kotlinApiRest.movieapi.dto.MovieDTO

//-- Al empezar a crear este archivo lo primero que hay que hacer es
//-- boton derecho en la llave despues de MovieService -> show content actions -> implement interface
//-- Apareceran dos ventanas emergentes -> dar ok en ambas.
interface MovieService {

    fun getMovies(): List<MovieDTO>
    fun getMovie(id: Int): MovieDTO
    fun createMovie(movieDTO: MovieDTO): MovieDTO
    fun updateMovie(movieDTO: MovieDTO): MovieDTO
    fun deleteMovie(id: Int)
}