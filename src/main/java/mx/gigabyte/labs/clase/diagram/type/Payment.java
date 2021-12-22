package mx.gigabyte.labs.clase.diagram.type;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Payment {
    private Double monto;
    private LocalDate fechaDePago;

    public int procesarPago() {
        // aqui implementamos la forma general de pagar o por default
        return 0;
    }

    public static void main(String[] args) {
        
    }
}
