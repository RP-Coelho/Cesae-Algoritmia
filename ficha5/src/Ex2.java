import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//Implemente um programa que permita adicionar o preço de produtos a um array de tamanho 10 e calcular o seu
//total.
        double [] vector = new double [10];
        int x;
        double i=0;

        for(x=0;x<10;x++){
            System.out.println("Diga-me os preços");
            vector[x]= input.nextDouble();
        }
        for(x=0;x<10;x++) {
            i = i + vector[x];
        }
        System.out.println("O preço total é "+ i + "€");



    }
}
