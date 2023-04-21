import java.util.Scanner;

public class Ex1 {
    public static Scanner input = new Scanner(System.in);
/* Escreva uma função que recebe uma String como parâmetro e retorna verdadeiro se essa String contém
apenas letras maiúsculas e falso se contém outros caracteres.*/

    public static boolean soMaiusculas(String frase) {


        for (int i = 0; i < frase.length(); i++) {
            if (Character.isLowerCase(frase.charAt(i))) {
                return false;
            }


        }
        return true;


    }

    public static void main(String[] args) {
        System.out.println("Diga-me uma frase");
        String frase = input.next();


        if (soMaiusculas(frase)) {
            System.out.println("A palavra solicitada é so maiusculas ");

        } else {
            System.out.println("È Falso!");
        }
    }
}
