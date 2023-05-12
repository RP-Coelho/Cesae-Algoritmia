package bikeStore;

import java.util.ArrayList;

public class DeliveryBike extends  Bicycle{

    private float basketCapacity;
    private boolean isFrontBasket;
      private ArrayList <Sponsors> sponsors;



    public DeliveryBike(int id, int numberOfGears, String mainColor, float weelSize, float bikeLength, float price, boolean adjustableSeatPost, float basketCapacity, boolean isFrontBasket, ArrayList<Sponsors> sponsors) {
        super(id, numberOfGears, mainColor, weelSize, bikeLength, price, adjustableSeatPost);
        this.basketCapacity = basketCapacity;
        this.isFrontBasket = isFrontBasket;
        this.sponsors = sponsors;

    }

    public float getBasketCapacity() {
        return basketCapacity;
    }

    public void setBasketCapacity(float basketCapacity) {
        this.basketCapacity = basketCapacity;
    }

    public boolean isFrontBasket() {
        return isFrontBasket;
    }

    public void setFrontBasket(boolean frontBasket) {
        isFrontBasket = frontBasket;
    }

    public ArrayList<Sponsors> getSponsors() {
        return sponsors;
    }

    public void setSponsors(ArrayList<Sponsors> sponsors) {
        this.sponsors = sponsors;
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
        if(isFrontBasket){
            System.out.println("Tem cesto dianteiro");
        }else{
            System.out.println("O cesto está na traseira");
        }

        System.out.println("Capacidade do Cesto: "+this.basketCapacity);


        System.out.print("A lista de patrocinadores: ");

        for (Sponsors sponsors:this.sponsors) {
            System.out.print(sponsors.getSponsor()+"; ");

        }
        System.out.println("\n");
    }

}
