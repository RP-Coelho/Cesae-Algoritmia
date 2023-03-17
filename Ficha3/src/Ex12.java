import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//. Escreva um programa que leia uma sequência de números inteiros do utilizador e determine se a sequência
//está em ordem crescente.
        int it = 0, valor1 = 0, valor2 = 1, count = 0;

        System.out.println("Diga-me um valor:");
        int v1 = input.nextInt();

        while (it <= 3) {
            System.out.println("Diga-me um valor:");
            int v2 = input.nextInt();

            if (v1 <= v2) {
                v1 = v2;
            } else {
                count++;
            }
            it++;

        }
        if (count == 0) {
            System.out.println("Esta Crescente");
        } else {
            System.out.println("Erro nao esta!");
        }

    }
}

