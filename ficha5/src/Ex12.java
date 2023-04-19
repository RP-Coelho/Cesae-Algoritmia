import java.util.Scanner;

public class Ex12 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Faça um programa que preencha cada posição de uma matriz (3x3 elementos inteiros) com um valor introduzido
        //pelo utilizador. Deverá indicar qual o maior e qual o menor dos valores guardados na matriz, e deverá imprimir
        ////todo o conteúdo da matriz de forma semelhante ao exercício 9.*/

        int[][] mat = new int[3][3];
        int x, y = 0, menor, maior;

        //  for (x = 0; x < 3; x++) {
        //            for (y = 0; y < 3; y++) {
        //                m[x][y] = input.nextInt();

        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                mat[x][y] = input.nextInt();

            }
        }
        menor = maior = mat[0][0];

        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {

                if (mat[x][y] > maior) {
                    maior = mat[x][y];
                }
                if (mat[x][y] < menor) {
                    menor = mat[x][y];

                }
                System.out.print(mat[x][y] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("O numero maior é " + maior);
        System.out.println("O numero menor é " + menor);
    }
}
