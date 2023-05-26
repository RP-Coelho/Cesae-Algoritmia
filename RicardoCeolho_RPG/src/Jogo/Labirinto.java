package Jogo;

import Entidades.Heroi.Heroi;
import Entidades.NPC.Enemy;
import Entidades.NPC.Vendedor;
import Instanciar.Listagem;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Labirinto {
    static Scanner input = new Scanner(System.in);
    static Console console = System.console();

    public Labirinto() {

    }

    public boolean labirinto(Heroi hero) throws FileNotFoundException {
        int opcao = 0;
        String direccao, minotaur = "Apoio/minotaur.txt";

        System.out.println("Chegaste à entrada do Labirinto");
        VendedorLabirinto(hero);


        System.out.println("\nEntras no labirinto e imediatamente és envolvido por um ar húmido e denso. Paredes de pedra cinzenta se erguem ao teu redor, revelando antigas inscrições enigmáticas. \nA fraca luz que penetra pelas estreitas passagens lança sombras dançantes. Cada corredor parece idêntico ao próximo, desafiando a tua orientação. \nO silêncio é interrompido apenas pelo eco distante dos teus próprios passos e pelos sussurros misteriosos que parecem surgir das profundezas do labirinto. \nCada decisão que tomas pode ser crucial, mas cuidado, pois o labirinto guarda segredos perigosos que podem desviar até mesmo os mais corajosos aventureiros do seu objetivo.");
        do {


            System.out.print("\nSegues: esquerda ou direita? ");
            direccao = input.next().toLowerCase();
        } while (!direccao.equals("esquerda") && !direccao.equals("direita"));

        System.out.println("Seguiste pela " + direccao);
        System.out.println("Estas a ouvir sons....");

        if (Sala(hero, Listagem.MonstrosIniciantes())) {

            System.out.println("Parabens passaste a primeira encruzilhada");

            pressENTER();


        } else {

            return false;
        }

        do {
            System.out.print("\nAgora ves dois caminhos: um corredor escuro e uma escada para cima. Qual caminho escolhes? Corredor ou escada: ");
            direccao = input.next().toLowerCase();

        } while (!direccao.equals("corredor") && !direccao.equals("escada"));

        if (Sala(hero, Listagem.MonstrosIniciantes())) {
            System.out.println("Parabens passaste a segunda encruzilhada");

            pressENTER();

        } else {

            return false;
        }


        do {
            System.out.print("Vès uma porta à frente e uma escada para baixo. Qual caminho escolhes? ");
            System.out.println("Escada ou porta?");
            direccao = input.next().toLowerCase();
        } while (!direccao.equals("escada") && !direccao.equals("porta"));

        if (direccao.equals("porta")) {
            System.out.println("Estava armadilhada! Ao passares pela porta caiu um pedregulho e causou-te dano");
            System.out.println("Perdeste 20 vida");
            if (hero.getVida() <= 20) {

                return false;
            }

            pressENTER();

        } else {
            if (Sala(hero, Listagem.MonstrosIniciantes())) {
                System.out.println("Parabens passaste a terceira encruzilhada");


                pressENTER();


            } else {

                return false;
            }

        }

        do {
            System.out.println("Você desce a escada e se depara com um corredor estreito e húmido. Um cheiro de mofo permeia o ar.");
            System.out.println("Segues pelo corredor? Sim ou nao?");
            direccao = input.next().toLowerCase();
        } while (!direccao.equals("sim") && !direccao.equals("nao"));


        if (direccao.equals("nao")) {
            System.out.println("Enquanto não te decidias uma criatura apareceu do nada e bloqueou-te o caminho de volta");

            if (Sala(hero, Listagem.MonstrosIniciantes())) {
                System.out.println("Parabens! Antes que apareça outra criatura, é melhor seguires em frente");


                pressENTER();

                VendedorLabirinto(hero);
            } else {

                return false;
            }
        } else {

            VendedorLabirinto(hero);
        }

        System.out.println(" À medida que te aproxima do coração do labirinto, a escuridão intensifica-se, engolindo a luz que antes iluminava teu caminho. Consegues ouvir alguns sons ensurcedores junto com alguns grunhidos.");
        Imprimir(minotaur);

        if (Sala(hero, Listagem.FinalBoss())) {

        } else {

            return false;
        }


        return true;
    }

    public boolean Sala(Heroi hero, Enemy inimigo) throws FileNotFoundException {

        if (hero.atacar(inimigo).equals(hero)) {
            hero.subirNivel();
            hero.exibirDetalhes();
            return true;
        } else {

            return false;
        }

    }

    public void VendedorLabirinto(Heroi hero) {

        int opcao = 3, item = 0;


        do {
            System.out.println("Encontras um vendedor a vender itens!");
            System.out.println("Que desejas fazer?");
            System.out.print("1 - Avançar para o labirinto? | 2 - Ver o que o vendedor tem?: ");
            opcao = input.nextInt();

            if (opcao < 1 || opcao > 2) {
                System.out.println("Escolha errada!");
            }
            if (opcao == 1) {
                return;
            }

        } while (opcao < 1 || opcao > 2);

        Vendedor vendedorEntrada = Listagem.vendedorEntrada();
        vendedorEntrada.exibirInventario();
        System.out.print("Deseja fazer alguma compra?");
        System.out.println(" O seu gold actual é: " + hero.getOuro());
        do {
            do {
                System.out.print("Por favor indique o numero do item que deseja ou 0 para sair: ");
                item = input.nextInt();

                if (item < 0 || item > vendedorEntrada.getItem().size()) {
                    System.out.println("Opção inválida! ");
                }
                if (item == 0) {
                    return;
                }

            } while (item < 0 || item > vendedorEntrada.getItem().size());


            item -= 1;
            vendedorEntrada.venderItem(item, hero);
            System.out.println("Deseja fazer outra compra?");
            System.out.print("1 - Não | 2 - Sim: ");
            opcao = input.nextInt();

        } while (opcao != 1);


    }

    public static void Imprimir(String i) throws FileNotFoundException {


        Scanner print = new Scanner(new File(i));


        while (print.hasNextLine()) {
            String line = print.nextLine();
            System.out.println(line);

        }


    }

    public static void pressENTER() throws NullPointerException {

        try {
            System.out.print("Carrega no enter para continuar: ");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        } catch (NullPointerException exception) {

            input.next();
        }
    }
}



