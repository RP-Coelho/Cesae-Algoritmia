import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ex2 {
    /*  2. Escreva um programa que crie um ficheiro de texto e escreva nele uma mensagem.*/
    public static void EscreverFicheiro() throws FileNotFoundException {

        PrintWriter file1 = new PrintWriter(new File("C:/Users/sdev0223/OneDrive - CESAE/Algoritmia/FichaPratica08/teste.txt"));
file1.print("hello!");

file1.close();
    }

    public static void main(String[] args) throws FileNotFoundException  {
        EscreverFicheiro();
    }
}
