package Veiculo;

public class Carro extends Veiculo {

    private TipoCombustivel combustivelCarro;
    private static int anoAtual = 2023;

    public Carro(String marca, String modelo, int anoFabrico, int cilindrada, int potencia, double litros100km, TipoCombustivel combustivelCarro) {
        super(marca, modelo, anoFabrico, cilindrada, potencia, litros100km);
        this.combustivelCarro = combustivelCarro;
    }

    public void ligar() {
        if ((anoAtual - this.getAnoFabrico()) > 30) {
            if (this.combustivelCarro.equals(TipoCombustivel.DIESEL)) {
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            } else {
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }
        } else {
            if (this.getPotencia() < 250) {
                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmmm");
            } else {
                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMM");
            }

        }
    }

    public double valorCombustivel() {
        double valor = 0;

        switch (this.combustivelCarro) {
            case GPL -> valor = 0.95;
            case DIESEL -> valor = 1.75;
            case GASOLINA -> valor = 1.95;

        }
        return valor;
    }



    public double custoCombustivel(double km) {

        return (valorCombustivel() * super.consumoCombustivel(km));
    }

  public void exibirDetalhes(){
        super.exibirDetalhes();
      System.out.println("Tpo combustivel: "+ this.combustivelCarro);
  }
}