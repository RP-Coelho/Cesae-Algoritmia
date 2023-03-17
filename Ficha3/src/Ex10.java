import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//Escreva um algoritmo que leia uma quantidade desconhecida de números inteiros positivos fornecida pelo
//utilizador e conte quantos deles estão nos seguintes intervalos: [0.25], [26,50], [51,75] e [76,100]. A entrada de
//dados deve terminar quando for lido um número negativo


        int n1 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        System.out.println("Diga-me um valor");
        n1 = input.nextInt();
        while (n1 >= 0) {
            ;
            if (n1 <= 25) {
                count1++;
            } else if (n1 <= 50) {
                count2++;
            } else if (n1 <= 75) {
                count3++;
            } else {
                count4++;
            }
            System.out.println("Diga-me um valor");
            n1 = input.nextInt();
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
    }
}