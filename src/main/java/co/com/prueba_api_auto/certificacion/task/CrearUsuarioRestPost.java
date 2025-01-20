package co.com.prueba_api_auto.certificacion.task;

import co.com.prueba_api_auto.certificacion.utilidades.GestionarDatos;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;
import org.junit.Assert;
import static co.com.prueba_api_auto.certificacion.utilidades.enums.ConcatenarMetodos.CREAR_EMPLEADO;
import static co.com.prueba_api_auto.certificacion.utilidades.enums.DatosEnums.JOB;
import static co.com.prueba_api_auto.certificacion.utilidades.enums.DatosEnums.NAME;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CrearUsuarioRestPost implements Task {

    GestionarDatos Data = new GestionarDatos();

    public static CrearUsuarioRestPost crear(){ return instrumented(CrearUsuarioRestPost.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Post.to(CREAR_EMPLEADO.toString()).
                        with(requestSpecification ->
                                requestSpecification
                                        .contentType(ContentType.JSON)
                                        .body("{" +
                                                '\"' + NAME.getClave() + '\"' + ":" + '\"' + NAME.getValor() + '\"' + "," +
                                                '\"' + JOB.getClave() + '\"' + ":" + '\"' + JOB.getValor() + '\"' +
                                                "}"
                                        )));
        Assert.assertEquals(201, SerenityRest.lastResponse().statusCode());

    }
}
