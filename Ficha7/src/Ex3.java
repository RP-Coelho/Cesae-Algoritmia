import com.sun.source.tree.CompilationUnitTree;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Ex3 {
    public static Scanner input = new Scanner(System.in);
    /*Escreva uma função que recebe um array de inteiros como parâmetro e retorna um novo array que contém
apenas os valores que aparecem mais de uma vez no array original*/

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
    public static int[] Arraynduplicado(int[] LerArray) {
        int count = 0;

        for (int i = 0; i < LerArray.length; i++) {

            for (int x = i + 1; x < LerArray.length; x++) {

                if (LerArray[i] == LerArray[x]) {
                    count++;
                }

            }
        }

        if (count == 0) {
            System.out.println("O array nao tem numeros iguais");

        }

            int[] arrayduplicado = new int[LerArray.length];

            for (int i = 0; i < LerArray.length; i++) {
                for (int x = i + 1; x < LerArray.length; x++) {

                    if (LerArray[i] == LerArray[x]) {
                        arrayduplicado[i] = LerArray[i];


                    }
                }
            }

            int[] resultado = new int [count];
            for (int i=0; i < resultado.length;i++){
                for (int x=0; x < arrayduplicado.length; x++){
                    if(resultado[i]!=arrayduplicado[x]){
                        resultado[i]=arrayduplicado[x];
                    }
                }

            }

            return resultado;


    }

    public static void main(String[] args) {
        int[] resultado = Arraynduplicado(LerArray());

        for (int i = 0; i < resultado.length; i++) {
            System.out.println("" + resultado[i]);
        }
    }

}
