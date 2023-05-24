package Pizzaria.Enums;

import java.sql.SQLOutput;

public enum UnidadeMedida {
    GRAMAS,
    LITROS,
    UNIDADES;


    public static String exibirUnidadeMedida(UnidadeMedida unidade){
        return switch (unidade) {
            case GRAMAS -> "Grama";
            case LITROS -> "Litro";
            case UNIDADES -> "Unidade";
            default -> "Essa medida não existe";
        };
    }
}
