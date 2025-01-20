package co.com.prueba_api_auto.certificacion.utilidades.enums;

public enum ConcatenarMetodos {
    LISTA_COMPLETA_DE_USUARIOS("api/users?page=2"),

    ELIMINAR_EMPLEADO("api/users/2"),
    CREAR_EMPLEADO("api/users"),
    ACTUALIZAR_EMPLEADO("api/users/2");

    private final String uri;

    ConcatenarMetodos(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() { return uri; }

}



