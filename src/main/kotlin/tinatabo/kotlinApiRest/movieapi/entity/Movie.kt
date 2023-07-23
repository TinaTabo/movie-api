package tinatabo.kotlinApiRest.movieapi.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

//-- Definición de la clase que representa al objeto película.
//-- Cada instancia de la clase representa una fila en la tabla SQL.


@Entity //-- Esta anotación se utiliza para indicar que la clase es una entidad JPA. Esto significa que JPA sabe que puede utilizar esta clase para mapear las filas de una tabla de base de datos.
data class Movie(
    @Id //-- Esta anotación se utiliza para definir el campo de la entidad que se utiliza como clave primaria en la base de datos. En mi caso, id es la clave primaria que se mapeará al campo id de la tabla de la base de datos.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //-- Esta anotación se utiliza junto con @Id para indicar que el valor de la clave primaria se generará automáticamente cuando se inserte una nueva entidad en la base de datos. GenerationType.IDENTITY indica que la base de datos asignará un valor automáticamente para el campo de la clave primaria (es decir, será un campo autoincremental).
    val id: Int,
    val name: String,
    val rating: Double
)
