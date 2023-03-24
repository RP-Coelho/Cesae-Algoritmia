import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//Escreva um programa que lê uma matriz de tamanho 4x4 e encontra a soma dos elementos da diagonal principal
        int[][] m = new int[4][4];
        int x, y, soma = 0;

        for (x = 0; x < 4; x++) {
            for (y = 0; y < 4; y++) {
                System.out.println("Numero " + x + " array " + y + " ?");
                m[x][y] = input.nextInt();
            }
        }

        for (x = 0; x < 4; x++) {
            for (y = 0; y < 4; y++) {
                if (x == y) {
                    soma = soma + m[x][y];
                }


            }
        }
        System.out.println("A soma é " + soma);
    }
}