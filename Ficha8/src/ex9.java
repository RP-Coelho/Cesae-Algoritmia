import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex9 {
/* Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima as dez palavras mais
frequentes no ficheiro*/

    public static void LerFicheiro() throws FileNotFoundException {

        Scanner file = new Scanner(new File("FichaPratica08/exercicio_09.txt"));
        String palavra = "";
        int count = 0;
        while (file.hasNextLine()) {
            palavra += file.nextLine();

        }
        System.out.println(palavra);

        String[] npalavra = palavra.split("\\.|,|\\s+");

        int[] contagem = new int[npalavra.length];
        String[][] somapalavras = new String[npalavra.length][2];

        for (int i = 0; i < npalavra.length; i++) {
            count = 1;
            for (int z = i + 1; z < npalavra.length; z++) {
                if (npalavra[i].equals(npalavra[z])) {
                  /*  somapalavras[i][0] = npalavra[i];

                    somapalavras[i][1] = count + "";*/
                    count++;

                    // System.out.println(" a palavr "+i+ " é - "+npalavra[i]+" - no indice "+z + "e a - "+ npalavra[z] + " - e a contagem e "+count);

                }

            }

            contagem[i] = count;
            somapalavras[i][0] = "" + count;

        }
        somapalavras[0][1] = npalavra[0];
        for (int i = 0; i < npalavra.length; i++) {
            for (int z = i + 1; z < npalavra.length; z++) {
                if (npalavra[i].equals(npalavra[z])) {
                    if (!npalavra[i].equals(somapalavras[i][1])) {
                        somapalavras[i][0] = npalavra[i];
                        somapalavras[i][1] =""+contagem[i];
                        System.out.println(somapalavras[i][1]);
                    }

                }
            }
        }

       /* for (int i = 0; i < (npalavra.length - 1); i++) {
            for (int z = i + 1; z < npalavra.length; z++) {
                if (contagem[z] > contagem[i]) {
                    //Trocar as palavras de ordem
                    String temp = somapalavras[i][0];
                    somapalavras[i][0] = somapalavras[z][0];
                    somapalavras[z][0] = temp;

                 /*   String temp = npalavra[i];
                    npalavra[i] = npalavra[z];
                    npalavra[z] = temp;*/


                    // Trocar a contagem de ordem
                  /*  int tempn = Integer.parseInt(somapalavras[i][1]);
                    somapalavras[i][1] = somapalavras[z][1];
                    somapalavras[z][1] = temp;

                   /* int tempn = contagem[i];
                    contagem[i] = contagem[z];
                    contagem[z] = tempn;*/


        for (int i = 0; i < 10; i++) {
            for (int z = 0; z <10; z++) {
            //    System.out.println(somapalavras[i][0] + " e " + somapalavras[i][1]);
            }
            //    System.out.println(npalavra[i] + " e " + contagem[i]);

        }

    }


    public static void main(String[] args) throws FileNotFoundException {

        try {
            LerFicheiro();
        } catch (FileNotFoundException exc) {
            System.out.println("Grande ficheiro não encontrado catano!");
        }
    }
}
