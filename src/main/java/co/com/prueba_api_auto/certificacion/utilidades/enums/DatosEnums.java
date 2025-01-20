package co.com.prueba_api_auto.certificacion.utilidades.enums;

public enum DatosEnums {

    NAME("name", "Juan"),
    NAME_NEW("name", "Alfonzo"),
    JOB("job", "Programador"),

    NAME_JOB("job", "zion resident");

    private final String clave;
    private final String valor;

    DatosEnums(String clave, String valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
    public String getClave() {
        return clave;
    }



}




