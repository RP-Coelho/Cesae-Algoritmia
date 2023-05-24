package Pizzaria2.Enums;

public enum PizzaSize {
    SMALL,
    MEDIUM,
    BIG,
    KING;


    /**
     * Metodo para passar o tamanho da Pizza como String
     * @param size - tamanho da pizza
     * @return String com uma mensagem a informar o tamanho da pizza
     */
    public static String PizzaSizetoString(PizzaSize size) {
        switch (size) {
            case SMALL: return  "A pizza é pequena";
            case MEDIUM: return  "A pizza é media";
            case BIG: return  "A pizza é grande";
            case KING: return  "A pizza é enorme";
            default: return  "Tamanho Desconhecido";
        }

    }
}
