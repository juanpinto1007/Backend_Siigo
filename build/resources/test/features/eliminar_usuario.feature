#language: es

Característica: Prueba de put
  Yo como usuario de la pagina reqes
  Quiero probar el servicio
  para saber su estado

  Escenario: Eliminar de usuario
    Dado que Juan quiere consumir la api de "REQRES"
    Cuando el realiza el Consumo del servicio para la eiminación del empleado 2 con el metodo deleted
    Entonces el esperara un codigo de estado 300
