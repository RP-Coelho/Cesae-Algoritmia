import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {
        // instanciar um produt0
        Scanner input = new Scanner(System.in);

        // Declrar Variaveis
        String nome;
        double preco;
        int opcao, quantidade = 0;

        System.out.print("Insira o nome do produto: ");
        nome = input.next();
        System.out.print("Insira o preço do produto: ");


        preco = input.nextDouble();
        Produto produto = new Produto(nome, preco);
        do {
            System.out.println("\nControlo do produto: "+ produto.getNome());
            System.out.println("Controlo do preco: "+ produto.getPreco());

            do {
                System.out.println("\n\n***** Menu *****");
                System.out.println("1 - Comprar Produto");
                System.out.println("2 - Vender Produto");
                System.out.println("3 - Consultar Stock");
                System.out.println("4 - Sair");

                System.out.print("\n Escolha uma opção: ");
                opcao = input.nextInt();

            } while (opcao < 1 || opcao > 4);

            switch (opcao) {
                case 1:
                    System.out.println("**** Comprar ****");
                    System.out.print("Wantas unidades quer comprar: ");

                    quantidade = input.nextInt();
                    produto.comprar(quantidade);
                    break;
                case 2:
                    System.out.println("\n**** Vender ****");
                    System.out.print("Quantas unidades quer vender");
                   quantidade = input.nextInt();
                   produto.vender(quantidade);
                   break;
                case 3:
                    System.out.println("\n**** Stock ****");
                    System.out.println("O stock é: "+ produto.getStock());
                    break;
                case 4:
                    System.out.println("Obrigado por usar!");
            }





        } while (opcao != 4);
    }


}
