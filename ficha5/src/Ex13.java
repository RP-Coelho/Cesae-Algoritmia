import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


//. Escreva um programa que lê dois arrays de tamanho 10 e gera uma matriz 10x2 com os elementos da primeira
//junto aos elementos da segunda.

        int[] y = new int[10];
        int[] x = new int[10];
        int[][] m = new int[2][10];
        int a, b;

        for (b = 0; b < 10; b++) {
            a = 0;
            System.out.println("Numero " + b + " array 1");
            y[b] = x[b] = input.nextInt();
            m[a][b] = y[b];
        }
        for (b = 0; b < 10; b++) {
            a = 1;
            System.out.println("Numero " + b + " array 2");
            x[b] = input.nextInt();
            m[a][b] = x[b];

        }
        for (a = 0; a < 2; a++) {
            for (b = 0; b < 10; b++) {
                System.out.print(m[a][b]);
            }
        }
        System.out.print("\n");
    }
}
