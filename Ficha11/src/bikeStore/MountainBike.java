package bikeStore;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class MountainBike extends Bicycle{
    private int numberOfLights;
    private ArrayList<BikeTools> bikeTools;
    private MountainBikeSuspension suspension;

    public MountainBike(int id, int numberOfGears, String mainColor, float weelSize, float bikeLength, float price, boolean adjustableSeatPost, int numberOfLights, ArrayList<BikeTools> bikeTools, MountainBikeSuspension suspension) {
        super(id, numberOfGears, mainColor, weelSize, bikeLength, price, adjustableSeatPost);
        this.numberOfLights = numberOfLights;
        this.bikeTools = bikeTools;
        this.suspension = suspension;
    }

    public int getNumberOfLights() {
        return numberOfLights;
    }

    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    public ArrayList<BikeTools> getBikeTools() {
        return bikeTools;
    }

    public void setBikeTools(ArrayList<BikeTools> bikeTools) {
        this.bikeTools = bikeTools;
    }

    public MountainBikeSuspension getSuspension() {
        return suspension;
    }

    public void setSuspension(MountainBikeSuspension suspension) {
        this.suspension = suspension;
    }

    public void exibirDetalhes(){

        System.out.println("id: " + super.getId());
        System.out.println("Numero de mudanças: "+ super.getNumberOfGears());
        System.out.println("Cor: " + super.getMainColor());
        System.out.println("Tamanho da roda: "+super.getWeelSize());
        System.out.println("Tamanho da bicileta: "+super.getBikeLength());
        System.out.println("Preço: "+super.getPrice());
        if(super.isAdjustableSeatPost()){
            System.out.println("Tem assento ajustavel");
        }else{
            System.out.println("Não tem assendo ajustavel");
        }
        System.out.println("Numero de luzes: "+this.numberOfLights );
        System.out.println("Tipo de suspensão: " + this.suspension);
        System.out.print("As ferramentas que vão na bicicleta são: ");
        for (BikeTools tools:this.bikeTools) {
            System.out.print(tools.getBiketools()+"; ");

        }
        System.out.println("\n");
    }



}
