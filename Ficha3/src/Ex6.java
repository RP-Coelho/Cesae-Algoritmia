import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//Faça um programa que leia um número inteiro e imprima os 5 anteriores e os 5 seguintes.


        System.out.println("Numero inteiro:");
       int n1 = input.nextInt();
        int ns = n1 + 5, na = n1 - 5;
        while (ns>n1){
System.out.println(ns);
ns--;
        }
while(na<n1){
    System.out.println(na);
    na++;
}

    }
}
