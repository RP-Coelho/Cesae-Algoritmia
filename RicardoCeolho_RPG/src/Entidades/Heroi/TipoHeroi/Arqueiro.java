package Entidades.Heroi.TipoHeroi;
import Entidades.Entidade;
import Entidades.Heroi.Heroi;
import Entidades.NPC.Enemy;
import Itens.Arma;
import Itens.Pocao;
import Jogo.Labirinto;
import java.util.ArrayList;
import java.util.Scanner;

public class Arqueiro extends Heroi {
    public Arqueiro(String nome, int vida, int forca, int ouro, Arma arma, ArrayList<Pocao> myPotions) {
        super(nome, vida, forca, ouro, arma, myPotions);
    }

    public Arqueiro(String nome, int[] personagem, Arma arma, ArrayList<Pocao> myPotions) {
        super(nome, personagem, arma, myPotions);
    }

    /**
     * Metodo dano -> combinação do dano inicial (força) com o atributo complementar da arma
     *
     * @return dano total
     */
    public int ataque() {

        return this.getForca() + this.getArma().ataque;
    }

    /**
     * Metodo Obrigatorio da nossa classe abstracta -> Ataque do nosso heroi
     *
     * @param npc -> Adversario passado
     * @return -> vencedor do duelo
     */
    @Override
    public Entidade atacar(Enemy npc) {
        Scanner input = new Scanner(System.in);
        int opcao = 0, ronda = 0;

        System.out.println("\nDeparas-te com um: ");
        // Exibir as caracteristicas do inimigo
        npc.exibirDetalhes();

        // Ciclo para haver duelo enquanto alguem tem vida
        while (npc.getVida() > 0 && this.getVida() > 0) {

            System.out.println("\nO " + this.getNome() + " ataca e faz " + ataque() + " dano");
            npc.setVida(-ataque());

            // Condição caso o inimigo ja esteja morto após o ataque do nosso heroi não atacar de volta
            if (npc.getVida() > 0) {
                // Condição para o nosso heroi usar uma poção caso esteja em dano critico
                if (this.getVida() < (0.2 * getVidaTotal())) {
                    System.out.println("A sua vida esta curta! Deseja usar uma poçao?");
                    System.out.print("1 - Sim || 2 - Não");
                    opcao = input.nextInt();
                    //Chama o metodo ver inventario para poder usar
                    if (opcao == 1) {
                        verInventario();
                    }
                }
                System.out.println("O " + npc.getNome() + " ataca e faz " + (npc.getForca() * 110 / 100) + " dano");
                this.setVida(-(npc.getForca() * 110 / 100));

            }

            System.out.println("*** A tua vida: " + this.getVida() + " A vida do inimigo: " + npc.getVida() + " ***");


        // Imprime as rondas
        System.out.print("Ronda: " + ronda + " ");
        Labirinto.pressENTER();

        ronda++;
    }
        // Condição para retornar o vencedor
        if (this.getVida() > 0) {
            System.out.println("\n");
            System.out.println("A sua vida actual é: " + this.getVida());
            verInventario();
            return this;
        } else {
            return npc;
        }


    }
}
