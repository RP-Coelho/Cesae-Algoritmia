package Itens;

import Enums.TipoHeroi;

import java.util.ArrayList;

public class Arma extends ItensHeroi{
    public int ataque;

    public Arma(String nome, int custo, ArrayList<TipoHeroi> tipos, int ataque) {
        super(nome, custo, tipos);
        this.ataque = ataque;
    }


    public int getAtaque() {
        return ataque;
    }

    @Override
    public void exibirDetalhes() {
        System.out.print(this.getNome());
        System.out.print(" | "+this.getCusto());
        System.out.print(" | "+this.ataque);
        System.out.println("\n Disponivel apenas para");
        System.out.println(" | "+ this.getTipo().listIterator());
    }
}
