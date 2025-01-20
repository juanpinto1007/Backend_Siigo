package co.com.prueba_api_auto.certificacion.interactions;

import net.serenitybdd.screenplay.Tasks;

public class ConsumoServicios {

    public static ConGetListaCompletaDeEmpleados conGetEmpleados() {
        return Tasks.instrumented(ConGetListaCompletaDeEmpleados.class);
    }


}
