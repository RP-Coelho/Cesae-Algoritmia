import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex5 {
    /*5. Escreva um programa que leia um ficheiro de texto contendo números inteiros separados por espaço e
calcule a soma desses números*/

    public static String LerFicheiro(String x) throws FileNotFoundException {


        Scanner ficheiro = new Scanner(new File("C:/Users/sdev0223/OneDrive - CESAE/Algoritmia/FichaPratica08/" + x));
        String linha = ficheiro.nextLine();

        System.out.println(linha);
        return linha;
    }

    public static void UsarFicheiro(String linha) throws FileNotFoundException {

        int soma = 0;
        String[] numero = linha.split(" ");


        for (int i = 0; i < numero.length; i++) {
            soma += Integer.parseInt(numero[i]);

        }
        System.out.println(soma);

    }

    public static void main(String[] args) throws FileNotFoundException {
        String x = "exercicio_05_1999.txt";
        String y = "exercicio_05_31.txt";
        UsarFicheiro(LerFicheiro(x));
        UsarFicheiro(LerFicheiro(y));
    }
}
