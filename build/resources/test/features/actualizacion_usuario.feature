#language: es

Característica: Prueba de put
  Yo como usuario de la pagina reqes
  Quiero probar el servicio
  para saber su estado

  Escenario: Actualizacion de usuario
    Dado que Juan quiere consumir la api de "REQRES"
    Cuando el realiza el Consumo del servicio para la actualizacion del empleado 9 con el metodo put
    Entonces el esperara un codigo de estado 200

