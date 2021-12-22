package mx.gigabyte.labs.clase.diagram.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import mx.gigabyte.labs.clase.diagram.type.Address;

@Getter
@Setter
@ToString
public class Customer {
    private String name;
    private Address address;
    
}
