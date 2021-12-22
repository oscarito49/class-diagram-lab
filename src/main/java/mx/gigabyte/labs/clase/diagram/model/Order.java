package mx.gigabyte.labs.clase.diagram.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import mx.gigabyte.labs.clase.diagram.utils.Utils;

@Getter
@Setter
@Builder
public class Order {

    private LocalDate fecheOrden;
    private Status status;
    private List<Item> items;
    private Proveedor proveedor;
    private String folio;

    public BigDecimal precioTotal() {
        BigDecimal precioTotal = BigDecimal.ZERO;
        for(Item item : getItems()) {
            if(item.getCantidad() > 10 ) {
                precioTotal = precioTotal.add(item.getPrecioMayoreo());
            }else{
                precioTotal = precioTotal.add(item.getPrecioMenudeo());
            }
        }
        return precioTotal;
    }
    
    public static void main(String[] args) {
        var list = new ArrayList<Item>();
        for(int i = 0 ; i < 10 ; i++) {
            list.add(Utils.createRandomItem());
        }
        var order = Order.builder()
            .fecheOrden(LocalDate.now())
            .items(list)
            .status(Status.FINALIZADA)
            .proveedor(Proveedor.builder()
                .nombre("Fierros y toletes")
                .rfc("HKL98045FG")
                .build())
            .folio("FOLIO-GENERADO".concat(LocalDate.now().toString()))
            .build();
        
            System.out.println("El precio total es: " + order.precioTotal());
            order.imprimir();
    }

    public void imprimir() {

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("Nombre\t\t\t\tRFC\t\t\t\tFOLIO\n");
        
        sBuilder.append(this.proveedor.getNombre());
        sBuilder.append("\t\t");

        sBuilder.append(this.proveedor.getRfc());
        sBuilder.append("\t\t");

        sBuilder.append(this.getFolio());
        sBuilder.append("\n");

        sBuilder.append("ITEMS\n");

        sBuilder.append("Num. Item\t\t\tDescripcion\t\t\tCantidad\t\t\tprecio\n");
        var num = 1;
        for (Item item : getItems()) {
            sBuilder.append(num++);
            sBuilder.append("\t\t");

            sBuilder.append(item.getNs());
            sBuilder.append("\t\t");

            sBuilder.append(item.getCantidad());
            sBuilder.append("\t\t");

            if(item.getCantidad() > 10 ) {
                sBuilder.append(item.getPrecioMayoreo());
            }else{
                sBuilder.append(item.getPrecioMenudeo());
            }

            sBuilder.append("\t\t\n");
        }

        System.out.println(sBuilder.toString());

    }
}
