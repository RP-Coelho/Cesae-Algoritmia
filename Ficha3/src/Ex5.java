import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Faça um programa que imprima os números inteiros de 1 a 100 inclusive, e no final imprima também o valor do
        //seu somatório

        int n1 = 1, soma = 0;

        while (n1 <= 100) {
            System.out.println(n1);
            soma = soma + n1;
            n1++;
        }
        System.out.println(soma);
    }


}

