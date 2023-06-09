package Instanciar;

import Entidades.NPC.Enemy;
import Entidades.NPC.Vendedor;
import Enums.TipoHeroi;
import Itens.Arma;
import Itens.ItensHeroi;
import Itens.Pocao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.random.RandomGenerator;

public class Listagem {

    /**
     * Metodo para instanciar as armas e o meu ArrayList de armas para passar ao vendedor
     *
     * @return o ArrayList de armas
     */
    public static ArrayList<Arma> ListaArmas() {

        ArrayList<Arma> listaArmas = new ArrayList<>();

        ArrayList<TipoHeroi> tipoCavaleiro = new ArrayList<>();
        tipoCavaleiro.add(TipoHeroi.CAVALEIRO);
        ArrayList<TipoHeroi> tipoArqueiro = new ArrayList<>();
        tipoArqueiro.add(TipoHeroi.ARQUEIRO);
        ArrayList<TipoHeroi> tipoFeiticeiro = new ArrayList<>();
        tipoFeiticeiro.add(TipoHeroi.FEITICEIRO);


        // Set Imperial //

        Arma lancaImperial = new Arma("Lança Imperial", 10, tipoCavaleiro, 10);
        Arma cajadoImperial = new Arma("Cajado Imperial", 10, tipoFeiticeiro, 15);
        Arma arcoImperial = new Arma("Arco Imperial", 10, tipoArqueiro, 20);

        listaArmas.add(lancaImperial);
        listaArmas.add(arcoImperial);
        listaArmas.add(cajadoImperial);


        // Set Guerreiro //
        Arma lancaGuerreiro = new Arma("Lança Guerreiro Primordial", 20, tipoCavaleiro, 15);
        Arma cajadoGuerreiro = new Arma("Cajado Guerreiro Primordial", 20, tipoFeiticeiro, 20);
        Arma arcoGuerreiro = new Arma("Arco Guerreiro Primordial", 20, tipoArqueiro, 25);

        listaArmas.add(lancaGuerreiro);
        listaArmas.add(arcoGuerreiro);
        listaArmas.add(cajadoGuerreiro);


        // Set Celestial //
        Arma lancaAncient = new Arma("Lança Celestial", 30, tipoCavaleiro, 20);
        Arma cajadoAncient = new Arma("Cajado Celestial", 30, tipoFeiticeiro, 25);
        Arma arcoAncient = new Arma("Arco Celestial", 30, tipoArqueiro, 30);

        listaArmas.add(lancaAncient);
        listaArmas.add(arcoAncient);
        listaArmas.add(cajadoAncient);


        // Set Champion //
        Arma lancaChampion = new Arma("Lança do Elite Campeão", 40, tipoCavaleiro, 25);
        Arma cajadoChampion = new Arma("Cajado do Elite Campeão", 40, tipoFeiticeiro, 30);
        Arma arcoChampion = new Arma("Arco do Elite Campeão", 40, tipoArqueiro, 35);

        listaArmas.add(lancaChampion);
        listaArmas.add(arcoChampion);
        listaArmas.add(cajadoChampion);


        // Set Infernal //
        Arma lancaInfernal = new Arma("Lança Infernal", 40, tipoCavaleiro, 25);
        Arma cajadoInfernal = new Arma("Cajado do Elite Campeão", 40, tipoFeiticeiro, 30);
        Arma arcoInfernal = new Arma("Arco do Elite Campeão", 40, tipoArqueiro, 35);

        listaArmas.add(lancaInfernal);
        listaArmas.add(arcoInfernal);
        listaArmas.add(cajadoInfernal);


        // Set Legendary //
        Arma lancaLegend = new Arma("Lança Lendario", 150, tipoCavaleiro, 50);
        Arma cajadoLegend = new Arma("Cajado Lendário", 150, tipoFeiticeiro, 60);
        Arma arcoLegend = new Arma("Arco Lendário", 150, tipoArqueiro, 70);


        listaArmas.add(lancaLegend);
        listaArmas.add(lancaLegend);
        listaArmas.add(arcoLegend);


        return listaArmas;
    }

    /**
     * Metodo para instanciar as minhas poções e e ArrayList de poçãos para o vendedor
     *
     * @return ArrayList de poções
     */
    public static ArrayList<Pocao> ListaPocao() {

        ArrayList<Pocao> listaPocao = new ArrayList<>();

        Pocao curaIniciante = new Pocao("Mini frasco de Cura", 5, 30);
        Pocao curaIntermedia = new Pocao("Frasco de Cura", 10, 50);
        Pocao curaAvancada = new Pocao("Super Frasco de Cura", 15, 100);
        Pocao hpMiraculosa = new Pocao("Lagrima da Phenix", 25, 200);

        listaPocao.add(curaIntermedia);
        listaPocao.add(curaIniciante);
        listaPocao.add(curaIntermedia);
        listaPocao.add(curaAvancada);
        listaPocao.add(curaIniciante);
        listaPocao.add(curaIniciante);
        listaPocao.add(curaIniciante);
        listaPocao.add(curaIntermedia);
        listaPocao.add(curaIntermedia);
        listaPocao.add(curaIniciante);
        listaPocao.add(curaIniciante);
        listaPocao.add(curaAvancada);
        listaPocao.add(hpMiraculosa);
        listaPocao.add(curaIniciante);
        listaPocao.add(curaIniciante);

        return listaPocao;
    }

    /**
     * Crio o arrayList de Itens heroi e passo-lhes os metodos para adicionar os arraylist de armas e poções.
     *
     * @return uma ArrayList de Itens Heroi
     */
    public static ArrayList<ItensHeroi> ListaVendedor() {

        ArrayList<ItensHeroi> listaVendedor = new ArrayList<>();
        listaVendedor.addAll(ListaPocao());
        listaVendedor.addAll(ListaArmas());


        return listaVendedor;

    }

    /**
     * Metodo para criar as minhas poções iniciais para o  heroi
     *
     * @return ArrayList de begginer
     */
    public static ArrayList<Pocao> PocaoBegginner() {

        ArrayList<Pocao> begginerPocao = new ArrayList<>();

        Pocao curaIniciante = new Pocao("Mini frasco de Cura", 5, 30);
        Pocao curaIntermedia = new Pocao("Frasco de Cura", 10, 50);


        begginerPocao.add(curaIntermedia);
        begginerPocao.add(curaIniciante);
        begginerPocao.add(curaIniciante);

        return begginerPocao;
    }

    /**
     * para criar adicionar a amr iniciaç para o heroi
     *
     * @param heroi -> Tipo heroi para adicionar a arma correspondente
     * @return -> A arma correspondente
     */
    public static Arma ArmaBegginner(TipoHeroi heroi) {

        ArrayList<Arma> beginnerWeapon = new ArrayList<>();

        ArrayList<TipoHeroi> tipoCavaleiro = new ArrayList<>();
        tipoCavaleiro.add(TipoHeroi.CAVALEIRO);
        ArrayList<TipoHeroi> tipoArqueiro = new ArrayList<>();
        tipoArqueiro.add(TipoHeroi.ARQUEIRO);
        ArrayList<TipoHeroi> tipoFeiticeiro = new ArrayList<>();
        tipoFeiticeiro.add(TipoHeroi.FEITICEIRO);


        // Set Begginer //

        Arma lancaFerro = new Arma("Lança iniciante", 0, tipoCavaleiro, 8);
        Arma cajadoFerro = new Arma("Cajado iniciante", 0, tipoFeiticeiro, 10);
        Arma arcoFerro = new Arma("Arco iniciante", 0, tipoArqueiro, 15);


        if (heroi.equals(TipoHeroi.ARQUEIRO)) {
            return arcoFerro;
        } else if (heroi.equals(TipoHeroi.CAVALEIRO)) {
            return lancaFerro;
        } else {
            return cajadoFerro;
        }


    }

    /**
     * Metodo para criar um ArrayList de inimigos
     *
     * @return um inimigo à sorte da nossa Lista
     */
    public static Enemy MonstrosIniciantes() {

        ArrayList<Enemy> inimigosIniciantes = new ArrayList<>();

        Enemy kobold = new Enemy("Kobold", 100, 15);
        Enemy murlock = new Enemy("Abyss Murlock", 90, 17);
        Enemy bat = new Enemy("Zubat", 120, 13);
        Enemy miliped = new Enemy("Scavenger miliped", 150, 7);
        Enemy warlock = new Enemy("Dark warlock", 60, 20);
        Enemy spider = new Enemy("Eight-legged wolf Spider", 120, 15);
        Enemy ghost = new Enemy("Ghost Abomynation", 180, 8);
        Enemy undead = new Enemy("Undead skeleton mage", 100, 15);
        Enemy orc = new Enemy("Warrior Champion Orc", 150, 12);


        inimigosIniciantes.add(kobold);
        inimigosIniciantes.add(murlock);
        inimigosIniciantes.add(bat);
        inimigosIniciantes.add(miliped);
        inimigosIniciantes.add(warlock);
        inimigosIniciantes.add(spider);
        inimigosIniciantes.add(ghost);
        inimigosIniciantes.add(kobold);
        inimigosIniciantes.add(murlock);
        inimigosIniciantes.add(bat);
        inimigosIniciantes.add(undead);
        inimigosIniciantes.add(orc);


        Random rand1 = new Random();

        int rand = rand1.nextInt(0, inimigosIniciantes.size());

        return inimigosIniciantes.get(rand);


    }

    /**
     * Metodo apenas instaciar e retornar o FinalBoss
     *
     * @return o boss Final
     */
    public static Enemy FinalBoss() {
        return new Enemy("Minotouro do Labirinto", 300, 30);


    }

    /**
     * metodo para instanciar e retornar o vendedor com uma lista de size 10 random da nossa lista total (sempre diferente com o metodo shuffle)
     * @return o Vendedor para colocar no labirinto
     */
    public static Vendedor vendedorEntrada() {

        ArrayList<ItensHeroi> vendedor = ListaVendedor();
        Collections.shuffle(vendedor);

        int subListSize = 10;

        Random rand1 = new Random();

        int rand = rand1.nextInt(0, (vendedor.size() - subListSize));


        ArrayList<ItensHeroi> lista = new ArrayList<>(vendedor.subList(rand, (rand + subListSize)));

        return new Vendedor(lista);
    }


}

