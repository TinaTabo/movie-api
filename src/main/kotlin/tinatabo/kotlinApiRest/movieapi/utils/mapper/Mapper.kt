package tinatabo.kotlinApiRest.movieapi.utils.mapper

//-- La interfaz Mapper se utiliza para mapear entre mi objeto entity 'Movie'
//-- y mi objeto de transferencia de datos (DTO) 'MovieDTO'
//-- Esto es útil cuando tienes dos tipos de objetos que realizan funciones similares pero no
//-- pueden interactuar entre sí directamente debido a diferencias en su implementación.
interface Mapper<E, D> {
    fun fromEntity(entity: E): D
    fun toEntity(domain: D): E
}

//-- Aquí, E es el tipo de tu objeto de entidad y D es el tipo de tu objeto DTO.
//-- La función mapFromEntity toma un objeto de entidad como entrada y devuelve un
//-- objeto DTO. La función mapToEntity hace lo opuesto: toma un objeto DTO como entrada
//-- y devuelve un objeto de entidad.

/*
* Al implementar esta interfaz para tu entidad Movie y tu MovieDTO, puedes crear fácilmente
* instancias de MovieDTO a partir de entidades Movie y viceversa. Esto es útil cuando recuperas
* una entidad Movie de tu base de datos y necesitas convertirla a MovieDTO para enviarla como
* respuesta a una solicitud HTTP, o cuando recibes un MovieDTO en una solicitud HTTP y necesitas
* convertirlo a una entidad Movie para almacenarlo en la base de datos.
*/