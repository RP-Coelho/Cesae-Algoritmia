package Animal;

import bikeStore.MountainBike;

import java.util.ArrayList;

public class Farm {
    private ArrayList<AnimalMae> quinta;


    public Farm(ArrayList<AnimalMae> quinta) {
        this.quinta = quinta;

    }

    public ArrayList<AnimalMae> getQuinta() {
        return quinta;
    }

    public void setQuinta(ArrayList<AnimalMae> quinta) {
        this.quinta = quinta;
    }


    public void makeNoise() {
        for (AnimalMae animal : this.quinta) {
            animal.fazerBarulho();

            /*
            switch (animal.toString()) {
                case "Cao":
                    Cao cao = (Cao) animal;
                    cao.fazerBarulho();
                    break;
                case "Galinha":
                    Galinha galinha = (Galinha) animal;
                    galinha.fazerBarulho();
                    break;
                case "Vaca":
                    Vaca vaca = (Vaca) animal;
                    vaca.fazerBarulho();
                    break;
                case "Porco":
                    Porco porco = (Porco) animal;
                    porco.fazerBarulho();
                    break;
                case "Gato":
                    Gato gato = (Gato) animal;
                    gato.fazerBarulho();
                    break;
                default:
                    AnimalMae animalMae = (AnimalMae) animal;
                    animalMae.fazerBarulho();
                    break;
                    */




        }

    }
}
