import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex4 {
    /*4. Escreva um programa que leia um ficheiro CSV (Comma-Separated Values) e imprima o conteúdo na
consola.*/

    public static void LerFicheiro() throws FileNotFoundException {
        Scanner csv = new Scanner(new File("C:/Users/sdev0223/OneDrive - CESAE/Algoritmia/FichaPratica08/exercicio_04.csv"));

        String linha = csv.nextLine();

        while(csv.hasNextLine()){
            linha=csv.nextLine();
            System.out.println(linha);

        }


    }

    public static void main(String[] args) throws FileNotFoundException  {
        LerFicheiro();
    }


}
