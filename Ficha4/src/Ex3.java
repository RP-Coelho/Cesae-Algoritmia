import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//. Crie um jogo, que peça ao jogador 1 um valor entre 0 e 100. De seguida, deverá permitir ao jogador 2 tentar
//acertar no valor inserido pelo jogador 1. A cada iteração, enquanto o valor não for descoberto, deverá informar
//se o valor introduzido pelo jogador 2 é inferior ou superior ao valor inserido pelo jogador 1. No final (quando o
//valor é descoberto) deverá apresentar o número de tentativas que o jogador 2 necessitou para acertar.

        int n1, n2, counter = 1;

        System.out.println("Diga-me um valor de 0 a 100");
        n1 = input.nextInt();

        System.out.println("Diga-me um valor de 0 a 100");
        n2 = input.nextInt();

        if (n1 < 0 || n1>100) {

            System.out.println("Erro numero invalido");
        } else if (n1 == n2) {

            System.out.println("Acertou! " + counter);
        } else {
            while (n2 != n1) {
                if (n2 < n1) {
                    System.out.println("O valor e inferior! Tenta mais alto");
                } else if (n1 < n2) {
                    System.out.println("O valor e superior! Tenta mais baixo");
                }
                System.out.println("Diga-me um valor de 0 a 100");
                n2 = input.nextInt();
                counter++;

            }
            System.out.println("O valor é esse parabens! " + counter);
        }


    }
}