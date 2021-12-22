package mx.gigabyte.labs.clase.diagram.model;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Item {
    private UnidadMedida unidadMedida;
    private double cantidad;
    private BigDecimal precioMenudeo;
    private BigDecimal precioMayoreo;
    private String ns;
    private Categoria categoria;
    private int cantidadExistente;
    private String codigoSat;
    private double impuesto;
    private boolean isExento;
}
