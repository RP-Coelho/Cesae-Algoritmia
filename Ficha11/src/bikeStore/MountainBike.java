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

        System.out.println("id: " + this.getId());
        System.out.println("Numero de mudanças: "+ this.getNumberOfGears());
        System.out.println("Cor: " + this.getMainColor());
        System.out.println("Tamanho da roda: "+this.getWeelSize());
        System.out.println("Tamanho da bicileta: "+this.getBikeLength());
        System.out.println("Preço: "+this.getPrice());
        if(this.isAdjustableSeatPost()){
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

/*

         * Metodo que recebe uma bikeTool e adiciona ao array

        public void addBikeTool(BikeTools toolToAdd){
            this.bikeTools.add(toolToAdd);

        }


         * Metodo que recebe uma ArrayList de biketools e adiconar
         *

        public void addBikeTool(ArrayList<BikeTools> toolsToAdd){
            for (BikeTools tools: toolsToAdd) {
this.bikeTools.add(tools);
            }
        }

        // Imprimir as BikeTools com o respectivo index
        public void printBikeTool(){
        int contador=0
        System.out.print("Ferramentas da Bicicleta");
        for( Biketools tools:this.biketools){

        System.out.print(contador+" - "+tool);
        contador++;
        }
        }


        // metodo par sbstituir uma ferramenta dos bikeTools

        public void setBikeTool(BikeTools toolToSet){
            Scanner input = new Scanner(System.in)

            // Imprimir na consola as ferramentas com o respetivo indice
            printBikeTools();

            ~// Ler do utilizador o indice da ferramenta a substituir
            System.out.print("Qual a ferramenta que quer substituir: ");
            int opcao = input.nextInt();

            //Substituimos as ferramentas

            this.bikeTools.set(opcao,toolToSet);

        }


        // Metodo paa remover uma ferramenta da bikeTools

        public void removeBikeTool(){
             Scanner input = new Scanner(System.in)

            printBikeTools();


            System.out.print("Qual a ferramenta que quer remover: ");
            int opcao = input.nextInt();

            this.bikeTools.remove(opcao);

       */
    }



}
