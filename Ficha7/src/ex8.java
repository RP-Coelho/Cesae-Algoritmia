import java.util.Scanner;

public class ex8 {
    public static Scanner input = new Scanner(System.in);
    /*8. Escreva uma função que recebe um array de inteiros como parâmetro e retorna o segundo maior valor
desse array.*/
    public static int[] LerArray() {

        System.out.println("Qual o tamanho do array");
        int x = input.nextInt();
        int[] array = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.println("Diga-me um valor para o array[" + i + "]");
            array[i] = input.nextInt();
        }


        return array;
    }



    public static void main(String[] args) {

    }

}
