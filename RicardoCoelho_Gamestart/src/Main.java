import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
/*Elabore um menu, que permita ao utilizador escolher o que pretende fazer, sendo que as opções terão de corresponder
ao número do exercício seguido da sua descrição. (Todos os exercícios devem abrir o ficheiro acima mencionado, e devem
ser uma função própria (objeto de valorização)).
    1. Imprima o seu conteúdo na consola.
    2. Imprima quantas vendas foram executadas e o seu valor total.
    3. Sabendo que a GameStart tem 10% de lucro em cada jogo, calcule o total de lucro.
    4. Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email).
    5. Dada uma Editora, imprima todos géneros e os respetivos jogos.
    6. Imprima qual o jogo mais caro e os clientes que o compraram.*/

    /* Menu de opções */
    public static void menu() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        int opcao;
        String decisao;
        do {

            do {
                System.out.println("Bem vindo à GameStart");
                System.out.println("Por favor seleccione uma das seguintes opções");
                System.out.println("1 - Imprima o seu conteúdo na consola.");
                System.out.println("2 - Imprima quantas vendas foram executadas e o seu valor total.");
                System.out.println("3 - Sabendo que a GameStart tem 10% de lucro em cada jogo, calcule o total de lucro.");
                System.out.println("4 - Dado um idCliente, imprima todas as informações associadas a esse cliente (nome, contacto, email).");
                System.out.println("5 - Dada uma Editora, imprima todos géneros e os respetivos jogos");
                System.out.println("6 - Imprima qual o jogo mais caro e os clientes que o compraram ");
                System.out.println("7 - Sair do Programa");
                System.out.println("---------------------------------");
                System.out.println("Qual a opção escolhida");
                opcao = sc.nextInt();

            } while (opcao < 1 || opcao > 7);
            switch (opcao) {
                case 1:
                    imprimir();
                    break;
                case 2:
                    System.out.print("O numero de vendas efectuado é " + (lerDados(linhas()).length - 1) + " e o total arrecadado é ");
                    System.out.printf("%.2f", totalVendas(lerDados(linhas())));
                    System.out.println("€");
                    break;
                case 3:
                    double lucro = 0.1;
                    System.out.print("O lucro da GameStart ao longo das " + (lerDados(linhas()).length - 1) + " é de ");
                    System.out.printf("%.2f", totalVendas(lerDados(linhas())) * lucro);
                    System.out.println("€");
                    break;
                case 4:
                    System.out.println("Diga-me um IdCliente para apresentar informações");
                    String id = sc.next();
                    int colunas = 1;
                    retornarLinhas(lerDados(linhas()), id, colunas);
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Obrigado por ter usado o nosso programa.");
                    break;
            }
            System.out.println("\nDeseja repetir o programa? Sim para seguir, outra tecla para sair");
            decisao = sc.next();
            if (decisao.equals("Sim")) {
                opcao = 2;
            } else {
                System.out.println("Obrigado por utilizar o programa!");
                opcao = 7;
            }
        } while (opcao != 7);

    }

    public static void imprimir() throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File("DB/GameStart.csv"));


        while (ficheiro.hasNextLine()) {
            String line = ficheiro.nextLine();
            System.out.println(line);

        }


    }

    public static int linhas() throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File("DB/GameStart.csv"));
        int linhas = 0; // para saber posteriormente o tamanho de linhas do array

        while (ficheiro.hasNextLine()) {
            String line = ficheiro.nextLine();
            linhas++;
        }

        ficheiro.close();
        return linhas;
    }

    public static String[][] lerDados(int linhas) throws FileNotFoundException {
        Scanner ficheiro = new Scanner(new File("DB/GameStart.csv"));
        String[][] dados = new String[linhas][12]; // dou um indice de colunas max, neste caso maior para poder adicionar info pertinente
        int index = 0;
        while (ficheiro.hasNextLine()) {

            String line = ficheiro.nextLine();
            String[] frase = line.split(";");
            for (int i = 0; i < frase.length; i++) {
                dados[index][i] = frase[i];


            }
            index++;
        }
        ficheiro.close();
        return dados;
    }

    public static double totalVendas(String[][] dados) throws FileNotFoundException {
        double totalVendas = 0;

        for (int i = 1; i < dados.length; i++) {
            totalVendas += Double.parseDouble(dados[i][8]);
        }

        return totalVendas;

    }

    public static void retornarLinhas(String[][] dados, String input, int coluna) throws FileNotFoundException {


        for (int x = 1; x < dados.length; x++) {
            if (input.equals(dados[x][coluna])) {
                for (int y = 0; y < dados[0].length; y++) {
                    if (dados[x][y] != null){
                        System.out.print(" | " + dados[x][y] + " | ");
                    }
                }
                System.out.println("");
            }

        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        menu();
    }
}