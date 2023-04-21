import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex6 {
    /*6. Escreva um programa que leia um ficheiro de texto contendo nomes e idades separados por vírgulas e
imprima o nome da pessoa mais velha na consola*/

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
        ncolunas = frase.split(",").length;


        return ncolunas;
    }

    public static String[][] LerDados(String x, int ncolunas, int nlinhas) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File("C:/Users/sdev0223/OneDrive - CESAE/Algoritmia/FichaPratica08/" + x));
        String[] coluna = new String[ncolunas];
        // String [] coluna = new String[ncolunas];
        String[][] dados = new String[nlinhas][ncolunas];
        int i = 0;


        for (i = 0; i < dados.length; i++) {
            coluna = ficheiro.nextLine().split(",");

            for (int z = 0; z < dados[0].length; z++) {
                dados[i][z] = coluna[z];


            }
        }

        return dados;
    }

    public static String MaiorNumero(String[][] dados) {
        int max = Integer.parseInt(dados[0][1]);
        int index = 0;
        for (int i = 1; i < dados.length; i++) {

            if (max < Integer.parseInt(dados[i][1])) {
                max = Integer.parseInt(dados[i][1]);
                index = i;
            }

        }
        return dados[index][0];
    }

    public static void main(String[] args) throws FileNotFoundException {
        String x = "exercicio_06.txt";
        System.out.println(MaiorNumero(LerDados(x, ColunasFicheiro(x), LinhasFicheiro(x))));

    }
}
