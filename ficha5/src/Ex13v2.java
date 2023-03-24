import java.util.Scanner;

public class Ex13v2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//. Escreva um programa que lê dois arrays de tamanho 10 e gera uma matriz 10x2 com os elementos da primeira
//junto aos elementos da segunda.

        int[] y = new int[10];
        int[] x = new int[10];
        int[][] m = new int[2][10];
        int a = 0, b;

        for (b = 0; b < 10; b++) {
            a = 0;
            System.out.println("Numero " + b + " array 1");
            y[b] = x[b]  = input.nextInt();
            m[a][b] = y[b];
        }
        for (b = 0; b < 10; b++) {
            a = 0;
            System.out.println("Numero " + b + " array 2");
            x[b] = input.nextInt();
        }
        for (a = 0; a < 2; a++) {
            if (a == 0) {
                System.out.println("Numero matriz");
                for (b = 0; b < 10; b++) {
                    m[a][b] = y[b];
                    System.out.print(m[a][b]);
                }
            } else {
                System.out.println("Numero matriz");
                for (b = 0; b < 10; b++) {
                    m[a][b] = y[b];
                    System.out.print(m[a][b]);
                }
            }
            System.out.print("\n");
        }
    }
}


