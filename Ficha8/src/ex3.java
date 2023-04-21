import com.sun.source.tree.NewArrayTree;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.PrintWriter;
import java.util.Scanner;

public class ex3 {

    /*3. Escreva um programa que leia o conteúdo de um ficheiro de texto e grave-o num outro arquivo.*/
    public static void LerFicheiro() throws FileNotFoundException {

        File file1 = new File("C:/Users/sdev0223/OneDrive - CESAE/Algoritmia/FichaPratica08/exercicio_01_Alternativa01.txt");

        Scanner LerFile1 = new Scanner(file1);
        String paragrafo = LerFile1.nextLine();

        while (LerFile1.hasNextLine()) {
            paragrafo += LerFile1.nextLine();
        }

        File file2 = new File("C:/Users/sdev0223/OneDrive - CESAE/Algoritmia/FichaPratica08/file1_teste.txt");

        PrintWriter escreverFile1 = new PrintWriter(file2);
        escreverFile1.println(paragrafo);

        escreverFile1.close();
        LerFile1.close();

    }

    public static void main(String[] args) throws FileNotFoundException {
        LerFicheiro();
    }
}
