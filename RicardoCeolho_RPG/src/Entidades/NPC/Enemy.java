package Entidades.NPC;

import Entidades.Entidade;

public class Enemy extends Entidade {

    public Enemy(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }


    @Override
    public void exibirDetalhes() {
        System.out.print("Nome: "+ this.getNome());
        System.out.print(" | Vida: "+ this.getVida());
        System.out.print(" | Forca: "+ this.getForca()+"\n");
    }
}
