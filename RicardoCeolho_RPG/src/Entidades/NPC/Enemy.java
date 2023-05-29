package Entidades.NPC;

import Entidades.Entidade;

public class Enemy extends Entidade {
    /**
     * Metodo construtor para criar inimigos
     * @param nome -> Nome do inimigo
     * @param vida -> Vida do inimigo
     * @param forca -> Força do inimigo
     */
    public Enemy(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    /**
     * Metodo para exibir os detalhes do nosso inimigo
     */
    @Override
    public void exibirDetalhes() {
        System.out.print("Nome: "+ this.getNome());
        System.out.print(" | Vida: "+ this.getVida());
        System.out.print(" | Forca: "+ this.getForca()+"\n");
    }
}
