import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//mplemente um programa que armazene num array 10 valores pedidos ao utilizador, e retorne o maior valor par
//inserido. Caso não exista, deverá informar o utilizador.

        int[] n = new int[10];
        int x, i = 0;
        boolean c =true;

        for (x = 0; x < 10; x++) {
            System.out.println("Diga-me valores");
            n[x] = input.nextInt();

        }
        for (x = 0; x < 10; x++) {

            if (n[x] % 2 == 0) {
                c = false;
                if (i < n[x]) {
                    i = n[x];
                }

            }
        }
        if (c == false) {
            System.out.println("Imprime " + i);
        } else {
            System.out.println("Nao temos numero pares!");
        }
    }
}
