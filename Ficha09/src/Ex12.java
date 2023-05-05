import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        // instanciar um produt0
        Scanner input = new Scanner(System.in);

        // Declrar Variaveis
        String numeroConta, titularConta;
        double saldo, quantidade = 0;
        int opcao;


        System.out.print("Insira o Numero da conta : ");
        numeroConta = input.next();
        System.out.print("Insira o titular da conta: ");
        titularConta = input.next();
        System.out.print("Insira o seu saldo actual: ");
        saldo = input.nextDouble();

        Conta id1 = new Conta(numeroConta, titularConta, saldo);

        Conta id2 = new Conta("44503504", "Billy Gaites", 1500);
        do {
            System.out.println("\nTitular da conta: " + id1.getTitularConta());
            System.out.println("Controlo do saldo: " + id1.getSaldo());
            System.out.println("Controlo do saldo: " + id2.getTitularConta()+" - "+ id2.getSaldo());

            do {
                System.out.println("\n\n***** Menu *****");
                System.out.println("1 - Depositar saldo");
                System.out.println("2 - Levantar Saldo");
                System.out.println("3 - Mostrar Saldo");
                System.out.println("4 - Transferir Saldo");
                System.out.println("5 - Sair");

                System.out.print("\n Escolha uma opção: ");
                opcao = input.nextInt();

            } while (opcao < 1 || opcao > 5);

            switch (opcao) {
                case 1:
                    System.out.println("**** Depositar ****");
                    System.out.print("Quanto é que deseja depositar: ");
                    id1.depositar(input.nextDouble());
                    break;
                case 2:
                    System.out.println("\n**** Levantar ****");
                    System.out.print("Quanto é que deseja levantar: ");
                    id1.levantar(input.nextDouble());
                    break;
                case 3:
                    System.out.println("\n**** Saldo ****");
                    id1.getSaldo();
                    break;
                case 4:
                    System.out.println("\n**** Transferir ****");
                    String transferencia = id1.transferencia();
                    String[] transferencias = transferencia.split(";");
                   if (id1.levantar(Double.parseDouble(transferencias[1]))){
                     //   id1.levantar(Double.parseDouble(transferencias[1]));
                        id2.depositar(Double.parseDouble(transferencias[1]));
                    }

                    break;
                case 5:
                    System.out.println("Obrigado por usar!");
            }


        } while (opcao != 5);

        System.out.println("O saldo da " + id1.getTitularConta() + " é de " + id1.getSaldo());
        System.out.println("\nO saldo da " + id2.getTitularConta() + " é de " + id2.getSaldo());
    }


}
