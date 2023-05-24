package Entidades.NPC;

import Entidades.Heroi.Heroi;
import Itens.Arma;
import Itens.ItensHeroi;
import Itens.Pocao;

import java.util.ArrayList;

public class Vendedor {
    private ArrayList<ItensHeroi> item;

    public Vendedor(ArrayList<ItensHeroi> item) {
        this.item = item;
    }

    public void exibirInventario() {
        int count = 1;
        for (ItensHeroi item : this.item) {
            System.out.println(count + "Item");
            item.exibirDetalhes();
            System.out.println("\n");
        }

    }

    public boolean hasGold(int i, Heroi hero) {
        if (this.item.get(i).getCusto() < hero.getOuro()) {
            return true;
        } else {
            return false;
        }
    }

    public void venderItem(int i, Heroi hero) {
        if (hasGold(i, hero)) {
            this.item.remove(i);
            if (this.item.get(i) instanceof Arma armaTemp) {
                hero.setArma(armaTemp);
            }
        } else if (this.item.get(i) instanceof Pocao pocaoTemp) {
            hero.getMyPotions().add(pocaoTemp);
        }

    }

    public void setItem(ArrayList<ItensHeroi> item) {
        this.item = item;
    }
}
