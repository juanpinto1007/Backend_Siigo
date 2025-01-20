package co.com.prueba_api_auto.certificacion.stepDefinitions;

import co.com.prueba_api_auto.certificacion.questions.ValidacionStatus;
import co.com.prueba_api_auto.certificacion.task.ActualizarUsuarioRestPut;
import co.com.prueba_api_auto.certificacion.task.CrearUsuarioRestPost;
import co.com.prueba_api_auto.certificacion.task.EliminarUsuarioRestDeleted;
import co.com.prueba_api_auto.certificacion.task.ListaCompletaEmpleadosRest;
import co.com.prueba_api_auto.certificacion.utilidades.GestionarDatos;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;



import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GeneralStep {

    GestionarDatos Data = new GestionarDatos();

    @Dado("que Juan quiere consumir la api de {string}")
    public void usarServicioDummy(String urlBase) throws IOException {
        Data.datosPrueba(urlBase);
        CommonStep.PrepararEscenario(Data.obtenerDatos(urlBase));
    }

    @Cuando("el consume el servicio de consulta de usuarios")
    public void elConsumeElServicioDeConsultaDeUsuarios() {
        theActorInTheSpotlight().attemptsTo(ListaCompletaEmpleadosRest.con());
    }

    @Cuando("el realiza el Consumo del servicio para la creacion con el metodo post")
    public void elRealizaElConsumoDelServicioParaLaCreacionConElMetodoPost() {
        theActorInTheSpotlight().attemptsTo(CrearUsuarioRestPost.crear());
    }

    @Cuando("el realiza el Consumo del servicio para la actualizacion del empleado {int} con el metodo put")
    public void elRealizaElConsumoDelServicioParaLaActualizacionConElMetodoPut(int id) {
        Data.guardarDatos("id", String.valueOf(id));
        theActorInTheSpotlight().attemptsTo(ActualizarUsuarioRestPut.actualizar());
    }


    @Cuando("el realiza el Consumo del servicio para la eiminación del empleado {int} con el metodo deleted")
    public void elRealizaElConsumoDelServicioParaLaEiminaciónDelEmpleadoConElMetodoDeleted(int id) {
        Data.guardarDatos("id", String.valueOf(id));
        theActorInTheSpotlight().attemptsTo(EliminarUsuarioRestDeleted.eliminar());
    }

    @Entonces("el esperara un codigo de estado {int}")
    public void elEsperaraUnCodigoDeEstado(int statusCode) {
        theActorInTheSpotlight().should(seeThat(ValidacionStatus.is(statusCode)));
    }


}
