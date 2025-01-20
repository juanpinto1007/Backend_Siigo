package co.com.prueba_api_auto.certificacion.task;

import co.com.prueba_api_auto.certificacion.utilidades.GestionarDatos;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import org.junit.Assert;

import static co.com.prueba_api_auto.certificacion.utilidades.enums.ConcatenarMetodos.ELIMINAR_EMPLEADO;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarUsuarioRestDeleted implements Task {

    GestionarDatos Data = new GestionarDatos();

    public static EliminarUsuarioRestDeleted eliminar(){ return instrumented(EliminarUsuarioRestDeleted.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Delete.from(String.format(ELIMINAR_EMPLEADO.toString(),Data.obtenerDatos("id")))
                        .with(requestSpecification -> requestSpecification));

        Assert.assertEquals(204, SerenityRest.lastResponse().statusCode());
    }
}




