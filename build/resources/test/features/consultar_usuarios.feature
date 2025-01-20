#language: es

  Característica: Prueba de get
  Yo como usuario de la pagina reqes
  Quiero probar el servicio
  para saber su estado

  Escenario: prueba metodo get
    Dado que Juan quiere consumir la api de "REQRES"
    Cuando el consume el servicio de consulta de usuarios
    Entonces el esperara un codigo de estado 200

