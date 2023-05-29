package Itens;

import Enums.TipoHeroi;

import java.util.ArrayList;

public class Arma extends ItensHeroi{
    public int ataque;

    /**
     * Metodo construtor da Arma
     * @param nome -> da Arma
     * @param custo -> da Arma
     * @param tipos -> Possiveis de herois da Arma
     * @param ataque -> Dano da Arma
     */
    public Arma(String nome, int custo, ArrayList<TipoHeroi> tipos, int ataque) {
        super(nome, custo, tipos);
        this.ataque = ataque;
    }

    /**
     * Metodo para acessar ao ataque
     * @return -> o dano
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Metodo para exibir os detalhes de cada arma.
     */
    @Override
    public void exibirDetalhes() {
        System.out.print(this.getNome());
        System.out.print(" | Custo: "+this.getCusto());
        System.out.print(" | Dano: "+this.ataque);
        System.out.print("\nDisponivel apenas para: ");
        for (TipoHeroi tipo: this.getTipo()
             ) {
            System.out.println(" | " + tipo);

        }

    }
}
