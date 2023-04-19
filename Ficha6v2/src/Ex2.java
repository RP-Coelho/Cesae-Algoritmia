import java.util.Scanner;

public class Ex2 {
    public static Scanner input = new Scanner(System.in);
        //2. Implemente uma função que determine se um número (passado por argumento) é positivo ou negativo

    public static boolean EPositivo (int num){

        if(num>=0){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println("Diga-me o valor");
        int num= input.nextInt();


        if(EPositivo(num)){
            System.out.println("É positivo");;
        }else{
            System.out.println("É negativo");
        }




    }


}
