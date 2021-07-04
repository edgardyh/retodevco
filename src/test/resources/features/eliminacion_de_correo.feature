# language: es

Característica: yo como usuario requiero eliminar correos electrónicos enviados y validar que
  estos queden en la papelera para que sean eliminados definitivamente

  @EliminaCorreos
  Escenario: Abrir correo - Google - Borrar correos enviados - con SerintyBDD
    Dado que un usuario esta en la pagina para iniciar sesion
    Cuando el usuario se loguea y elimina correos enviados y en papelera definitivamente
    Entonces el deberia visualizar la papelera vacia