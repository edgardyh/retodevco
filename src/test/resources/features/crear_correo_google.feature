# language: es

Característica: yo como usuario requiero validar la NO creacion de cuenta google cuando no se ingrese un numero
  de teléfono para la confirmación de la cuenta

  @Pending
  Escenario: Abrir pagina - Google - Crear cuenta Google - con SerintyBDD
    Dado que un usuario esta en la pagina de gmail para crear un nuevo usuario
    Cuando el usuario ingresa por la pantalla de crear una cuenta de google y llena todos los campos solicitados excepto numero de telefono de confirmacion
    Entonces el deberia visualizar un mensaje informado que no es posible continuar por no llenar el campo numero de telefono
