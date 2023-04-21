import java.util.Scanner;

public class Ex7 {

    public static Scanner input = new Scanner(System.in);
    /* 7. Escreva uma função que recebe uma String como parâmetro e retorna a mesma String com todas as vogais
em minúsculo e todas as consoantes em maiúsculo.*/


    public static String LerFrase() {
        System.out.println("Diga-me uma frase");
        String frase = input.nextLine();


        return frase;
    }

    public static String maiusculas(String frase) {

    String fraseM = frase.toUpperCase();

        System.out.println("A frase" + fraseM);
        for (int i = 0; i < fraseM.length(); i++) {
            switch (fraseM.charAt(i)) {
                case 65:
                    Character.toLowerCase(fraseM.charAt(i));
                    break;
                case 69:
                    Character.toLowerCase(fraseM.charAt(i));
                    break;
                case 73:
                    Character.toLowerCase(fraseM.charAt(i));
                    break;
                case 79:
                    Character.toLowerCase(fraseM.charAt(i));
                    break;
                case 85:
                    Character.toLowerCase(fraseM.charAt(i));
                    break;
            }

        }

return  fraseM;
    }

    public static void main(String[] args) {

        System.out.println( maiusculas(LerFrase()));

    }

}
