package co.com.prueba_api_auto.certificacion.questions;

import co.com.prueba_api_auto.certificacion.utilidades.GestionarDatos;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.junit.Assert;



public class ValidacionStatus implements Question<Boolean> {

    GestionarDatos Data = new GestionarDatos();

    private final int statusCode;
    private boolean statusCodeResponse = true;

    public ValidacionStatus(int statusCode) {
        this.statusCode = statusCode;
    }

    public static ValidacionStatus is(int statusCode) {
        return new ValidacionStatus(statusCode);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Assert.assertEquals(statusCode, SerenityRest.lastResponse().statusCode());
        return statusCodeResponse;
    }

}
