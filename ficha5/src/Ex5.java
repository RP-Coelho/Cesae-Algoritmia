import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //5. Escreva um programa que lê um array de tamanho 10 e calcula a média dos elemento

        int[] z = new int[10];
        int x, soma = 0, count = 0;
        for (x = 0; x < 10; x++) {
            System.out.println("Diga-me os valores");
            z[x] = input.nextInt();
            soma = soma + z[x];
            count++;
        }
        System.out.println("O valor da media é "+ (soma/count));
    }
}
