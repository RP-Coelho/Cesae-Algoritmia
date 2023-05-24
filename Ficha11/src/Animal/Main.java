package Animal;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Instanciar Animais//
        Cao tobias = new Cao();
        Gato tareco = new Gato();
        Vaca milka = new Vaca();
        Porco peppa = new Porco();
        Galinha idalina = new Galinha();
        Cao secondTobias = new Cao();

        // Instanciar um novo array list e adicionar os animais ao array
        ArrayList<AnimalMae> quinta = new ArrayList<AnimalMae>();
        quinta.add(tobias);
        quinta.add(tareco);
        quinta.add(milka);
        quinta.add(peppa);
        quinta.add(idalina);
        quinta.add(new Pato());

        // Instanciar uma nova quinta com o arraylist Quitna //
        Farm quintaBill = new Farm(quinta);

        // Instanciar um novo arraylist de animais//
        ArrayList<AnimalMae> duasQuintas = new ArrayList<AnimalMae>(quinta); // adicionamos o array quinta logo no inicial
        //duasQuintas = quinta; - Igual aos dois arrays em perpetuidade
        //duasQuintas.addAll(quinta);


        // Adicionar um novo animal //
        duasQuintas.add(secondTobias);

        // Exibir os sons da quinta 1 //
        System.out.println("Quinta - Bill); ");
        quintaBill.makeNoise();

        //Instanciar uma nova Quinta //

        Farm quintaOldMcDonald = new Farm(duasQuintas);
        // Exibir os dons da quinta 2 //


        System.out.println("\n");
        System.out.println("Quinta - Old McDonald); ");
        quintaOldMcDonald.makeNoise();
    }
}
