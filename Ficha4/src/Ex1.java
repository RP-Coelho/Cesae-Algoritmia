import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Implemente um programa que peça ao utilizador dois valores e um carácter representando uma das quatro
        //operações aritméticas (+, -, *, /). Apresente o resultado de aplicar a operação correspondente aos valores. No
        //final, deverá perguntar ao utilizador se deseja repetir, permitindo-lhe efetuar novos cálculos. Exemplo: Deseja
        //continuar? (introduza s/n).

        double num1, num2, vt = 0;
        String oper, opcao = "S";


        while (opcao.equals("S")) {

            System.out.println("Numero 1:");
            num1 = input.nextInt();
            System.out.println("Numero 2");
            num2 = input.nextInt();
            System.out.println("Que operação quer proceder");
            oper = input.next();

            switch (oper) {
                case "+":
                    vt = num1 + num2;
                    break;
                case "-":
                    vt = num1 - num2;
                    break;
                case "*":
                    vt = num1 * num2;
                    break;
                case "/":
                    vt = num1 / num2;
                    break;
                default:

            }

            System.out.println("O resultado é " + vt);

         System.out.println("Deseja fazer novo valculo? Introduza S ou N");
            opcao = input.next();

                if (opcao.equals("S")) {
                    opcao = "S";
                } else if (opcao.equals("N")) {
                    opcao = "N";
                    System.out.println("Obrigado por usar o nosso programa");
                }
        }
    }
}