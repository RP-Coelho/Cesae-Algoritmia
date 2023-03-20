
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//. Implemente um programa que, após pedir ao utilizador o saldo da conta bancária e montante a creditar/debitar
//(montante positivo ou negativo, respetivamente), apresente se a operação é válida, ou seja, se o slado final se
//mantem positivo depois da operação

        double saldo, mov, total;
        System.out.println("Diga-me o saldo bancario");
        saldo = input.nextDouble();
        System.out.println("Valor do movimento");
        mov = input.nextDouble();

        total=saldo+mov;

        if(total>=0){
        System.out.println("O operação valida! O seu saldo actual é de " + total+"€");
    }else {
        System.out.println("Operação invalida! O saldo nao permite essa operação, ficarai com " + total+"€");
    }
}
}