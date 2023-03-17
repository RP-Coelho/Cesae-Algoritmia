import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
        //      Suponha que o número lido da entrada será maior que 2

        System.out.println("Diga um valor maior que 2");
        int n1 = input.nextInt();
        int n2 = 2;


        while (n2 <= n1) {
        System.out.println(n2);
        n2 += 2;
    }
    }
}