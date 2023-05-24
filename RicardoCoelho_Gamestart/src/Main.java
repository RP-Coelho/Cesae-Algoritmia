import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
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
    public static void menu() throws FileNotFoundException, InputMismatchException {
        Scanner sc = new Scanner(System.in);
        double lucro;
        String decisao, imp, valor;
        int top, procura, opcao, subopcao;

        do {

            do {
                System.out.println("\nBem vindo à GameStart");
                System.out.println("Por favor seleccione uma das seguintes opções\n");
                System.out.println("1 - Imprima o seu conteúdo na consola.");
                System.out.println("2 - Imprima quantas vendas foram executadas e o seu valor total.");
                System.out.println("3 - Sabendo que a GameStart tem 10% de lucro em cada jogo, calcule o total de lucro.");
                System.out.println("4 - Filtre e imprima todas as informações associadas.");
                System.out.println("5 - Imprima qual o jogo mais caro e os clientes que o compraram ");
                System.out.println("6 - Sair do Programa");
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.println("Qual a opção escolhida");
                opcao = sc.nextInt();

            } while (opcao < 1 || opcao > 7);
            switch (opcao) {
                case 1:
                    try {
                        imprimir(); // função basica de impressão de ficheiros
                    } catch (FileNotFoundException exception) {
                        System.out.println("Ficheiro não encontrado - path: Menu Principal- case 1");
                    }
                    break;
                case 2:
                    try {


                        System.out.print("\nO numero de vendas efectuado é " + (lerDados(linhas()).length - 1) + " e o total arrecadado é "); // Uso a função de ler a matriz, coloco o numero de length e retiro a linha de cabeçalho e será sempre o numero de vendas maximo
                        System.out.printf("%.2f", totalVendas(lerDados(linhas()))); // função que le a matriz anterior e calcula a soma das vendas
                        System.out.println("€ \n");
                    } catch (FileNotFoundException exception) {
                        System.out.println("Ficheiro não encontrado - path: Menu Principal- case 2");
                    }

                    break;
                case 3:
                    try {
                        lucro = 0.1;
                        System.out.print("\nO lucro da GameStart ao longo das " + (lerDados(linhas()).length - 1) + " é de ");
                        System.out.printf("%.2f", totalVendas(lerDados(linhas())) * lucro);//pego já no valor anterior e apenas multiplico pelo mesmo exercicio anterior
                        System.out.println("€ \n");
                    } catch (FileNotFoundException exception) {
                        System.out.println("Ficheiro não encontrado - path: Menu Principal- case 3");
                    }
                    break;
                case 4: // Quis complicar um pouco o pensamento e usar uma forma de filtrar com mais criterios.
                    try {
                        subopcao = menuPesquisa(); // vai buscar umuma opção para aplicar neste novo switch, podia ter colocado tudo na função "menuPesquisa" que seria talvez mais readable e apenas colocava aqui uma condição adicional com o valor "final" que a função corresse caso fosse para voltar ao menu anterior


                        switch (subopcao) {
                            case 1:
                                try {


                                    System.out.println("\n Diga-me um IdCliente para apresentar informações\n");
                                    valor = sc.next(); // input de cliente
                                    procura = 1; // em que coluna estou a buscar esta informação // caso haja mudanças na ordem de colunas, conseguimos ja com uma simples pesquisa previa passar esse novo valor como parametro
                                    imp = "2;3;4"; // colunas a imprimir, podemos adicionar ou remover ou mesmo passar essa pergunta para o utilizador
                                    imprimirUnico(distinctArray(lerDados(linhas()), procura), procura, valor, imp);
                                } catch (InputMismatchException exception) {
                                    System.out.println("Submenu - Escolha incorrecta case 1");
                                } catch (ArrayIndexOutOfBoundsException exception) {
                                    System.out.println("Submenu - Escolha incorrecta case 1 - index fora dos limites");
                                }
                                break;
                            case 2:
                                try {
                                    System.out.println("\nDiga-me o Nome do Cliente para apresentar informações\n");
                                    valor = sc.nextLine();
                                    valor = sc.nextLine();
                                    imp = "0;5;6;7;8";
                                    imprimirUnico(distinctArray(lerDados(linhas()), procura = 7), procura = 2, valor, imp);
                                } catch (InputMismatchException exception) {
                                    System.out.println("Submenu - Escolha incorrecta case 2");
                                } catch (ArrayIndexOutOfBoundsException exception) {
                                    System.out.println("Submenu - Escolha incorrecta case 2 - index fora dos limites");
                                }

                                break;
                            case 3:
                                try {
                                    System.out.println("\nDiga-me o Nome da editora para apresentar informações\n");
                                    valor = sc.nextLine();
                                    valor = sc.nextLine();
                                    imp = "5;6;7";
                                    imprimirUnico(distinctArray(lerDados(linhas()), procura = 7), procura = 5, valor, imp);
                                } catch (InputMismatchException exception) {
                                    System.out.println("Submenu - Escolha incorrecta case 3");
                                } catch (ArrayIndexOutOfBoundsException exception) {
                                    System.out.println("Submenu - Escolha incorrecta case 3 - index fora dos limites");
                                }

                                break;
                            case 4:
                                try {
                                    System.out.println("\nDiga-me o Nome da categoria para apresentar informações\n");
                                    valor = sc.nextLine();
                                    valor = sc.nextLine();
                                    imp = "2;5;6;7;8";
                                    imprimirUnico(distinctArray(lerDados(linhas()), procura = 7), procura = 6, valor, imp);
                                } catch (InputMismatchException exception) {
                                    System.out.println("Submenu - Escolha incorrecta case 3");
                                } catch (ArrayIndexOutOfBoundsException exception) {
                                    System.out.println("Submenu - Escolha incorrecta case 3 - index fora dos limites");
                                }

                                break;
                            case 5:
                                opcao = 2; //opcao para saltar logo para o menu inicial
                                break;
                        }
                    } catch (InputMismatchException exception) {
                        System.out.println("Submenu - Escolha incorrecta");
                        opcao = 2;

                    }
                    break;

                case 5:
                    try {
                        imp = "7;8";
                        System.out.println("Top de jogos");

                        top = sc.nextInt();//  imprime o top de jogos
                        imprimirResultados(topArray(distinctArray(lerDados(linhas()), procura = 7), procura = 8), imp, (top + 1)); // o +1 e para saltar a linha dos cabeçalhos


                    } catch (ArrayIndexOutOfBoundsException exception) {
                        System.out.println("Menu principal case 5 - index fora dos limites");
                    } catch (InputMismatchException exception) {
                        System.out.println("Menu principal case 5 - Escolha incorrecta");
                    }
                    System.out.println("\n\n");
                    try {
                        imp = "0;1;2;7;8";
                        top = 2;

                        String[][] valorMax = topArray(distinctArray(lerDados(linhas()), procura = 7), procura = 8); //para achar o valor maior

                        imprimirUnico(lerDados(linhas()), procura = 8, valorMax[1][8], imp); // passo o valor [1] referente ao numero mais alto para e a coluna 8 onde estao "os valores"
                        break;
                    } catch (ArrayIndexOutOfBoundsException exception) {
                        System.out.println("Menu principal case 5 - index fora dos limites");
                    }
                case 6:
                    System.out.println("Obrigado por ter usado o nosso programa.");
                    break;
            }
                if (opcao == 2) {
            } else {
                System.out.println("\nDeseja repetir o programa? Sim para seguir, outra tecla para sair");
                decisao = sc.next();
                if (decisao.equals("Sim")) { // para voltar diretamente ao menu anterior
                    opcao = 2;
                } else {
                    System.out.println("Obrigado por utilizar o programa!");
                    opcao = 6;
                }
            }
        }
        while (opcao != 6);

    }

    public static void imprimir() throws FileNotFoundException {
        // Imprimir apenas o conteudo da consola
        Scanner ficheiro = new Scanner(new File("DB/GameStart.csv"));


        while (ficheiro.hasNextLine()) {
            String line = ficheiro.nextLine();
            System.out.println(line);

        }


    }

    public static int linhas() throws FileNotFoundException {
        // Ver o numero de linhas total do ficheiro para poder atribuir o Length maximo na minha matriz
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

        // Ler os dados e coloca-los todos numa matriz
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

    public static double totalVendas(String[][] dados) throws ArrayIndexOutOfBoundsException {
        // Função simples para obter o valor das vendas
        double totalVendas = 0;

        for (int i = 1; i < dados.length; i++) {
            totalVendas += Double.parseDouble(dados[i][8]);
        }

        return totalVendas;

    }

    public static String[][] distinctArray(String[][] dados, int procura) throws ArrayIndexOutOfBoundsException {
        String[][] distinctArray = new String[dados.length][dados[0].length];
        int index = 1;


        for (int i = 1; i < dados.length; i++) {
            int flag = 0;
            for (int z = i + 1; z < dados.length; z++) {
                if (dados[i][procura].equals(dados[z][procura])) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                for (int z = 0; z < dados[0].length; z++) {
                    if (dados[i][z] != null) {
                        distinctArray[index][z] = dados[i][z];

                    }
                }
                index++;

            }

        }

        return distinctArray;
    }

    // Simples sub menu de pesquisa
    public static int menuPesquisa() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int subopcao;
        do {
            System.out.println("\nQuer pesquisar por que colune");
            System.out.println("1 - IdCliente");
            System.out.println("2 - NomeCliente");
            System.out.println("3 - Editora");
            System.out.println("4 - Categoria");
            System.out.println("5- Voltar ao menu anterior");
            System.out.println("\nQue opção deseja filtrar");

            subopcao = sc.nextInt();

        } while (subopcao < 1 || subopcao > 5);

        return subopcao;


    }

    public static void imprimirUnico(String[][] matriz, int procura, String valor, String imp) throws
            ArrayIndexOutOfBoundsException, NumberFormatException, NullPointerException {

        // Com esta funçao consigo imprimir as colunas que envio  junto com o filtro que eu quero

        String[] info = imp.split(";"); // para imprimir o parametro de string que envio paa impressao das colunas que quero
        int index;


        for (int i = 0; i < matriz.length; i++) {
            index = 0; //

            if (matriz[i][procura] != null) {
                if (matriz[i][procura].equals(valor)) { //antigamente tinha o Objects.equals porque havia momentos em que havia nulls, adicionando a condiçao de != null consegui revertar para .equals
                    for (int z = 0; z < info.length; z++) {

                        System.out.print(" | " + matriz[i][Integer.parseInt(info[index])] + " | ");

                        index++;
                    }
                    System.out.println("");
                }

            }
        }

    }

    public static void imprimirResultados(String[][] toparray, String imp, int top) throws ArrayIndexOutOfBoundsException {
        String[] info = imp.split(";"); // para imprimir o parametro de string que envio paa impressao das colunas que quero
        int index;
        for (int i = 1; i < top; i++) {
            index = 0;
            for (int z = 0; z < info.length; z++) {

                System.out.print(" | " + toparray[i][Integer.parseInt(info[index])] + " | ");

                index++;
            }
            System.out.println("");

        }
    }

    public static String[][] topArray(String[][] distinct, int procura) throws ArrayIndexOutOfBoundsException {
        String[][] temp = new String[distinct.length][distinct[0].length];
        // Fazer o top de array
        for (int x = 1; x < distinct.length - 1; x++) { // começo com a linha a 1 porque a linha 0 e as do cabeçalhos

            if (distinct[x][procura] != null) {  // coloquei este if apenas para nao haver comparações com nulls que existem na matriz
                for (int y = x + 1; y < distinct.length; y++) {
                    if (distinct[y][procura] != null) { // coloquei este if apenas para nao haver comparações com nulls que existem na matriz


                        if (Double.parseDouble(distinct[y][procura]) > Double.parseDouble(distinct[x][procura])) {

                            for (int t = 0; t < distinct[0].length; t++) { // fazer a troca de todos os valores de colunas da matriz
                                temp[x][t] = distinct[x][t];
                                distinct[x][t] = distinct[y][t];
                                distinct[y][t] = temp[x][t];


                            }
                        }
                    }
                }

            }
        }

        return distinct;
    }

    public static void main(String[] args) throws FileNotFoundException {
        try {
            menu();
        } catch (InputMismatchException exception) {

            System.out.println("Erro de input escolhido");
            System.out.println("Tente novamente");
            menu();

        } catch (FileNotFoundException exception) {
            System.out.println("Ficheiro não encontrado!");
        }

    }
}