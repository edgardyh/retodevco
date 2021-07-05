# language: es

Característica: yo como usuario requiere acceder a Contactos de google para
  agregar un contacto. Además que el botón Guardar se habilite al llenar un solo campo

  @AgregarContactos
  Escenario: Abrir pagina - Google Contactos - con SerintyBDD
    Dado que un usuario esta en la pagina de contactos de google
    Cuando el usuario se loguea y agrega un contacto
    Entonces el deberia visualizar el contacto agregado