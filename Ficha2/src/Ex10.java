
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//Crie um programa que mostre o menor de três números inteiros lidos

       int n1, n2, n3;
        System.out.println("Diga-me 1 valor");
        n1 = input.nextInt();
        System.out.println("Diga-me 2 valor");
        n2 = input.nextInt();
        System.out.println("Diga-me 3 valor");
        n3 = input.nextInt();

if (n1 != n2 && n2!=n3){
    if (n1<n2 && n1<n3){
        System.out.println("O menor numero é " + n1 );
    }else if (n2<n1 && n2<n3){
        System.out.println("O menor numero é "+ n2);
    } else {
        System.out.println("O menor numero é " + n3 );
    }

}

    }
}

