import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//Faça um programa que preencha cada posição de uma matriz 4x5 com valores inteiros introduzidos pelo
//utilizador. Deverá depois ler um outro valor do utilizador e indicar quantos vezes existe na matriz

        int[][] m = new int[4][5];
        int x, y, z, count = 0;

        for (x = 0; x < 4; x++) {
            for (y = 0; y < 5; y++) {
                m[x][y] = input.nextInt();

            }
        }
        System.out.println("Diga-me um valor");
        z = input.nextInt();

        for (x = 0; x < 4; x++) {
            for (y = 0; y < 5; y++) {
                if (z == m[x][y]) {
                    count++;
                }
            }
        }
        System.out.println("O numero apareceu " + count + " vezes");
    }


}
