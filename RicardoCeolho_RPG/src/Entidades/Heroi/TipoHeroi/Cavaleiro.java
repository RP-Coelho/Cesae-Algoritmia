package Entidades.Heroi.TipoHeroi;

import Entidades.Entidade;
import Entidades.Heroi.Heroi;
import Entidades.NPC.Enemy;
import Itens.Arma;
import Itens.Pocao;
import Jogo.Labirinto;

import java.util.ArrayList;
import java.util.Scanner;

public class Cavaleiro extends Heroi {
    /**
     * Metodo Construtor -> Atributos provem todos da Super Classe Heroi.
     *
     * @param nome->    Nome da personagem
     * @param vida      -> Vida da personagem
     * @param forca     -> Força da personagem -> Complementa com o dano da arma
     * @param ouro      -> Ouro da personagem -> Ouro que o personagem tem
     * @param arma      ->  Atributo arma que o heroi pode usar
     * @param myPotions -> Array de poções
     */


    public Cavaleiro(String nome, int vida, int forca, int ouro, Arma arma, ArrayList<Pocao> myPotions) {
        super(nome, vida, forca, ouro, arma, myPotions);
    }

    /**
     * * Metodo Construtor Alternativo-> Objectivo foi no menu poder enviar todos os atributos numa unica variavel
     *
     * @param nome       -> Nome da personagem
     * @param personagem -> Array com os atributos vida / forca / ouro
     * @param arma       -> Atributo arma que o heroi pode usar
     * @param myPotions  -> Array de poções
     */
    public Cavaleiro(String nome, int[] personagem, Arma arma, ArrayList<Pocao> myPotions) {
        super(nome, personagem, arma, myPotions);
    }

    /**
     * Metodo dano -> combinação do dano inicial (força) com o atributo complementar da arma
     *
     * @return dano total
     */
    public int ataque() {

        return this.getForca() + this.getArma().ataque;
    }

    /**
     * Metodo Obrigatorio da nossa classe abstracta -> Ataque do nosso heroi
     *
     * @param npc -> Adversario passado
     * @return -> vencedor do duelo
     */
    @Override
    public Entidade atacar(Enemy npc) {

        Scanner input = new Scanner(System.in);
        int opcao = 0, ronda=0;

        System.out.println("Deparaste com um: ");
        npc.exibirDetalhes();

        while (npc.getVida() > 0 && this.getVida() > 0) {

            if (npc.getVida() > 0) {
                if (this.getVida() < (0.2 * getVidaTotal())) {
                    System.out.println("A sua vida esta curta! Deseja usar uma poçao?");
                    System.out.print("1 - Sim || 2 - Não");
                    opcao = input.nextInt();
                    if (opcao == 1) {
                        verInventario();
                    }
                }
            }

            System.out.println("\nO " + npc.getNome() + " ataca e faz " + (npc.getForca() * 80 / 100) + " dano");
            this.setVida(-(npc.getForca() * 80 / 100));

            if (this.getVida() > 0) {
                System.out.println("O " + this.getNome() + " ataca e faz " + ataque() + " dano");
                npc.setVida(-ataque());
                System.out.println("*** A tua vida: " + this.getVida() + " A vida do inimigo: " + npc.getVida() + " ***");
            }


            try {
                System.out.print("Ronda: " + ronda +" ");
                Labirinto.pressENTER();
            } catch (NullPointerException exception) {

                input.next();
            }

            ronda++;
        }
        if (this.getVida() > 0) {
            System.out.println("\n");
            System.out.println("A sua vida actual é: " + this.getVida());
            verInventario();
            return this;
        } else {
            return npc;
        }

    }


}
