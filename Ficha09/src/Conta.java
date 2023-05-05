import java.util.Scanner;

public class Conta {
    Scanner input = new Scanner(System.in);
    private String numeroConta, titularConta;
    private double saldo;

    public Conta(String numeroConta, String titularConta, double saldo) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String transferencia() {
        System.out.print("Diga-me a conta de destino: ");
        String contaDestino = input.next();
        System.out.print("Diga-me valor a executar: ");
        double valor = input.nextDouble();
         contaDestino += ";"+valor;
        return contaDestino;

    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean levantar(double valor) {

        if (valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("O saldo não é suficiente para executar esta operação ");
            System.out.println("O seu saldo actual é de " + getSaldo());
            return false;
        }
    }
}
