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


        System.out.println("Bem vindo ao Path of Glory");
        System.out.println(
                "Bem-vindo ao mundo de aventuras e mistérios medievais! Prepare-se para embarcar em uma jornada épica repleta de desafios e perigos em busca da princesa perdida.\nNas profundezas de um labirinto sombrio e enigmático, sua coragem será posta à prova enquanto você enfrenta criaturas mágicas, desvenda enigmas antigos e supera obstáculos traiçoeiros." +
                        "\nVocê é um valente herói destinado a salvar a princesa, cujo desaparecimento mergulhou o reino em trevas e tristeza. Sua determinação e habilidades serão fundamentais para desbravar os corredores sinuosos do labirinto, enfrentando o desconhecido a cada passo dado." +
                        "\nA cada esquina, você encontrará escolhas difíceis a serem feitas. Aliados poderosos podem surgir para ajudá-lo, enquanto inimigos cruéis farão de tudo para impedir seu progresso.\nA sorte está lançada, e somente através de sua inteligência, astúcia e valentia você poderá resgatar a princesa e trazer a luz de volta ao reino." +
                        "Prepare-se para uma aventura que testará sua bravura e habilidades estratégicas. O destino da princesa e a esperança de todo o reino repousam em suas mãos.\nSeja corajoso, forje seu caminho através do labirinto e torne-se a lenda que salvará a princesa perdida. Que a sorte esteja com você!");

        System.out.println("\n\n");
        System.out.println("Escolha umas das seguintes classes");
        for (
                TipoHeroi tipo : TipoHeroi.values()) {
            int count = 1;
            System.out.println(count + " - " + tipo);

        }

        return input.nextInt();
    }

    public static int menuDificuldade() throws InputMismatchException {

        System.out.println("\n\nDeseja jogar isto em que modo");
        System.out.print("1 - Facil");
        System.out.println("2 - Dificil");

        return input.nextInt();
    }

    public static int[] menuPontos(int i) {
        int[] personagem = new int[3];
        int soma = 0;


        do {
            System.out.println("+1 de Vida gasta 1 ponto | +1 de Força gasta 5 pontos");

            if (i == 1) {
                soma = 300;
                personagem[2] = 20;
                System.out.println("Faça a distribuição de pontos tem " + soma + " no total");

            } else {
                soma = 220;
                System.out.println("Faça a distribuição de pontos tem " + soma + " no total");
                personagem[2] = 10;

            }

            System.out.print("Quantos pontos quer usar em vida");
            personagem[0] = input.nextInt();
            System.out.print("Quantos pontos quer usar em força");
            personagem[1] = input.nextInt() / 5;

            soma -= personagem[0] + personagem[1];

            if (soma > 0) {
                System.out.println("Tem que usar os pontos todos!");
            } else if (soma < 0) {
                System.out.println("Distribuiu demasiados pontos!");
            }
        } while (soma != 0);


        return personagem;
    }


    public static Heroi instanciar(int i, int[] personagem) {

        if (i == 1) {

            Arma lanca = Listagem.ArmaBegginner(TipoHeroi.CAVALEIRO);
            return new Cavaleiro(input.next(), personagem, lanca, Listagem.PocaoBegginner());
        } else if (i == 2) {


            Arma cajado = Listagem.ArmaBegginner(TipoHeroi.FEITICEIRO);
            return new Cavaleiro(input.next(), personagem, cajado, Listagem.PocaoBegginner());
        } else {
            Arma arco = Listagem.ArmaBegginner(TipoHeroi.ARQUEIRO);
            return new Cavaleiro(input.next(), personagem, arco, Listagem.PocaoBegginner());

        }

    }


}
