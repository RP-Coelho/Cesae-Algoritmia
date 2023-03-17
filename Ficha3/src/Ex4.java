import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //aça um programa que leia dois números inteiros, representando os valores início e fim de um intervalo e
        //imprima os números inteiros neste intervalo

        System.out.println("Diga-me valor 1");
        int n1 = input.nextInt();
        System.out.println("Diga-me Valor 2");
        int n2 = input.nextInt();

        if (n1 < n2) {
            while (n1 <= n2) {
                System.out.println(n1);
                n1++;
            }
        } else {
            while (n2 <= n1) {
                System.out.println(n1);
                n1--;
            }

        }
    }


}
