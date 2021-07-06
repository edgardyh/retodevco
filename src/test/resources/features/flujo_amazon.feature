# language: es

Característica: yo como usuario requiero agregar productos al carro de compra

  @UnProductoAmazon
  Escenario: Abrir pagina - Amazon - con SerintyBDD
    Dado que un usuario esta en la pagina para de Amazon
    Cuando el usuario escoge un producto y lo agrega al carrito
    Entonces el deberia visualizar el producto agreado en su carrito

  @VariosProductosAmazon
  Escenario: Abrir pagina - Amazon - con SerintyBDD
    Dado que un usuario esta en la pagina para de Amazon
    Cuando el usuario escoge varios productos y los agrega al carrito
    Entonces el deberia visualizar el numero de productos en su carrito y el monto subtotal

  @UnProductoNoDisponible
  Escenario: Abrir pagina - Amazon - con SerintyBDD
    Dado que un usuario esta en la pagina para de Amazon
    Cuando el usuario escoge un producto no disponible
    Entonces el deberia visualizar un mensaje que indique que el producto no esta disponible

