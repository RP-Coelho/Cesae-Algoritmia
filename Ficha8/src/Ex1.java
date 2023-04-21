import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class Ex1 {

    public static void LerF1() throws FileNotFoundException{

        Scanner file1 = new Scanner(new File("C:/Users/sdev0223/OneDrive - CESAE/Algoritmia/FichaPratica08/exercicio_01.txt"));


        System.out.println(file1.nextLine());
        System.out.println("EXPERIENCIA LINE");

    }
    public static void LerF2() throws FileNotFoundException{

        Scanner file2 = new Scanner(new File("C:/Users/sdev0223/OneDrive - CESAE/Algoritmia/FichaPratica08/exercicio_01_alternativa01.txt"));


        System.out.println(file2.nextLine());
        System.out.println("EXPERIENCIA LINE");
        System.out.println(file2.next("\n"));
        System.out.println("EXPERIENCIA NEXT");

    }

    public static void LerF3() throws FileNotFoundException{

        Scanner file3 = new Scanner(new File("C:/Users/sdev0223/OneDrive - CESAE/Algoritmia/FichaPratica08/exercicio_01_alternativa02.txt"));

while(file3.hasNext()) {
    System.out.println(file3.next("\n"));


}
    }

        public static void main(String[] args)  throws FileNotFoundException {

LerF3();
        }
    }

