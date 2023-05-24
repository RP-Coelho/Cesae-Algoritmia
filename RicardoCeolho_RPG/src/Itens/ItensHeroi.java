package Itens;

import Enums.TipoHeroi;

import java.util.ArrayList;

public abstract class ItensHeroi {

    private String nome;
    private int custo;
    private ArrayList<TipoHeroi> tipo;

    public ItensHeroi(String nome, int custo, ArrayList<TipoHeroi> tipo) {
        this.nome = nome;
        this.custo = custo;
        this.tipo = tipo;
    }




    public String getNome() {
        return nome;
    }

    public int getCusto() {
        return custo;
    }

    public ArrayList<TipoHeroi> getTipo() {
        return tipo;
    }

    public abstract void exibirDetalhes();
}
