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
        String[][] dados = new String[nlinhas][7];

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

    public static String[] Genero(String[][] dados) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String[] generos = new String[dados.length];

        int count = 1;
        generos[0] = dados[0][2];

        for (int i = 1; i < dados.length; i++) {
            int flag = 0;
            for (int z = i + 1; z < dados.length; z++) {

                if (dados[i][2].equals(dados[z][2])) {
                    flag = 1;
                    break;

                }
            }
            if (flag == 0) {
                generos[count] = dados[i][2];
                //     System.out.println("generos -"+generos[count]);
                count++;
            }

        }

     /*   for (int i = 0; i < generos.length; i++) {
            System.out.println(generos[i]);
        }*/
        return generos;
    }

    public static String [][] TopMusica(String[][] dados, int topMusica) throws FileNotFoundException {
        dados[0][4] = "Minutos";
        dados[0][5] = "Segundos";
        dados[0][6] = "Total em s";
        String[] duracao = new String[dados.length];

        for (int i = 1; i < dados.length; i++) {
            duracao = dados[i][3].split(":");
            for (int z = 0; z < duracao.length; z++) {
                dados[i][z + 4] = duracao[z];
            }
            dados[i][6] = ((Integer.parseInt(dados[i][4]) * 60) + Integer.parseInt(dados[i][5])) + "";
        }

        //Ordenar tudo por top musica
        for (int x = 1; x < dados.length - 1; x++) {
            for (int z = x + 1; z < dados.length; z++) {

                if (Integer.parseInt(dados[z][6]) > Integer.parseInt(dados[x][6])) { // condiçao para ver se a linha 1 e maior que a linha 0 e por ai fora

                    // Trocar as colunas da matriz
                    for (int y = 0; y < dados[0].length; y++) {
                        String[][] temporaria = new String[dados.length][dados[0].length];

                        temporaria[x][y] = dados[x][y];
                        dados[x][y] = dados[z][y];
                        dados[z][y] = temporaria[x][y];


                    }
                }
            }
        }

        System.out.println("O top de musicas escolhida de " + topMusica + "é o seguinte");
        for (int i = 0; i < topMusica + 1; i++) {
            for (int z = 0; z < dados[0].length; z++) {


                System.out.print(dados[i][z] + "||");
            }
            System.out.println("");

        }

return dados;
    }

    public static String[] artista(String[][] dados) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        String[] artista = new String[dados.length];

        int count = 1;
        artista[0] = dados[0][1];

        for (int i = 1; i < dados.length; i++) {
            int flag = 0;
            for (int z = i + 1; z < dados.length; z++) {

                if (dados[i][1].equals(dados[z][1])) {
                    flag = 1;
                    break;

                }
            }
            if (flag == 0) {
                artista[count] = dados[i][1];
                count++;

            }
        }
     /*   for (int i = 0; i < artista.length; i++) {
            System.out.println(artista[i]);
        }*/

        return artista;
    }


    public static void Menu(String[] generos, String[] artista, String[][] dados) throws FileNotFoundException {
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
                System.out.println("\n");
                System.out.println("1 - Pesquisar por músicas de um determinado género");
                System.out.println("2 - Pesquisar músicas de um determinado artista.");
                System.out.println("3 - Pesquisar música com maior duração");
                System.out.println("4 - Pesquisar músicas com duração acima de um valor especificado.");
                System.out.println("5 - Número de músicas no ficheiro");
                System.out.println("6 - Sair do programa");
                System.out.println("------------");
                System.out.println("Qual a opçao escolhida?");
                opcao = sc.nextInt();

            } while (opcao < 1 || opcao > 6);
            switch (opcao) {
                case 1:

                    do {
                        System.out.println("Os generos de musicas existentes são");
                        for (int i = 1; i < generos.length; i++) {
                            if (generos[i] != null) {
                                System.out.println((i) + " - \"" + generos[i]+"\"");
                            }
                        }
                        System.out.println("10 - para voltar ao menu anterior ");
                        opcao = sc.nextInt();
                        if (generos[opcao] == null) {
                            System.out.println("Genero não encontrado. Tente novamente \n");
                            opcao = 65;

                        }

                    } while (opcao < 0 || opcao > generos.length);
                    if (opcao != generos.length) {

                        for (int i = 0; i < dados.length; i++) {
                            if (dados[i][2].equals(generos[opcao])) {
                                for (int z = 0; z < 4; z++) {
                                    System.out.print(dados[i][z] + " || ");

                                }
                                System.out.println("");
                            }

                        }

                    }
                    break;


                case 2:

                    do {
                        System.out.println("Os Artistas de musicas existentes são");
                        for (int i = 1; i < artista.length; i++) {
                            if (artista[i] != null) {
                                System.out.println((i) + "- \"" + artista[i]+"\"");
                            }

                        }
                        System.out.println(artista.length + " - para voltar ao menu anterior ");
                        opcao = sc.nextInt();
                        if (artista[opcao] == null) {
                            System.out.println("Artista não encontrado. Tente novamente \n");
                            opcao = 65;
                        }
                    } while (opcao < 0 || opcao > artista.length);
                    if (opcao != artista.length) {
                        for (int i = 0; i < dados.length; i++) {
                            if (dados[i][1].equals(artista[opcao])) {
                                for (int z = 0; z < 4; z++) {
                                    System.out.print(dados[i][z] + " || ");

                                }
                                System.out.println("");


                            }

                        }
                    }
                    break;


                case 3:
                    System.out.println("Qual e o TOP que quer ver");
                    int topMusica = sc.nextInt();
                    TopMusica(LerFicheiro(nlinhas()), topMusica);

                    break;
                case 4:
                    System.out.println("Qual a duração da musica? Em formato M:S ex 3:50");
                    String duracao = sc.next();
                    String[] segundos = duracao.split(":");
                    int totalSegundos = Integer.parseInt(segundos[0]) * 60 + Integer.parseInt(segundos[1]);
musicaDuracao(LerFicheiro(nlinhas()),totalSegundos);

                    break;
                case 5:
                    System.out.println("O numero existente é de " + dados.length + " musicas.");
                    break;

            }

        } while (opcao != 6);


    }

    public static void musicaDuracao(String[][] dados, int totalSegundos) throws FileNotFoundException {
        dados[0][4] = "Minutos";
        dados[0][5] = "Segundos";
        dados[0][6] = "Total em s";
        String[] duracao = new String[dados.length];

        for (int i = 1; i < dados.length; i++) {
            duracao = dados[i][3].split(":");
            for (int z = 0; z < duracao.length; z++) {
                dados[i][z + 4] = duracao[z];
            }
            dados[i][6] = ((Integer.parseInt(dados[i][4]) * 60) + Integer.parseInt(dados[i][5])) + "";
        }




        for (int i = 1; i < dados.length; i++) {

        //    System.out.println(dados[i][6]);
                if (Integer.parseInt(dados[i][6]) > totalSegundos) {
                    System.out.println("");
                    for (int z = 0; z < 4; z++) {
                        System.out.print(dados[i][z] + " || ");
                    }
                }

            }
        }



    public static void main(String[] args) throws FileNotFoundException {
        try {
            Menu(Genero(LerFicheiro(nlinhas())), artista(LerFicheiro(nlinhas())), LerFicheiro(nlinhas()));
            // Genero(LerFicheiro(nlinhas()));
            // artista(LerFicheiro(nlinhas()));
        } catch (FileNotFoundException exc) {
            System.out.println("Grande ficheiro não encontrado catano!");
        }
    }
}