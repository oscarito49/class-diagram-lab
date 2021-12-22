package mx.gigabyte.labs.clase.diagram.type;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Cash extends Payment {
    private String conversion;

    @Override
    public int procesarPago() {
        int datoPapa = super.procesarPago();
        return 100;
    }
}
