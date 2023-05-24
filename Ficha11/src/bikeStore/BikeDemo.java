package bikeStore;

import java.util.ArrayList;

public class BikeDemo {


    public static void main(String[] args) {

        //Instanciar e adiconar o array de patrocinadores//
        ArrayList<Sponsors> sponsor = new ArrayList<Sponsors>();
        Sponsors madureira = new Sponsors("Madureira");
        Sponsors angelina = new Sponsors("Angelina");
        Sponsors cin = new Sponsors("Cin");
        sponsor.add(madureira);
        sponsor.add(angelina);
        sponsor.add(cin);


        //Instanciar e adiconar o array de ferramentas//
        ArrayList<BikeTools> bikeTools = new ArrayList<BikeTools>();
        BikeTools chave = new BikeTools("Chave");
        BikeTools wd = new BikeTools("WD-40");
        BikeTools bomba = new BikeTools("Bomba de ar");
        bikeTools.add(chave);
        bikeTools.add(wd);
        bikeTools.add(bomba);


        //Instanciar o tipos de bicicleta de entrega//
        DeliveryBike biciEntregaComida = new DeliveryBike(2, 4, "Verde", 3.9f, 4.15f, 2.75f, false, 4.15f, false, sponsor);
        DeliveryBike biciEntrega = new DeliveryBike(1, 5, "Azul", 1.15f, 1.30f, 35, true, 3.5f, true, sponsor);

        //Instanciar o tipos de bicicleta de montanha//
        MountainBike biciMontanha = new MountainBike(1, 5, "Preto", 2.5f, 3.3f, 36.15f, false, 3, bikeTools, MountainBikeSuspension.DUPLA);

        // Instanciar o array de bicicletas //
        ArrayList<Bicycle> lojaBiclas = new ArrayList<Bicycle>();
        lojaBiclas.add(biciEntrega);
        lojaBiclas.add(biciMontanha);

        // Exibir os detalhes das biciletas de entrega //
        biciEntrega.exibirDetalhes();

        // Exibir os detalhes das biciletas de montanha //
        biciMontanha.exibirDetalhes();

        // Instanciar uma loja de bicicletas //
        BikeManagement lojabicicletas = new BikeManagement(lojaBiclas);

        //Vou imprimir a minha bicileta//

        System.out.println("Vou imprimir a minha bicileta");
        lojabicicletas.exibirDetalhes();


        // Adicionar uma nova bicicleta ao array de bicicletas //
        lojaBiclas.add(biciEntregaComida);
        lojaBiclas.remove(biciEntrega);
        // Atualizar o array de bicicletas //
        lojabicicletas.setBikemanagement(lojaBiclas);

        // Dados Atualizados //
        lojabicicletas.exibirDetalhes();






    }
}