import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


            ArrayList<String> listaAlimentacao= new ArrayList<>();
        listaAlimentacao.add("Peru");
        listaAlimentacao.add("Vitela");
        listaAlimentacao.add("Cordeiro");
        listaAlimentacao.add("Salmão");
        listaAlimentacao.add("Atum");
        listaAlimentacao.add("Javali");

         Animal urso = new Animal("Teddy","Peluche","USA",350,listaAlimentacao);

        System.out.println("O peso do animal é de "+ urso.getPeso() );
urso.comer("Atum",1000);

        System.out.println("O peso do animal depois de comer é de "+ urso.getPeso() );
    }



}
