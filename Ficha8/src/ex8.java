import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex8 {
    /*8. Escreva um programa que leia o conteúdo de um ficheiro de texto e grave apenas as linhas que contêm
    uma palavra específica num outro ficheiro.*/
    public static int LinhasFicheiro(String x) throws FileNotFoundException {

        Scanner ficheiro = new Scanner(new File("C:/Users/sdev0223/OneDrive - CESAE/Algoritmia/FichaPratica08/" + x));
        int nlinhas = 0;
        while (ficheiro.hasNextLine()) {
            ficheiro.nextLine();

            nlinhas++;


        }

        return nlinhas;
    }

    public static int ColunasFicheiro(String x) throws FileNotFoundException {

        Scanner ficheiro = new Scanner(new File("C:/Users/sdev0223/OneDrive - CESAE/Algoritmia/FichaPratica08/" + x));
        int ncolunas = 0;
        String frase = ficheiro.nextLine();
        ncolunas = frase.split(" ").length;

        while (ficheiro.hasNextLine()) {
            frase = ficheiro.nextLine();

            if (ncolunas < frase.split(" ").length) {
                ncolunas = frase.split(" ").length;
            }
        }
        return ncolunas;
    }

    public static String[][] LerDados(String x, int ncolunas, int nlinhas) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File("C:/Users/sdev0223/OneDrive - CESAE/Algoritmia/FichaPratica08/" + x));
        String[] coluna = new String[ncolunas];
        String[][] dados = new String[nlinhas][ncolunas];
     //   System.out.println("colunas sao "+ncolunas);
      //  System.out.println("linhas sao "+nlinhas);


        for (int i = 0; i < dados.length; i++) {
            coluna = ficheiro.nextLine().split(" ");

            for (int z = 0; z < coluna.length; z++) {
                dados[i][z] = coluna[z];
               // System.out.println("a palavra impressas na linha sao na matriz["+i+"]["+z+"] é "+ coluna[z]);

            }
        }


        return dados;
    }

    public static int[] PalavraIgual(String[][] dados) {


        String palavra = "Vitor";
        int[] frase = new int[dados.length];
        int index = 0;
        for (int i = 0; i < dados.length; i++) {
        frase[i] = index;
            for (int z = 0; z < dados[0].length; z++) {

                if (palavra.equals(dados[i][z])) {
                    System.out.println("TRUE na matriz referente a ["+i+"]["+z+"]");
                }

            }
        }
        for (int i = 0; i < frase.length; i++) {
            System.out.println("Matriz da frase"+frase[i]);
        }




        return frase;
    }


    public static void main(String[] args) throws FileNotFoundException {
        String x = "exercicio_07.txt";

        PalavraIgual(LerDados(x,ColunasFicheiro(x),LinhasFicheiro(x)));
    }
}
