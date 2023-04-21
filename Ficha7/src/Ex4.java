import java.util.Scanner;

public class Ex4 {

    public static Scanner input = new Scanner(System.in);
    /* Escreva uma função que recebe uma String como parâmetro e retorna o número de palavras nessa String. */


    public static String LerFrase() {
        System.out.println("Diga-me uma frase");
        String frase = input.nextLine();


        return frase;
    }

    public static int Split(String frase) {


        String[] palavra = frase.split("\\s");




        return palavra.length;
    }


    public static void main(String[] args) {


        System.out.println("Imprime " + Split(LerFrase()));
    }

}



