package mx.gigabyte.labs.clase.diagram.model;

public enum UnidadMedida {
    KG("Kilogramo"), GR("GRAMOS"), L("Litro"), PIEZA("Pieza");

    private UnidadMedida(String descripcion) {
        this.descripcion = descripcion;
    }

    public static UnidadMedida get(String descripcion) {
        if(descripcion.toLowerCase().equals("grs")) {
            return GR;
        }

        return PIEZA;
    }

    private String descripcion;

}
