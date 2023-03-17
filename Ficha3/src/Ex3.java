import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//Faça um programa que leia um número inteiro e imprima os números inteiros de 0 até este número.

        int n, y = 0;
        System.out.println("Diga-me um numero");
        n = input.nextInt();

        if (n > y) {

            while (y < n) {
                System.out.println(y);
                y++;
            }
        } else {
            while (y > n) {
                System.out.println(y);
                y--;
            }
        }


    }
}