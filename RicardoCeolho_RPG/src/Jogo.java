import Entidades.Heroi.Heroi;
import Entidades.Heroi.TipoHeroi.Arqueiro;
import Instanciar.CreateCharacter;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import Jogo.Labirinto;

public class Jogo {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner input = new Scanner(System.in);
        int opcaoHeroi = 0, opcaoDificuldade = 0, repetir = 0;
        int[] personagem = new int[3];
        String nomeHeroi, loose = "src/Apoiotxt/Loose.txt", win = "src/Apoiotxt/Win.txt";
        Labirinto labirinto = new Labirinto();


        do {
            do {
                System.out.println("\nBem vindo ao Path of Glory");
                System.out.println("\nBem-vindo ao mundo de aventuras e mistérios medievais! Prepare-te para embarcar em uma jornada épica repleta de desafios e perigos para salvar a princesa raptada.\nNas profundezas de um labirinto sombrio e enigmático, a tua coragem será posta à prova enquanto enfrentas criaturas mágicas e superas obstáculos traiçoeiros." + "\nÈs um valente herói destinado a salvar a princesa, cujo desaparecimento mergulhou o reino em trevas e tristeza.\nA tua determinação e habilidades serão fundamentais para desbravar os corredores sinuosos do labirinto, enfrentando o desconhecido a cada passo dado." + "\nA cada esquina, encontrarás escolhas difíceis a serem feitas, enquanto os inimigos cruéis farão de tudo para impedir teu progresso.\nA sorte está lançada, e somente através de tua inteligência, astúcia e valentia poderás resgatar a princesa e trazer a luz de volta ao reino." + "O destino da princesa e a esperança de todo o reino repousam em suas mãos.\nSê corajoso, forje o teu caminho através do labirinto e torna-te a lenda que salvará o reino. \n\nQue a sorte esteja contigo!");


                try {
                    opcaoHeroi = CreateCharacter.menuInicial();
                } catch (InputMismatchException exception) {
                    System.out.println("Erro de escolha! Por favor tente de novo");
                    opcaoHeroi = CreateCharacter.menuInicial();
                }

            } while (opcaoHeroi < 1 || opcaoHeroi > 3);


            try {
                opcaoDificuldade = CreateCharacter.menuDificuldade();
            } catch (InputMismatchException exception) {
                System.out.println("Erro de escolha! Por favor tente de novo");
                opcaoDificuldade = CreateCharacter.menuDificuldade();
            }


            personagem = CreateCharacter.menuPontos(opcaoDificuldade);

            Heroi hero = CreateCharacter.instanciar(opcaoHeroi, personagem);

            hero.exibirDetalhes();
            System.out.println("\n");

            if (labirinto.labirinto(hero)) {
                Labirinto.Imprimir(win);
            } else {
                Labirinto.Imprimir(loose);
            }
            do {
                do {


                    System.out.println("Queres repetir o labarinto com o mesmo character? 1 - Sim | 2 - Nao");
                    repetir = input.nextInt();

                } while (repetir < 1 || repetir > 2);
                if (repetir == 1) {

                    hero.setVida(hero.getVidaTotal()-hero.getVida());
                    if (labirinto.labirinto(hero)) {
                        Labirinto.Imprimir(win);
                    } else {
                        Labirinto.Imprimir(loose);
                    }

                }
            } while (repetir != 2);
            System.out.println("Deseja sair do jogo? 1 - Sim | 2 - Nao");
            repetir = input.nextInt();

        } while (repetir != 1);
    }


}


