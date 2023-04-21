import java.util.Scanner;

public class Ex6 {
   // 6. Escreva uma função que recebe um array de inteiros como parâmetro e retorna o maior valor do array
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
       int max = array[0];

       for( int i =0 ; i< array.length;i++){
           if(max < array[i]){
               max=array[i];
           }
       }

        System.out.println("O valor max do array é de " + max);

    }

}
