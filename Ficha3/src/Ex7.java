import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //  Faça um programa que vai pedindo números ao utilizador até que este introduza o número -1. O computador
        //   deve dizer a média dos números introduzidos (excluindo o -1)

        int n1 = 0, soma = 0, count = -1;

        while (n1 != (-1)) {

            soma = soma + n1;
            count = count + 1;
            System.out.println("Diga-me um valor");
            n1 = input.nextInt();
        }

        System.out.println("Media: " + (soma / count));

    }

}