package Entidades.NPC;

import Entidades.Heroi.Heroi;
import Entidades.Heroi.TipoHeroi.Arqueiro;
import Entidades.Heroi.TipoHeroi.Cavaleiro;
import Entidades.Heroi.TipoHeroi.Feiticeiro;
import Itens.Arma;
import Itens.ItensHeroi;
import Itens.Pocao;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class Vendedor {
    private ArrayList<ItensHeroi> item;

    public Vendedor(ArrayList<ItensHeroi> item) {
        this.item = item;
    }

    public void exibirInventario() {
        int count = 1;

        for (ItensHeroi item : this.item) {
            System.out.print(count + " - Item ");
            item.exibirDetalhes();
            count++;
            System.out.println("");
        }

    }

    public ArrayList<ItensHeroi> getItem() {
        return item;
    }

    public boolean hasGold(int i, Heroi hero) {
        if (this.item.get(i).getCusto() < hero.getOuro()) {
            return true;
        } else {
            System.out.println("Não tem gold suficiente para essa compra!\n");
            return false;
        }
    }

    public void venderItem(int i, Heroi hero) {
        if (hasGold(i, hero)) {

            if (this.item.get(i) instanceof Arma armaTemp) {
                if (isTypeHero(armaTemp, hero)) {
                    System.out.println("Parabens comprou: " + armaTemp.getNome());
                    hero.setArma(armaTemp);
                    this.item.remove(i);
                } else {
                    System.out.println("Desculpa, mas não consegue usar essa arma!");
                }
            }


        } else if (this.item.get(i) instanceof Pocao pocaoTemp) {
            hero.getMyPotions().add(pocaoTemp);
            System.out.println("Parabens comprou: " + pocaoTemp.getNome());
        }

    }

    public boolean isTypeHero(Arma armaTemp, Heroi hero) {

        for (int i = 0; i < armaTemp.getTipo().size(); i++) {
            if (hero.getClass().getSimpleName().toUpperCase().equals(armaTemp.getTipo().get(i).toString())) {
                return true;

            }
        }
        return false;
    }

    public void setItem(ArrayList<ItensHeroi> item) {
        this.item = item;
    }
}
