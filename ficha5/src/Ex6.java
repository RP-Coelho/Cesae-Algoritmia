import java.util.Formattable;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //6. Escreva um programa que lê um array de tamanho 10 e verifica se os elementos estão em ordem crescente.
        int[] z = new int[10];
        int i = 0, x;



        /* Se "repetir" a petiçao do numero antes do ciclo conseguimos prevenir a execuçao de dois ciclos for
        e fazer apenas executar o 2nd ciclo

         System.out.println("Diga-me numeros");
            z[x] = input.nextInt();
        for (x = 1; x < 10; x++) {
        System.out.println("Diga-me numeros");
            z[x] = input.nextInt();
            if (z[x] > z[(x - 1)]) {

            } else {
                i++;
            }

        }
         */

        for (x = 0; x < 10; x++) {
            System.out.println("Diga-me numeros");
            z[x] = input.nextInt();
        }
        for (x = 1; x < 10; x++) {
            if (z[x] > z[(x - 1)]) {

            } else {
                i++;
            }

        }

        if (i != 0) {
            System.out.println("Nao esta crescente");
        } else {
            System.out.println("Esta crescente");

        }
    }
}
