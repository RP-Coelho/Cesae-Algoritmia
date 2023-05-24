package Veiculo;

public class Veiculo {
    private String modelo, marca;
    private int anoFabrico, cilindrada, potencia;
    private double litros100km;

    private static int anoAtual = 2023;

    public Veiculo(String marca, String modelo, int anoFabrico, int cilindrada, int potencia, double litros100km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.litros100km = litros100km;

    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnoFabrico() {
        return anoFabrico;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public double getLitros100km() {
        return litros100km;
    }

    public static int getAnoAtual() {
        return anoAtual;
    }

    public void ligar() {

    }

    public Veiculo corrida(Veiculo veiculo2) {

        if (this.potencia > veiculo2.potencia) {
            return this;

        } else if (this.potencia == veiculo2.potencia) {
            if (this.cilindrada > veiculo2.cilindrada) {
                return this;

            } else if (this.cilindrada == veiculo2.cilindrada) {
                if ((anoAtual - this.anoFabrico) > (anoAtual - veiculo2.anoFabrico)) {
                    return this;

                } else if ((anoAtual - this.anoFabrico) == (anoAtual - veiculo2.anoFabrico)) {
                    return null;

                } else {
                    return veiculo2;

                }

            } else {
                return veiculo2;

            }

        } else {
            return veiculo2;

        }


    }

    public double consumoCombustivel(double km) {
        return km / 100 * this.litros100km;
    }

    public void exibirDetalhes(){

        System.out.println("A marca: " + this.marca);
        System.out.println("O modelo: " + this.modelo);
        System.out.println("O ano de fabrico: " + this.anoFabrico);
        System.out.println("A potencia: "+ this.potencia);
        System.out.println("A cilindrada: " + this.cilindrada);
        System.out.println("O consumo dos litros: "+ this.litros100km);
    }


}
