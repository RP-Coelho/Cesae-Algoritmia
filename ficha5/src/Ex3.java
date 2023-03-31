import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento
        int[] vector = new int[10];
        int x,i=0;

        System.out.println("Diga-me um numero");
        vector[0] = input.nextInt();
        i=vector[0];

        for (x=1;x<10;x++){

            System.out.println("Diga-me um numero");
            vector[x] = input.nextInt();

            if(i<vector[x]){
                i=vector[x];
            }


        }
        System.out.println(i);
    }

}
