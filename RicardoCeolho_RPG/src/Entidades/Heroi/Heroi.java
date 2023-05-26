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
    private int vidaTotal;

    /**
     * Metodo Construtor -> Atributos provem todos da Super Classe Heroi.
     *
     * @param nome->    Nome da personagem
     * @param vida      -> Vida da personagem
     * @param forca     -> Força da personagem -> Complementa com o dano da arma
     * @param ouro      -> Ouro da personagem -> Ouro que o personagem tem
     * @param arma      ->  Atributo arma que o heroi pode usar
     * @param myPotions -> Array de poções
     * vidaTotal -> Estou a colocar no metodo construtor para ter uma variavel vida maxima != da vida actual
     */
    public Heroi(String nome, int vida, int forca, int ouro, Arma arma, ArrayList<Pocao> myPotions) {
        super(nome, vida, forca);
        this.nivel = 1;
        this.ouro = ouro;
        this.arma = arma;
        this.myPotions = myPotions;
        this.vidaTotal = this.getVida(); //
    }

    /**
     * * Metodo Construtor Alternativo-> Objectivo foi no menu poder enviar todos os atributos numa unica variavel
     *
     * @param nome       -> Nome da personagem
     * @param personagem -> Array com os atributos vida / forca / ouro
     * @param arma       -> Atributo arma que o heroi pode usar
     * @param myPotions  -> Array de poções
     */
    public Heroi(String nome, int[] personagem, Arma arma, ArrayList<Pocao> myPotions) {
        super(nome, personagem[0], personagem[1]);
        this.ouro = personagem[2];
        this.nivel = 1;
        this.arma = arma;
        this.myPotions = myPotions;
        this.vidaTotal = this.getVida();
    }

    /**
     * Metodo para ver a VidaTotal do heroi
     * @return a vida total
     */
    public int getVidaTotal() {
        return vidaTotal;
    }

    /**
     * Metodo para ver o nivel do heroi
     * @return  nivel heroi
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Para modificar o maximo de vida do Heroi -> sempre que sobe de lvl
     * @param vida -> apenas passado no metodo subir de nivel.
     */
    public void setVidaTotal(int vida) {
        this.vidaTotal += vida;
    }

    /**
     * metodo para conseguir modificar o lvl do Heroi sempre que ele passa uma encruzilhada
     * @param nivel -> subida automatica +1;
     */
    public void setNivel(int nivel) {
        this.nivel += nivel;
    }

    /**
     * metodo para conseguir obter o valor actual do Ouro do heroi
     * @return o ouro que ele tenha
     */
    public int getOuro() {
        return ouro;
    }


    /**
     * metodo para modificar o ouro sempre que o Heroi faz uma transação, assim como recompensar nas subidas de lvl
     * @param ouro o valor que vamos modificar +/-
     */
    public void setOuro(int ouro) {
        this.ouro += ouro;
    }

    /**
     * Metodo para retornar a nossa arma actual
     * @return a nossa arma actual
     */
    public Arma getArma() {
        return arma;
    }

    /**
     * Metodo para trocarmos de arma
     * @param arma a nova arma
     */
    public void setArma(Arma arma) {
        this.arma = arma;
    }

    /**
     * Metodo para aceder o meu arrayList de pocoes
     * @return as minhas poções actuais
     */
    public ArrayList<Pocao> getMyPotions() {
        return myPotions;
    }

    /**
     * Metodo para poder actualizar a lista de poções
     * @param myPotions -> adicionar ou remover opções (envio uma nova arrayList actualizada)
     */
    public void setMyPotions(ArrayList<Pocao> myPotions) {
        this.myPotions = myPotions;
    }

    /**
     * Método de subir de nivel -> Sempre que o nosso Heroi vence uma batalha sobe de nivel e os seus atributos sobem por default.
     */
    public void subirNivel() {
        this.setNivel(1);
        this.setVidaTotal(10);
        this.setOuro(10);
        this.setForca(1);
    }

    /**
     * Metodo para ver inventario com os diversos detalhes do que la tenho
     * Adicionalmente pergunta-me quais itens posso usar
     */
    public void verInventario() {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int i;
        System.out.println("Os itens no inventario são:");
        // imprimo os detalhes dos itens
        for (Pocao pocao : this.myPotions) {

            System.out.println(count + " - " + pocao.getNome() + " | " + pocao.getCura() + " vida");

            count++;
        }
        System.out.println("0 - Nao usar nada");
        try {
            System.out.print("\nDeseja usar algum item? - Indique o numero: ");
            i = input.nextInt();
            // condição caso o utilizador nao tenha escolhido sair usar o item
            if (i != 0) {
                // retiro 1 na opção do utilizdor para poder aceder ao verdadeiro index no arrayList
                i -=1;
               //invoco o metodo de usar a poção passando o index da poçao que ele quer usar
                usarPocao(i);
            }
            // caso exista um mau uso do utilizador recomeço a função
        } catch (ArrayIndexOutOfBoundsException exception) {
            verInventario();
        }
    }


    /**
     * Metodo para usar uma poçao - cura o valor da poção fornecida e faz cap maximo na nossa vidaTotal
     * @param i - index da poçao no nosso bag
     * @throws ArrayIndexOutOfBoundsException -> caso a opção seja fora do nosso array
     */
    public void usarPocao(int i) throws ArrayIndexOutOfBoundsException {

        System.out.println("Cura: " + this.myPotions.get(i).getCura());
        // caso a nossa vida com a poçao seja superior a nossa vida maxima ele so cura a diferença
        if ((this.getVida() + this.myPotions.get(i).getCura()) > this.vidaTotal) {
            this.setVida((this.vidaTotal - this.getVida()));
            System.out.println("OverHealed");
        } else {
            this.setVida(this.myPotions.get(i).getCura());

        }

        System.out.println("A sua vida recuperou para +" + this.myPotions.get(i).getCura() + " vida");
        System.out.println("Vida actual: " + this.getVida());
        // remover a listagem de poções
        this.myPotions.remove(i);
    }

    /**
     * Metodo abstracto para actar (proveniente ja da entidade)
     * @param npc - o nosso inimigo
     * @return retorna o vencedor
     */
    public abstract Entidade atacar(Enemy npc);

    /**
     * Metodo final para exibir os detalhes do nosso heroi
     */
    @Override
    public final void exibirDetalhes() {
        System.out.print("\nO seu heroi: " + this.getNome());
        System.out.println(" | O seu nivel: " + this.nivel);
        System.out.print("O seu ouro: " + this.getOuro());
        System.out.print(" | A força: " + this.getForca());
        System.out.print(" | A sua vida actual: " + this.getVida());
        System.out.println(" | A vida máxima:" +this.getVidaTotal());
        System.out.print("A sua arma é " + this.arma.getNome() + " | dano: " + this.arma.getAtaque());
        System.out.println("\n");

    }
}
