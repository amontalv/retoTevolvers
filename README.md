# tevolvers
Reto tecnico para tevolver automatización de servicios y front

Se crea con patron de diseño screenplay, se crea encarpetado de front y service en el caso de que sea requerido.

Se ejecuta con el comando gradle clean test aggregate todo el set de pruebas

Para ejecutar casos especificos se realiza de la siguiente forma:

Front:
- gradle clean test --tests "AddProductForCaregoryRunner" aggregate

Service:

Create Booking
- gradle clean test --tests "CreateBookingRunner" aggregate

Get Booking
- gradle clean test --tests "GetBookingRunner" aggregate

Update Booking
- gradle clean test --tests "UpdateBookingRunner" aggregate


Se genera archivo util JSonParserResponse donde se realiza la busqueda del token y se devuelve la información respectiva.

Se genera tarea para creación del consumo del token "CreateToken".

Se utilizan las propiedades de screenplat de actor.remember para recordar la respuesta y el actor.recall para invocar lo que se recordo.


