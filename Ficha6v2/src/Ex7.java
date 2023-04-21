import java.util.Scanner;

public class Ex7    {
    //7. Escreva uma função que recebe um array de inteiros como parâmetro e retorna o menor valor do array
    public static Scanner input = new Scanner(System.in);

    public static int [] LerArray(){

        System.out.println("Qual o tamanho do array");
        int x = input.nextInt();
        int [] array = new int [x];

        for (int i=0; i < x;i++){
            System.out.println("Diga-me um valor para o array["+i+"]");
            array[i] = input.nextInt();
        }


        return array;
    }

    public static void main(String[] args) {

        int [] array = LerArray();
        int min = array[0];

        for( int i =0 ; i< array.length;i++){
            if(min < array[i]){
                min=array[i];
            }
        }

        System.out.println("O valor max do array é de " + min);

    }



}
