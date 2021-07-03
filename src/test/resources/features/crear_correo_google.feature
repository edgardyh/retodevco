# language: es

Característica: yo como usuario requiero hacer uso de los servicios de google para gestionar
  correos documentos calendarios y contactos

  @CrearCuentaGoogleCorreo
  Escenario: Abrir pagina - Google - Crear cuenta Google - con SerintyBDD
    Dado que un usuario esta en la pagina de gmail para crear un nuevo usuario
    Cuando el usuario ingresa por la pantalla de crear una cuenta de google y llena todos los campos solicitados y acepta las condiciones
    Entonces el deberia visualizar la bandeja de correo