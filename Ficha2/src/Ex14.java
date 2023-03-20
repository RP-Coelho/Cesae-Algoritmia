import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

// Escreva um programa que leia 3 números, seguidamente deve colocar os números no ecrã por ordem crescente.
        double n1, n2, n3;


        System.out.println("Diga-me 1 valor");
        n1 = input.nextDouble();
        System.out.println("Diga-me 2 valor");
        n2 = input.nextDouble();
        System.out.println("Diga-me 3 valor");
        n3 = input.nextDouble();


        if (n1 != n2 && n2 != n3 && n1 != n3) {
            if (n1 < n2 && n1 < n3) {
                if (n2 < n3) {
                    System.out.println(n1 + ";" + n2 + ";" + n3);
                } else {
                    System.out.println(n1 + ";" + n3 + ";" + n2);
                }
            } else if (n2 < n1 && n2 < n3) {
                if (n1 < n3) {
                    System.out.println(n2 + ";" + n1 + ";" + n3);
                } else {
                    System.out.println(n2 + ";" + n3 + ";" + n1);
                }
            } else if (n3 < n1 && n3 < n2) {
                if (n1 < n2) {
                    System.out.println(n3 + ";" + n1 + ";" + n2);
                } else {
                    System.out.println(n3 + ";" + n2 + ";" + n1);
                }
            }
        } else {
            System.out.println("Numeros introduzidos errados!");

        }


    }
}
