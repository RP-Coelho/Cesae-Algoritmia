public class Ex4 {
    public static void main(String[] args) {

        Imovel casa1 = new Imovel("Rua das 13 casas", "Porto", 165, 3, 2, Tipo.casa, Acabamento.altoAcabamento, 105, 10);

        Imovel casa2 = new Imovel("Rua das 12 casas", "Gaia", 185, 2, 1, Tipo.mansão, Acabamento.restauro, 255, 40);


        casa1.imprimirDescricao();

        System.out.println("-------");
        casa2.imprimirDescricao();

        if (casa1.compararImoveis(casa2) == null) {
            System.out.println("As casas tem o mesmo valor " + casa1.getValorTotal() + "€");

        } else if (casa1.compararImoveis(casa2) == casa1) {
            System.out.println("A casa 1 tem o maior valor " + casa1.getValorTotal() + "€");
            System.out.println("A casa 2 tem " + casa2.getValorTotal());

        } else {
            System.out.println("A casa 2 tem o maior valor " + casa2.getValorTotal() + "€");
            System.out.println("A casa 1 tem " + casa1.getValorTotal());
        }

        casa2.setAcabamentoImovel(Acabamento.nova);
        casa2.imovelCalculo();

        casa2.imprimirDescricao();
    }
}
