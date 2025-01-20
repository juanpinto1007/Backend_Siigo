package co.com.prueba_api_auto.certificacion.task;

import co.com.prueba_api_auto.certificacion.utilidades.GestionarDatos;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import net.serenitybdd.screenplay.rest.interactions.Put;
import org.junit.Assert;


import static co.com.prueba_api_auto.certificacion.utilidades.enums.ConcatenarMetodos.ACTUALIZAR_EMPLEADO;
import static co.com.prueba_api_auto.certificacion.utilidades.enums.DatosEnums.NAME_NEW;
import static co.com.prueba_api_auto.certificacion.utilidades.enums.DatosEnums.NAME_JOB;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ActualizarUsuarioRestPut implements Task {


    GestionarDatos Data = new GestionarDatos();

    public static ActualizarUsuarioRestPut actualizar(){ return instrumented(ActualizarUsuarioRestPut.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Put.to(String.format(ACTUALIZAR_EMPLEADO.toString(),Data.obtenerDatos("id"))).
                        with(requestSpecification ->
                                requestSpecification
                                        .contentType(ContentType.JSON)
                                        .body("{" +
                                                '\"' + NAME_NEW.getClave() + '\"' + ":" + '\"' + NAME_NEW.getValor() + '\"' + "," +
                                                '\"' + NAME_JOB.getClave() + '\"' + ":" + '\"' + NAME_JOB.getValor() + '\"' +
                                                "}"
                                        )));
        Assert.assertEquals(200, SerenityRest.lastResponse().statusCode());

    }




}
