import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//mplemente um programa que permita adicionar 9 números inteiros a uma matriz 3x3 e que os imprima com o
//seguinte aspeto gráfico (exemplo):
        int[][] m = new int[3][3];
        int x, y = 0;

        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                m[x][y] = input.nextInt();
            }
        }
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                System.out.print(m[x][y]+" ");

            }
            System.out.print("\n");
        }
    }
}
