# pedidos
evaluacion-tecnica

2- Suponiendo que la tabla Pedidos tiene muchos registros y columnas (algunas de ellas
nullable, algunas BLOB / "binary-large-object"), que consideraciones se deberían tener en
cuenta para realizar desde un sitio web consultas a la base de datos de manera
eficiente? Discuta performance a nivel motor de base de datos, networking, capa
aplicativa desde donde se realizan las solicitudes, entre otros aspectos que considere
relevantes.

Se puede utilizar como usamos en el primer punto un cache.
A su vez modificar las consultas para que a a la aplicacion web le lleguen los datos que necesitan y no mas datos, utilizar Paginacion desde front hasta la base.
En lo posible normalizar la tabla. 

Si con esto no alcanza se puede pensar en agregar un motor de busqueda ,indexando los datos, (Elasticsearch, solr).
Con estos moteres de busquedas vos decis que datos queres indexar podes hacer parseadores y las consultas son mucho mas rapido.




Front ---- thymeleaf ()----

http://localhost:8080/front-pedido
