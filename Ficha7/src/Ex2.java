import java.util.Scanner;

public class Ex2 {
    public static Scanner input = new Scanner(System.in);
/*Escreva uma função que recebe um array de inteiros como parâmetro e retorna um novo array que contém
apenas os valores pares desse array. (Deverá tirar partido de outra função nomeada ePar que verifica se
um número passado como parâmetro é ou não par*/


    /*(Deverá tirar partido de outra função nomeada ePar que verifica se
    um número passado como parâmetro é ou não par*/
    public static boolean EPar(int num) {

        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }


    }


    /* Ler array de inteiros*/
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


    public static int[] ArrayPar(int[] LerArray) {
int count=0;

        for (int i = 0; i < LerArray.length; i++) {
            if (EPar(LerArray[i])) {
count++;

            }
        }
        int[] arraypar = new int[count];
        int x=0;

        for (int i = 0; i < LerArray.length; i++) {
            if (EPar(LerArray[i])) {

            arraypar[x]= LerArray[i];
            x++;
            }
        }


        return arraypar;
    }

    public static void main(String[] args) {
        int [] arrayPar = ArrayPar(LerArray());


        for (int i = 0; i < arrayPar.length; i++) {
            System.out.println("\n"+arrayPar[i]);
        }

    }

}
