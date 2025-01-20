package co.com.prueba_api_auto.certificacion.stepDefinitions;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CommonStep {

    public static void PrepararEscenario(String urlBase) {
        OnStage.setTheStage(new OnlineCast());
       theActorCalled("Juan").whoCan(CallAnApi.at(urlBase));
    }
}
