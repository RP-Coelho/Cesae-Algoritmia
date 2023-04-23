import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ex8 {
    /*8. Escreva um programa que leia o conteúdo de um ficheiro de texto e grave apenas as linhas que contêm
    uma palavra específica num outro ficheiro.*/
    public static int LinhasFicheiro(String x) throws FileNotFoundException {

        Scanner ficheiro = new Scanner(new File("FichaPratica08/" + x));
        int nlinhas = 0;
        while (ficheiro.hasNextLine()) {
            ficheiro.nextLine();

            nlinhas++;


        }
        ficheiro.close();
        return nlinhas;
    }

    public static int ColunasFicheiro(String x) throws FileNotFoundException {

        Scanner ficheiro = new Scanner(new File("FichaPratica08/" + x));
        int ncolunas = 0;
        String frase = ficheiro.nextLine();
        ncolunas = frase.split(" ").length;

        while (ficheiro.hasNextLine()) {
            frase = ficheiro.nextLine();

            if (ncolunas < frase.split("\\s|,").length) {
                ncolunas = frase.split("\\s|,").length;
            }
        }
        ficheiro.close();
        return ncolunas;
    }

    public static String[][] LerDados(String x, int ncolunas, int nlinhas) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File("FichaPratica08/" + x));
        String[] coluna = new String[ncolunas];
        String[][] dados = new String[nlinhas][ncolunas];
        //   System.out.println("colunas sao "+ncolunas);
        //  System.out.println("linhas sao "+nlinhas);


        for (int i = 0; i < dados.length; i++) {
            coluna = ficheiro.nextLine().split("\\s|,");

            for (int z = 0; z < coluna.length; z++) {
                dados[i][z] = coluna[z];
                // System.out.println("a palavra impressas na linha sao na matriz["+i+"]["+z+"] é "+ coluna[z]);

            }
        }

        ficheiro.close();
        return dados;
    }

    public static String[] PalavraIgual(String[][] dados) throws FileNotFoundException {


        String palavra = "Vitor";

        String index = "";
        for (int i = 0; i < dados.length; i++) {

            for (int z = 0; z < dados[0].length; z++) {

                if (palavra.equals(dados[i][z])) {

                    index += i + ",";
                    System.out.println("TRUE na matriz referente a [" + i + "][" + z + "]");

                }

            }
        }

        String[] frase = index.split(",");


        return frase;


    }

    public static void PrintFicheiro(String x, String[] frase, int nlinhas) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File("FichaPratica08/" + x));
        PrintWriter file = new PrintWriter(new File("FichaPratica08/Vitor_repetido.txt"));

        String[] p = new String[nlinhas];
        int i = 0;
        while (ficheiro.hasNextLine()) {
            p[i] = ficheiro.nextLine();
            i++;

        }

        for (i = 0; i < frase.length; i++) {

                file.println(p[Integer.parseInt(frase[i])]+"\n");
            }




        ficheiro.close();
        file.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        String x = "exercicio_07.txt";




        PrintFicheiro(x,PalavraIgual(LerDados(x,ColunasFicheiro(x),LinhasFicheiro(x))),LinhasFicheiro(x));

    }
}