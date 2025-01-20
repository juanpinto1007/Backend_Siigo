package co.com.prueba_api_auto.certificacion.task;

import co.com.prueba_api_auto.certificacion.interactions.ConsumoServicios;
import co.com.prueba_api_auto.certificacion.utilidades.GestionarDatos;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ListaCompletaEmpleadosRest implements Task {

    GestionarDatos Data = new GestionarDatos();

    public static ListaCompletaEmpleadosRest con() {
        return Tasks.instrumented(ListaCompletaEmpleadosRest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ConsumoServicios.conGetEmpleados());
        Data.guardarDatos("status", SerenityRest.lastResponse().jsonPath().getString("status"));
        Data.guardarDatos("statusCode", String.valueOf(SerenityRest.lastResponse().statusCode()));
        }

    }
