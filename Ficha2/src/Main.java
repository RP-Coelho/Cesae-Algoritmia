
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Escreva um programa que leia três notas (0-20 valores) de um aluno, calcule a sua média final ponderada, e diga
        //se está aprovado ou não (mais de 9.5). Ponderações: Nota 1: 25%; Nota 2: 35%; Nota 3:40%

        double n1, n2, n3, mp;
        System.out.println("Diga-me 1 valor");
        n1 = input.nextDouble();
        System.out.println("Diga-me 2 valor");
        n2 = input.nextDouble();
        System.out.println("Diga-me 3 valor");
        n3 = input.nextDouble();

        mp = (n1 * 0.25 + n2 * 0.35 + n3 * 0.4);


        if (mp >= 9.5) {
            System.out.println("Esta aprovado! " +mp );
        } else {
            System.out.println("Reprovado!");


        }


    }


}