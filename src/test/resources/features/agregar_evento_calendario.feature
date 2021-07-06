# language: es

Característica: yo como usuario requiero validar la creacion de un
  evento en el calendario con fecha final menor a la incial

  @BugCalendarioFechaPosterior
  Escenario: Abrir pagina - Ingresar a google Calendar - con SerintyBDD
    Dado que un usuario inicia sesion por GoogleCalendar
    Cuando el usuario se loguea y crea una reunion en el calendario
    Entonces el evento no deberia guardarse porque tiene fecha fin no posterior a la fecha de inicio