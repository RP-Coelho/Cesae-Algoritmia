import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //4. Escreva um programa que lê um array de tamanho 10 e encontra o menor elemento.
        int y[] = new int[10];
        int x, i = 0;

        for (x = 0; x < 10; x++) {
            i=y[x];
            System.out.println("Diga-me um numero");
            y[x] = input.nextInt();
            if (i > y[x]) {
                i = y[x];
            }

        }
        System.out.println("o menor numero " + i);
    }
}
