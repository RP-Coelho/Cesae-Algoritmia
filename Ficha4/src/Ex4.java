import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//Escreva um programa que indique se um número pedido ao utilizador é primo. (Chamamos de número primo um
//número natural que possui dois divisores: 1 e ele mesmo)

        int n1;

        do {

            System.out.println("Diga-me qualquer numero superior a 0");
            n1 = input.nextInt();
            if (n1 < 0) {
                System.out.println("Deixa de ser parvo e coloca um numero maior que 0");

            }
        } while (n1 < 0);

        if (n1 == 2 || n1 == 3 || n1 == 5 || n1 == 7) {
            System.out.println("É um numero primo");
        } else if (n1 % 2 != 0) {
            if (n1 % 3 != 0) {
                if (n1 % 5 != 0) {
                    if (n1 % 7 != 0) {
                        System.out.println("E um numero primo!");
                    } else {
                        System.out.println("Nao e um numeo primo");
                    }
                } else {
                    System.out.println("Nao e um numeo primo");
                }
            } else {
                System.out.println("Nao e um numeo primo");
            }

        } else {
            System.out.println("Nao e um numero primo");
        }


    }
}

