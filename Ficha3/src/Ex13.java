import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//Escreva um programa que calcule e imprima o fatorial de um número inteiro não-negativo n. Utilize o ciclo
//while

        System.out.println("Diga-me um valor");
        int n1 = input.nextInt();
        int ft = 1;
        while (0 < n1) {

            ft = ft * n1;
            n1--;


        }
        System.out.println(ft);
    }
}
