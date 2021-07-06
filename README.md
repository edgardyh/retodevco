# retodevco

Este es un proyecto de automatizacion de pruebas funcionales en la Suite de Google y escenarios extra en Amazon.

El orden en que se debe ejecutar el proyecto es de la siguiente manera:

Se ejecutan los Runners:

1. NuevoCorreoRunners -> Validación de creación de correo sin confirmar número de teléfono
2. FlujoAmazon -> Los tres escenarios extra. Agregando productos al carrito
3. EnvioDeCorreoRunners -> Envío de dos correos electrónicos y validación en pestaña enviados
4. EliminaCorreoRunners -> Eliminación permanente de los correos electronicos enviados
5. CalendarioRunners -> Bug, Al crear evento permite guardarlo con fecha final menor que la fecha incial (solo sucede con un dia de anterioridad)
6. ContactosRunners -> Agregación de un contacto


#NOTA: Para ejecutar por segunda vez el EliminaCorreoRunners debe ejecutar EnvioDeCorreoRunners, como preparación de prueba.

Si al iniciar a correr el robot sale la pantalla de google para confirmar cuenta, acceda primero manualmente y luego vuelva a correr el robot
