
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//Faça um programa que leia um horário no sistema de 24 horas e imprima esse horário no sistema de 12 horas.
//Exemplo: Valores Lidos: 22 32 Resultado: 10 32 PM
//Valores Lidos: 10 44 Resultado: 10 44 AM

        int h, m;

        System.out.println("Diga-me as horas");
        h = input.nextInt();
        System.out.println("Valor os minutos");
        m = input.nextInt();

        if (m < 60 && m >= 0 && h > -1) {
            if (h == 0 ) {
                System.out.println("As horas sao "+(h+12) + ":" + m + "AM");
            } else if (h == 12) {
                System.out.printf("As horas sao " + h + ":" + m + "PM");
            } else if (h < 12) {
                System.out.println("As horas sao " + h + ":" + m + "AM");
            } else {
                System.out.println("As horas sao " + (h - 12) + ":" + m + "PM");
            }
        } else {
            System.out.println("Introduçao de horas erradas!");
        }

    }
}




