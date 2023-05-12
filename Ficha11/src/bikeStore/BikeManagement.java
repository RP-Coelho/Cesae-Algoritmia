package bikeStore;

import java.util.ArrayList;

public class BikeManagement {

    private ArrayList<Bicycle> bikemanagement;


    public BikeManagement(ArrayList<Bicycle> bikemanagement) {
        this.bikemanagement = bikemanagement;
    }

    public ArrayList<Bicycle> getBikemanagement() {
        return bikemanagement;
    }

    public void setBikemanagement(ArrayList<Bicycle> bikemanagement) {
        this.bikemanagement = bikemanagement;
    }

    public void exibirDetalhes() {

        System.out.println("A lista de bicicletas na loja são: ");
        for (Bicycle biclas : this.bikemanagement) {

            if (biclas instanceof MountainBike) {
                MountainBike biclaMonte = (MountainBike) biclas;
                ((MountainBike) biclas).exibirDetalhes();
            }

            if (biclas instanceof DeliveryBike) {
                DeliveryBike biclaEntrega = (DeliveryBike) biclas;
                ((DeliveryBike) biclas).exibirDetalhes();
            }
        }
    }
}
