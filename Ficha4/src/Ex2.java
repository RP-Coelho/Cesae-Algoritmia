import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//Implemente um programa que leia a opção do menu desejada (opções: 1. Criar, 2. Atualizar, 3. Eliminar, 4. Sair).
//Se uma das opções 1, 2 e 3 for escolhida, deverá apresentar um texto com a opção escolhida. Caso a escolha
//esteja fora das opções válidas, deverá informar o utilizador. De seguida, deverá apresentar novamente o menu
//para poder selecionar novas opções até que a opção 4 seja escolhida
        int opcao;

        do {
            do {
                System.out.println("\n\n1. Criar");
                System.out.println("2. Atualizar");
                System.out.println("3. Eliminar");
                System.out.println("4. Sair");
                System.out.println("");
                System.out.println("Que opção deseja");
                opcao = input.nextInt();

                if (opcao < 1 || opcao > 4) {
                    System.out.println("Erro");
                }
            } while (opcao < 1 || opcao > 4);

            switch (opcao)  {
                case 1:
                    System.out.println("Escolheu - Criar");
                    break;
                case 2:
                    System.out.println("Escolheu - Atualizar");
                    break;
                case 3:
                    System.out.println("Escolheu - Eliminar");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Erro, opção invalida ");
            }



        } while (opcao != 4);


    }
}

