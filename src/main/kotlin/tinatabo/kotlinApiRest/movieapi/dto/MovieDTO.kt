package tinatabo.kotlinApiRest.movieapi.dto

import jakarta.persistence.Entity

//-- Un DTO es un objeto que se utiliza para encapsular datos y enviarlos de un sistema a otro.
//-- En el contexto de una API REST, los DTO se utilizan para definir cómo se deben enviar o
//-- recibir los datos de la API. Esto incluye definir el formato JSON de las solicitudes y respuestas.
data class MovieDTO(
    var id: Int = -1,
    var name: String = "Default movie",
    var rating: Double
)
