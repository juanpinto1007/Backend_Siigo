package co.com.prueba_api_auto.certificacion.interactions;

import co.com.prueba_api_auto.certificacion.utilidades.GestionarDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.prueba_api_auto.certificacion.utilidades.enums.ConcatenarMetodos.LISTA_COMPLETA_DE_USUARIOS;

public class ConGetListaCompletaDeEmpleados implements Interaction {
    GestionarDatos Data = new GestionarDatos();
    public ConGetListaCompletaDeEmpleados() {}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Get.resource(String.format(LISTA_COMPLETA_DE_USUARIOS.toString()))
                .with(requestSpecification -> requestSpecification
                        ));



    }
}

