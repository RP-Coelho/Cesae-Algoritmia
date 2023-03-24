import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento
        int[] vector = new int[10];
        int x,i=0;
        for (x=0;x<10;x++){
            i=vector[x];
            System.out.println("Diga-me um numero");
            vector[x] = input.nextInt();

            if(i<vector[x]){
                i=vector[x];
            }


        }
        System.out.println(i);
    }

}
