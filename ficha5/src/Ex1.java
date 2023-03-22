import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//Implemente um programa que permita adicionar 10 números inteiros a um array e que os imprima pela ordem
//de inserção.

        int x, i = 0;
        int[] v = new int[10];



        for (i = 0; i < 10; i++) {
            System.out.println("Introduza numeros!");
            v[i] = input.nextInt();


        }
        for (i = 0; i < 10; i++) {
            System.out.println(v[i]);

        }
    }
}
