import java.util.Scanner;

public class Ex5 {
    /*5. Implemente um programa que contenha uma função com menu de opções que permitam invocar as funções
desenvolvidas nos exercícios 1 a 3 (ou 4), devendo o número ser escolhido antes das opções do menu.*/

    public static Scanner input = new Scanner(System.in);

    public static boolean EPar(int num){

        if(num%2==0){
            return true;
        }else{
            return false;
        }


    }

    public static boolean EPositivo (int num){

        if(num>=0){
            return true;
        }else{
            return false;
        }

    }

    public static boolean EPrimo(int num) {

        int contador = 2;

        if (num < 2) {
            System.out.println("O numero tem que ser positivo e maior que 1");
        } else {
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    contador++;

                } else {
                    return false;
                }

            }

        }
        return true;
    }

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

            switch (opcao){
                case 1:
                    if(EPar(num)){
                        System.out.println("É par");
                    }else{
                        System.out.println("É impar");
                    }
                    break;
                case 2:
                    if(EPositivo(num)){
                        System.out.println("É positivo");;
                    }else{
                        System.out.println("É negativo");
                    }

                    break;

                case 3:
                    if (EPrimo(num)){
                        System.out.println("É Primo");
                    }else{
                        System.out.println("Não é Primo");
                    }
                    break;

            }

            System.out.println("\n");

        } while (opcao != 4);


    }
}

