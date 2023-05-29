package Itens;

import Enums.TipoHeroi;

import java.util.ArrayList;
import java.util.Arrays;

public class Pocao extends ItensHeroi {
    private int cura;

    private static ArrayList<TipoHeroi> tipo = new ArrayList<>(Arrays.asList(TipoHeroi.CAVALEIRO,TipoHeroi.ARQUEIRO,TipoHeroi.FEITICEIRO));

    /**
     * Metodo construtor das poções
     * @param nome -> da poção
     * @param custo -> da Poção
     * @param cura -> da poção
     *
     * Passamos no tipo de Heroi directamente um ArrayList prefeito criado na classe
     */
    public Pocao(String nome, int custo, int cura) {
        super(nome, custo, tipo);
        this.cura = cura;
    }

    /**
     * Metodo para acessar a quantidade de cura da poção
     * @return a cura da poção
     */
    public int getCura() {
        return cura;
    }

    /**
     * Netdo para exibir os detalhes da poção
     */
    @Override
    public void exibirDetalhes() {

        System.out.print(this.getNome());
        System.out.print(" | Custo: " + this.getCusto());
        System.out.print(" | Cura: " + this.cura);
        System.out.print("\nDisponivel apenas para");
        System.out.println(" | " + this.getTipo());
    }
}
