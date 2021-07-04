# language: es

Característica: yo como usuario requiero enviar correos electrónicos y validar el envío de los mismos en la pestaña enviados

  @FlujoCrearCorreoCampoIncompleto
  Escenario: Abrir pagina - Google - Ingresar a cuenta Google - con SerintyBDD
    Dado que un usuario esta en la pagina para iniciar sesion
    Cuando el usuario se loguea y envia correos llenando los campos para - asunto - descripcion
    Entonces el deberia visualizar los correos enviados en la pestaña de enviados