import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Escreva um programa que lê uma matriz de tamanho 5x5 e imprima a soma de todos os elementos.
        int[][] m = new int[5][5];
        int x, y, soma=0;

        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                m[x][y] = input.nextInt();
            }
        }

        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                soma = soma + m[x][y];
            }
        }
        System.out.println("Imprima " + soma);

    }
}
