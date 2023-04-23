import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex11 {

    /*11. Escreva um programa que leia um ficheiro CSV contendo informações de músicas (nome, artista, género,
duração) para uma matriz.
            a. Crie um menu com opções, sendo que cada uma delas albergará as seguintes alíneas. - Feito
            b. Pesquisar por músicas de um determinado género.
            c. Pesquisar músicas de um determinado artista.
            d. Pesquisar música com maior duração.
            e. Pesquisar músicas com duração acima de um valor especificado.
            f. Número de músicas no ficheiro*/


    public static int nlinhas() throws FileNotFoundException {

        Scanner ficheiro = new Scanner(new File("FichaPratica08/exercicio_11.csv"));

        int nlinhas = 0;


        while (ficheiro.hasNextLine()) {
            String line = ficheiro.nextLine();
            nlinhas++;

        }

        return nlinhas;


    }

    public static String[][] LerFicheiro(int nlinhas) throws FileNotFoundException {

        Scanner ficheiro = new Scanner(new File("FichaPratica08/exercicio_11.csv"));
        int z = 0;
        String[][] dados = new String[nlinhas][4];

        while (ficheiro.hasNextLine()) {
            String line = ficheiro.nextLine();
            String[] colunas = line.split(",");
            for (int i = 0; i < colunas.length; i++) {
                dados[z][i] = colunas[i];
            }
            z++;

        }

        return dados;
    }

    public static void Genero(String [][] dados) throws FileNotFoundException{

        do{
            System.out.println("Os generos de musicas existentes são");
            System.out.println("Rock");
        }


    }


    public  static   void Menu (){
        Scanner sc = new Scanner(System.in);
        /*   a. Crie um menu com opções, sendo que cada uma delas albergará as seguintes alíneas.
            b. Pesquisar por músicas de um determinado género.
            c. Pesquisar músicas de um determinado artista.
            d. Pesquisar música com maior duração.
            e.
            f. Número de músicas no ficheiro*/
        int opcao;
        do {
            do {
                System.out.println("1 - Pesquisar por músicas de um determinado género");
                System.out.println("2 - Pesquisar músicas de um determinado artista.");
                System.out.println("3 - Pesquisar música com maior duração");
                System.out.println("4 - Pesquisar músicas com duração acima de um valor especificado.");
                System.out.println("5 - Número de músicas no ficheiro");
                System.out.println("6 - Sair do programa");
            opcao=sc.nextInt();

            }while (opcao<1 || opcao>6);
                switch (opcao){
                    case 1:

                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;

                }
            System.out.println("Deseja fazer outra operação");
        }while (opcao!=6);



    }
}
