package Entidades.Heroi.TipoHeroi;

import Entidades.Entidade;
import Entidades.Heroi.Heroi;
import Entidades.NPC.Enemy;
import Itens.Arma;
import Itens.Pocao;

import java.util.ArrayList;
import java.util.Scanner;

public class Feiticeiro extends Heroi {

    public Feiticeiro(String nome, int vida, int forca, int ouro, Arma arma, ArrayList<Pocao> myPotions) {
        super(nome, vida, forca, ouro, arma, myPotions);
    }

    public Feiticeiro(String nome, int[] personagem, Arma arma, ArrayList<Pocao> myPotions) {
        super(nome, personagem, arma, myPotions);
    }

    public int ataque() {

        return this.getForca() + this.getArma().ataque;
    }

    @Override
    public Entidade atacar(Enemy npc) {
        Scanner input = new Scanner(System.in);
        int opcao = 0, ronda = 0;

        System.out.println("Deparaste com um: ");
        npc.exibirDetalhes();

        while (npc.getVida() > 0 && this.getVida() > 0) {

            System.out.println("\nO " + this.getNome() + " ataca e faz " + ataque() + " dano");
            npc.setVida(-ataque());

            if (npc.getVida() > 0) {
                if (this.getVida() < (0.1 * getVidaTotal())) {
                    System.out.println("A sua vida esta curta! Deseja usar uma poçao?");
                    System.out.print("1 - Sim || 2 - Não");
                    opcao = input.nextInt();
                    if (opcao == 1) {
                        verInventario();
                    }
                }
                if (npc.getVida() <= 0) {
                    System.out.println("O " + npc.getNome() + " ataca e faz " + npc.getForca() + " dano");
                    this.setVida(-npc.getForca());
                }
                System.out.println("*** A tua vida: " + this.getVida() + " | A vida do inimigo: " + npc.getVida() + " ***");
            }


            System.out.print("Ronda " + ronda + ". Carregue em qualquer tecla:");
            input.next();
            ronda++;
        }
        if (this.getVida() > 0) {
            System.out.println("\n");
            verInventario();
            return this;
        } else {
            return npc;
        }


    }

}