package tinatabo.kotlinApiRest.movieapi.repository

import org.springframework.data.repository.CrudRepository
import tinatabo.kotlinApiRest.movieapi.dto.MovieDTO
import tinatabo.kotlinApiRest.movieapi.entity.Movie

//--
interface MovieRepository: CrudRepository<Movie, Int>

/*
* Claro, resumiendo, MovieRepository es una interfaz que proporciona métodos
* para operar sobre tu base de datos con la entidad Movie. Extiende CrudRepository,
* una interfaz de Spring Data, que proporciona métodos para las operaciones CRUD básicas
* (crear, leer, actualizar y borrar).
*
* Algunos de los métodos que CrudRepository proporciona incluyen save(), findOne(), existsById(),
* findAll(), count(), deleteById(), deleteAll(), entre otros.
*
* Entonces, MovieRepository actúa como una capa de abstracción entre tu aplicación y la base de
* datos, permitiéndote interactuar con la base de datos sin tener que escribir consultas SQL
* a mano. En cambio, simplemente llamas a los métodos en MovieRepository, y Spring Data se encarga
* de traducirlos a las consultas SQL adecuadas.
*
* Además, puedes añadir métodos personalizados a MovieRepository para realizar consultas más complejas
* que las operaciones CRUD básicas.
*/