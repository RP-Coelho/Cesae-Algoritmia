import java.util.Scanner;


public class Ex1 {
    public static Scanner input = new Scanner(System.in);



    // 1. Implemente uma função que determine se um número (passado por argumento) é par ou ímpar

public static boolean EPar(int num){

    if(num%2==0){
        return true;
    }else{
        return false;
    }


    }

public static void main( String [] args){

    System.out.println("Introduza o valor");
    int num= input.nextInt();

    if(EPar(num)){
        System.out.println("É par");
    }else{
        System.out.println("É impar");
    }

    }


}
