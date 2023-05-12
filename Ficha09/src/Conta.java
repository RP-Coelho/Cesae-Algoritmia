import java.util.Scanner;

public class Conta {
    Scanner input = new Scanner(System.in);
    private String numeroConta, titularConta;
    private double saldo, valorDivida, margemEmprestimo;

    private int anoAbertura;


    public Conta(String numeroConta, String titularConta, double saldo) {
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldo = saldo;
        this.anoAbertura = 2023;
        this.valorDivida = 0;
        this.margemEmprestimo = 0.9 * saldo;

    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double getMargemEmprestimo() {
        return margemEmprestimo;
    }



    public int getAnoAbertura() {
        return anoAbertura;
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
        this.margemEmprestimo=saldo*0.9;
    }

    public String transferencia() {
        System.out.print("Diga-me a conta de destino: ");
        String contaDestino = input.next();
        System.out.print("Diga-me valor a executar: ");
        double valor = input.nextDouble();
        contaDestino += ";" + valor;
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

    public boolean pedirEmprestimo(double valor) {
        if (this.valorDivida >= 0) {

            if (valor <= margemEmprestimo) {
                this.setSaldo(valor);
                this.setValorDivida(-valor);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
