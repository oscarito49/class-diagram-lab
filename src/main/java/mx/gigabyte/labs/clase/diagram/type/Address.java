package mx.gigabyte.labs.clase.diagram.type;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Address {
    private String calle;
    private String numInterior;
    private String numExterior;
    private String codigoPostal;
    private Estado estado;
}
