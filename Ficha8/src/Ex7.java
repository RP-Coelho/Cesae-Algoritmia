import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex7 {
    /* 7. Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima o número de linhas e o
número de palavras presentes nesse ficheiro.*/
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

        while (ficheiro.hasNext()) {
            String frase = ficheiro.next();
            ncolunas++;



        }

        return ncolunas;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String x = "exercicio_07.txt";
        System.out.println(LinhasFicheiro(x)+" numero palavras "+ColunasFicheiro(x));

    }
}
