package Entidades.Heroi.TipoHeroi;

import Entidades.Entidade;
import Entidades.Heroi.Heroi;
import Entidades.NPC.Enemy;
import Itens.Arma;
import Itens.Pocao;

import java.util.ArrayList;

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

        while(npc.getVida()<=0 && this.getVida()<=0){

            System.out.println("O "+ this.getNome()+" ataca e faz "+ ataque() +" dano");
            npc.setVida(-ataque());
            if (npc.getVida()>=0) {
                System.out.println("O " + npc.getNome() + "ataca e faz " + npc.getForca() + " dano");
                this.setVida(-npc.getForca());

                System.out.println("*** A tua vida: "+ this.getVida() + "A vida do inimigo: "+ npc.getVida()+" ***");
            }

        }
        if(this.getVida()>0){
            return this;
        }else {
            return npc;
        }


    }

}
