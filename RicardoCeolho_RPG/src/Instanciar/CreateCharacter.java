package Instanciar;

import Entidades.Heroi.Heroi;
import Entidades.Heroi.TipoHeroi.Cavaleiro;
import Enums.TipoHeroi;
import Itens.Arma;
import Itens.Pocao;

import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.*;

public final class CreateCharacter {

    static Scanner input = new Scanner(System.in);


    public static int menuInicial() throws InputMismatchException {
        int count = 1;

        System.out.println("\n");
        System.out.println("Escolha umas das seguintes classes");
        for (
                TipoHeroi tipo : TipoHeroi.values()) {

            System.out.println(count + " - " + tipo);
            count++;
        }
        System.out.print("\nQual deseja - Insira o numero: ");
        return input.nextInt();
    }

    public static int menuDificuldade() throws InputMismatchException {

        System.out.println("\n\nDeseja jogar isto em que modo");
        System.out.print("1 - Facil | ");
        System.out.println("2 - Dificil");

        return input.nextInt();
    }

    public static int[] menuPontos(int i) {
        int[] personagem = new int[3];
        int soma = 0;


        do {
            System.out.println("\nVamos entao distribuir  os pontos!");
            System.out.println("\n +1 de Vida gasta 1 ponto | +1 de Força gasta 5 pontos");

            if (i == 1) {
                soma = 300;
                personagem[2] = 20;
                System.out.println("\nFaça a distribuição de pontos tem " + soma + " no total");

            } else {
                soma = 220;
                System.out.println("\nFaça a distribuição de pontos tem " + soma + " no total");
                personagem[2] = 15;

            }

            System.out.print("Quantos pontos quer usar em vida: ");
            personagem[0] = input.nextInt();
            System.out.print("Quantos pontos quer usar em força: ");
            personagem[1] = input.nextInt() / 5;

            soma -= personagem[0] + (personagem[1]*5);

            if (soma > 0) {
                System.out.print("Tem que usar os pontos todos! ");
                System.out.println("Sobraram: "+soma );
            } else if (soma < 0) {
                System.out.print("Distribuiu demasiados pontos!");
                System.out.println("Usou a mais :" + soma);
                System.out.println();
            }

        } while (soma != 0);


        return personagem;
    }


    public static Heroi instanciar(int i, int[] personagem) {
        System.out.println("Digite o seu nome: ");
        input.nextLine();
        if (i == 1) {

            Arma lanca = Listagem.ArmaBegginner(TipoHeroi.CAVALEIRO);

            return new Cavaleiro(input.nextLine(), personagem, lanca, Listagem.PocaoBegginner());
        } else if (i == 2) {


            Arma cajado = Listagem.ArmaBegginner(TipoHeroi.FEITICEIRO);
            return new Cavaleiro(input.nextLine(), personagem, cajado, Listagem.PocaoBegginner());
        } else {
            Arma arco = Listagem.ArmaBegginner(TipoHeroi.ARQUEIRO);
            return new Cavaleiro(input.nextLine(), personagem, arco, Listagem.PocaoBegginner());

        }

    }


}
