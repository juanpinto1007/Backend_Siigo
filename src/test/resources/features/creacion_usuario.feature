#language:es
Característica: Creacion usuario
  Yo como aministrador
  quiero impactar el servicio de cracion en REQRES
  para crear usuarios

  Escenario: Creacion de usuario exitoso
    Dado que Juan quiere consumir la api de "REQRES"
    Cuando el realiza el Consumo del servicio para la creacion con el metodo post
    Entonces el esperara un codigo de estado 201