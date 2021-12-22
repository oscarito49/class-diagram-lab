package mx.gigabyte.labs.clase.diagram.utils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

import mx.gigabyte.labs.clase.diagram.model.Item;
import mx.gigabyte.labs.clase.diagram.model.UnidadMedida;

public class Utils {
    private static final Random random = new Random();
    private static final List<UnidadMedida> UNIDAD_MEDIDAS = List.of(UnidadMedida.GR, 
            UnidadMedida.KG,
            UnidadMedida.L,
            UnidadMedida.PIEZA);

    public static Item createRandomItem() {
        
        return Item.builder()
            .cantidad(random.nextDouble(1, 100))
            .cantidadExistente(random.nextInt(0, 200))
            .codigoSat("CODIGO SAT PEDORRO")
            .impuesto(random.nextDouble(0, 0.16))
            .ns("ns")
            .precioMayoreo(new BigDecimal(random.nextDouble(200, 1000)))
            .precioMenudeo(new BigDecimal(random.nextDouble(300, 1200)))
            .unidadMedida(UNIDAD_MEDIDAS.get(random.nextInt(0, 3)))
            .build();
    }
    
}
