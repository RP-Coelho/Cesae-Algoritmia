package Itens;

import Enums.TipoHeroi;

import java.util.ArrayList;
import java.util.Arrays;

public class Pocao extends ItensHeroi {
    private int cura;
    private static ArrayList<TipoHeroi> tipo = new ArrayList<>(Arrays.asList(TipoHeroi.CAVALEIRO,TipoHeroi.ARQUEIRO,TipoHeroi.FEITICEIRO));

    public Pocao(String nome, int custo, int cura) {
        super(nome, custo, tipo);
        this.cura = cura;
    }

    public int getCura() {
        return cura;
    }


    @Override
    public void exibirDetalhes() {

        System.out.print(this.getNome());
        System.out.print(" | " + this.getCusto());
        System.out.print(" | " + this.cura);
        System.out.println("\n Disponivel apenas para");
        System.out.println(" | " + this.getTipo().listIterator());
    }
}
