
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //1. Escreva um programa que leia dois números reais e pergunte ao utilizador qual a operação aritmética que quer
        //realizar e apresente o resultado. O utilizador deve responder usando o símbolo da operação (exemplo: para fazer
        //a soma, o utilizador deve escrever ‘+’). Se for inválido apresente erro.

        double n1, n2, total;
        String op;
        System.out.println("Diga-me 1 valor");
        n1 = input.nextDouble();
        System.out.println("Diga-me a operação");
        op = input.next();
        System.out.println("Diga-me 2 valor");
        n2 = input.nextDouble();


      switch(op){
          case "+":
              total=n1+n2;
              System.out.println("A soma é " + total);
              break;
          case "-":
              total=n1-n2;
              System.out.println("A subtração é "+ total);
              break;
          case "*":
              total=n1*n2;
              System.out.println("A multiplicação é " +total);
              break;
          case "/":
              total=n1/n2;
              System.out.println("A divisão é " + total);

          default:
              System.out.println("Operação errado tente de novo");
      }


    }
}