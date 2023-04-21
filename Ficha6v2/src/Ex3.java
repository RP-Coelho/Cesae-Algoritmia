import java.util.Scanner;

public class Ex3 {
    //  3. Implemente uma função que determine se um número (passado por argumento) é ou não primo.
    public static Scanner input = new Scanner(System.in);

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


        System.out.println("Diga-me o valor");
        int num = input.nextInt();
if (EPrimo(num)){
    System.out.println("É Primo");
}else{
    System.out.println("Não é Primo");
}

    }

}
