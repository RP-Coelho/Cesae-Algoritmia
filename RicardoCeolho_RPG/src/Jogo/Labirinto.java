package Jogo;
import Instanciar.Listagem;

import java.util.Scanner;

public class Labirinto {
private Scanner input = new Scanner(System.in);
public boolean labirinto(){
int opcao=0;

    System.out.println("Chegou à entrada do Labirinto e encontra um vendedor a porta com itens em exposição");
    System.out.println("Que deseja fazer?");
    System.out.println("1 - Avançar para o labirinto? | 2 - Ver o que o vendedor tem?");
    opcao = input.nextInt();

    if(opcao==1){

    }else{


Listagem.vendedorEntrada().exibirInventario();

    }

}



}
