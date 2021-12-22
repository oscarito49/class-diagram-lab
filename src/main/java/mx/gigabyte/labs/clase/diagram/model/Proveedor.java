package mx.gigabyte.labs.clase.diagram.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Proveedor {

    private String rfc;
    private String nombre;

}
