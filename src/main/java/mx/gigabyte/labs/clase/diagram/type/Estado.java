package mx.gigabyte.labs.clase.diagram.type;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import lombok.Getter;

@Getter
public enum Estado {

    AGUASCALIENTES("Aguascalientes", "Aguascalientes"),
    CDMX("CDMX", "CDMX"),
    ESTADO_MEXICO("Estado de Mexico", "Toluca"),
    BAJA_CALIFORNIA("Baja California", "Mexicali");

    private final String estado;
    private final String capital;

    private static final Map<String, Estado> estadosCache = Arrays.stream(Estado.values())
        .collect(Collectors.toMap(Estado::getEstado, Function.identity()));

    Estado(String desc, String capital) {
        this.estado = desc;
        this.capital = capital;
    }

    public static Estado get(String estadoDescripcion) {
        return estadosCache.get(estadoDescripcion);
    }
}
