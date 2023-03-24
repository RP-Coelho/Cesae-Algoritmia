import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int id, x, y;
        String rsp = "N", nome, cargo;

        do {
            do {
                System.out.println("Tenha a mao a seguinte informação");
                System.out.println("O seu codigo de Funcionario");
                System.out.println("O seu nome de Funcionario");
                System.out.println("O seu cargo de Funcionario");
                System.out.println("Quantos meses trabalhou");
                System.out.println("Quantos dias trabalhou");
                System.out.println("");
                System.out.println("");

            } while (!rsp.equals("N"));

            do {
                do {
                    System.out.println("Qual o seu codigo de Funcionario");
                    id = input.nextInt();
                    System.out.println("Deseja refazer?");
                    rsp = input.next();

                } while (!rsp.equals("N"));
                System.out.println("Deseja Prosseguir?");
                rsp = input.next();
            }while (!rsp.equals("S"));

            do {
                System.out.println("Qual o seu nome de Funcionario");
                nome = input.next();
                System.out.println("Deseja prosseguir?");
                rsp = input.next();
            } while (!rsp.equals("N"));

            do {
                System.out.println("Qual o seu cargo de Funcionario");
                cargo = input.next();
                System.out.println("Deseja prosseguir?");
                rsp = input.next();
            } while (!rsp.equals("N"));

            do {
                System.out.println("Quantos meses trabalhou");
                x = input.nextInt();
                System.out.println("Deseja prosseguir?");
                rsp = input.next();
            } while (!rsp.equals("N"));

            do {
                System.out.println("Quantos dias trabalhou");
                y = input.nextInt();
                System.out.println("Deseja prosseguir?");
                rsp = input.next();
            } while (!rsp.equals("N"));

            System.out.println("Deseja prosseguir?");
            rsp = input.next();
        } while (!rsp.equals("N"));


    }
}
