package Itens;

import Enums.TipoHeroi;

import java.util.ArrayList;

public abstract class ItensHeroi {

    private String nome;
    private int custo;
    private ArrayList<TipoHeroi> tipo;

    /**
     * Metodo construtor dos itens que podemos ter no Heroi
     * @param nome -> do item
     * @param custo -> do item
     * @param tipo -> de heroi possivel ao Heroi
     */
    public ItensHeroi(String nome, int custo, ArrayList<TipoHeroi> tipo) {
        this.nome = nome;
        this.custo = custo;
        this.tipo = tipo;
    }


    /**
     * Metodo de acesso ao nome do Item
     * @return o nome do item
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo de acesso ao custo do item
     * @return o custo do item
     */
    public int getCusto() {
        return custo;
    }

    /**
     * Metodo de acesso aos tipos de herois possiveis do item
     * @return os tipos de herois possiveis do item
     */
    public ArrayList<TipoHeroi> getTipo() {
        return tipo;
    }

    /**
     * Metodo abstracto obrigatorio nas nossas subclasses de itens heroi
     */
    public abstract void exibirDetalhes();
}
