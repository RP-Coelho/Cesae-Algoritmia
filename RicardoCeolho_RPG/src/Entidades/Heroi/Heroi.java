

package Entidades.Heroi;

import Entidades.Entidade;
import Entidades.NPC.Enemy;
import Itens.Arma;
import Itens.Pocao;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Heroi extends Entidade {
    private int nivel, ouro;
    private Arma arma;
    private ArrayList<Pocao> myPotions;
    private final int vidaTotal = this.getVida();

    public Heroi(String nome, int vida, int forca, int ouro, Arma arma, ArrayList<Pocao> myPotions) {
        super(nome, vida, forca);
        this.nivel = 1;
        this.ouro = ouro;
        this.arma = arma;
        this.myPotions = myPotions;
    }

    public int getVidaTotal() {
        return vidaTotal;
    }

    public Heroi(String nome, int[] personagem, Arma arma, ArrayList<Pocao> myPotions) {
        super(nome, personagem[0], personagem[1]);
        this.nivel = 1;
        this.arma = arma;
        this.myPotions = myPotions;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel += nivel;
    }

    public int getOuro() {
        return ouro;
    }

    public void setOuro(int ouro) {
        this.ouro += ouro;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public ArrayList<Pocao> getMyPotions() {
        return myPotions;
    }

    public void setMyPotions(ArrayList<Pocao> myPotions) {
        this.myPotions = myPotions;
    }

    public void subirNivel() {
        this.setNivel(1);
        this.setVida(10);
        this.setOuro(10);
        this.setForca(1);

    }

    public void verInventario() {
        Scanner input = new Scanner(System.in);
        int count = 1;
        System.out.println("Os itens no inventario são:");
        for (Pocao pocao : this.myPotions) {
            System.out.println(count + " - " + pocao.getNome() + " | " + pocao.getCura());
            count++;
        }
        System.out.println("0 - Nao usar nada");
        try {
            System.out.println("\n Deseja usar algum item? - Indique o numero");
            int i = input.nextInt();
            usarPocao(i);
        } catch (InputMismatchException exception) {
            verInventario();
        }
    }

    public void usarPocao(int i) throws InputMismatchException {
        this.setVida(myPotions.get(i).getCura());
        myPotions.remove(i);
        System.out.println("A sua vida recuperou para " + this.getVida());
    }


    public abstract Entidade atacar(Enemy npc);

    @Override
    public final void exibirDetalhes() {
        System.out.print("O seu heroi: " + this.getNome());
        System.out.println(" | O seu nivel: " + this.nivel);
        System.out.print("O seu ouro: " + this.getOuro());
        System.out.print(" | a sua arma é" + this.arma.getNome() + " | dano: " + this.arma.getAtaque());
        System.out.println("\n");
        verInventario();
    }
}
