#language: es
  Característica: cambio del nombre de un empleado en una orden
    Yo como usuario necesito cambiar el nombre de un empleado
    en las ordenes de compras para corregir algunas facturas de compra

  Escenario: cambiar nombre de empleado en una orden
    Dado que el usuario ingresa a la pagina "https://demo.serenity.is/"
    Cuando visualice la pagina de dashboard
    Y de clic sobre el boton de ordenes
    Entonces puede seleccionar alguna y aplicar los cambios
