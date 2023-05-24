package Pizzaria.Enums;

public enum Tamanho {

    PEQUENA,
    MEDIA,
    GRANDE;

    public static String exibirTamanhoPizza(Tamanho tamanhoPiza){
        return switch (tamanhoPiza) {
            case GRANDE -> "A Pizza é grande";
            case MEDIA -> "A Pizza é média";
            case PEQUENA -> "A Pizza é pequena";
            default -> "Não comercializamos esse tamanho";
        };
    }

}
