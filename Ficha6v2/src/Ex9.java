import java.util.Scanner;

public class Ex9 {
    /* 9. Implemente um programa que contenha:
a. Uma função que pergunte o tamanho de um array a ser preenchido e o permita preencher.
b. Uma função com menu de opções que permitam invocar as funções desenvolvidas nos exercícios 6 a 8 */
    public static Scanner input = new Scanner(System.in);




    public static void main(String[] args) {



        int opcao;


        do {

            System.out.println("Diga-me uma numero?");
            int num = input.nextInt();

            do {


                System.out.println("Progama de Funções");
                System.out.println("Opções de Menus - Seleccione um número");
                System.out.println("1 - É Par?");
                System.out.println("2 - É Positivo?");
                System.out.println("3 - È Primo?");
                System.out.println("4 - Sair do Programa");

                System.out.println("Qual a opção que deseja");
                opcao = input.nextInt();

            } while (opcao < 1 || opcao > 4);

            switch (opcao) {
                case 1:
                    if (EPar(num)) {
                        System.out.println("É par");
                    } else {
                        System.out.println("É impar");
                    }
                    break;
                case 2:
                    if (EPositivo(num)) {
                        System.out.println("É positivo");
                        ;
                    } else {
                        System.out.println("É negativo");
                    }

                    break;

                case 3:
                    if (EPrimo(num)) {
                        System.out.println("É Primo");
                    } else {
                        System.out.println("Não é Primo");
                    }
                    break;

            }

            System.out.println("\n");

        } while (opcao != 4);


    }
}



