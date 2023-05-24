import Entidades.Heroi.TipoHeroi.Cavaleiro;
import Enums.TipoHeroi;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.EnumSet;
import java.util.Enumeration;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcaoHeroi = 0, opcaoDificuldade = 0;
        int [] personagem = new int[3];
        String nomeHeroi;
        /*

    Elabore uma Classe Jogo com um método labirinto. Este método deve ser invocado no main desta mesma classe.
    Inicialmente deve perguntar qual o tipo de herói com que o utilizador deseja jogar (Cavaleiro, Feiticeiro ou
    Arqueiro). Seguidamente é perguntada a dificuldade, podendo ser Fácil ou Difícil. Seguidamente o utilizador pode
    distribuir pontos de criação de personagem entre vida e força da sua personagem, sabendo que cada ponto de
    vida vale um ponto de criação de personagem e cada ponto de força vale 5 pontos de criação de personagem,
    assim o utilizador deve distribuir corretamente de modo a ficar com 0 pontos de criação da personagem. Se a
    dificuldade for fácil tem direito a 300 pontos, se for difícil só tem direito a 220 pontos. A seguir é também atribuído
    ouro à personagem, se a dificuldade for fácil tem direito a 20 moedas de ouro, se for difícil apenas a 15 moedas
    de ouro.*/

        do {
            do {

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

            CreateCharacter.instanciar(opcaoHeroi, personagem);



        }while();
    }


}


}