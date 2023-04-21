import java.util.Scanner;

public class Ex8 {
    //8. Escreva uma função que recebe um array de inteiros como parâmetro e retorna se o array está crescente

    public static Scanner input = new Scanner(System.in);

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
        public static boolean Crescente(){

            int[] array = LerArray();


            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i-1]) {
                     return false;
                }

            }

            return true;

        }

    public static void main (String[]args){

        if(Crescente()){
            System.out.println("O Array é crescente");
        }else{
            System.out.println("O Array não é crescente");
        }

    }


    }
