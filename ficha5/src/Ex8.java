import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//Implemente um programa que leia duas strings (arrays de caracteres) e verifique se estas são iguais.

        String[] z = new String[2];
        int x;

        for (x = 0; x < 2; x++) {

            System.out.println("Diga-me uma frase");
            z[x] = input.nextLine();
        }
        for (x = 1; x < 2; x++) {
            if (z[x].equals(z[x - 1])) {
                System.out.println("As frases são iguais");
            } else{
                System.out.println("As frases sao diferentes");
            }
        }

    }
}
