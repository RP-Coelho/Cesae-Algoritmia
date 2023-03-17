import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Faça um algoritmo que leia dois números inteiros, representando os valores início e fim de um intervalo e
        //imprima os múltiplos de 5 entre eles

        System.out.println("Diga-me um valor");
        int n1 = input.nextInt();
        System.out.println("Diga-me outro valor");
        int n2 = input.nextInt();
        int count = 0;

        if (n1 < n2) {
            while (n1 <= n2) {
                if (n1 % 5 == 0) {
                    System.out.println(n1);
                }
                n1++;
            }
        } else {
            while (n2 <= n1) {
                if (n2 % 5 == 0) {
                    System.out.println(n2);
                }
                n2++;
            }
        }

    }
}
