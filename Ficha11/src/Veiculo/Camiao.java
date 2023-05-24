package Veiculo;

public class Camiao extends Veiculo {

    private double capacidadeCarga;

    public Camiao(String marca, String modelo, int anoFabrico, int cilindrada, int potencia, double litros100km, double capacidadeCarga) {
        super(marca, modelo, anoFabrico, cilindrada, potencia, litros100km);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public boolean cargaCamiao(double carga) {
        if (carga < this.capacidadeCarga) {
            return true;
        }

        return false;

    }

    public void viagem(double distancia, double carga) {


        if (cargaCamiao(carga)) {
            System.out.println("O consumo foi de " + (super.consumoCombustivel(distancia) + (carga / 100 * 0.2) * distancia));

        } else {
            System.out.println("Viagem recusada! A carga excede o peso.");
            System.out.println("A capacidade maxima neste momento é de " + this.capacidadeCarga);
        }
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("A capacidade de carga: " + this.capacidadeCarga);
    }
}

