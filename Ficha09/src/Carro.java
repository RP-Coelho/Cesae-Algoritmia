

public class Carro {

    private String modelo, marca;
    private int anoFabrico, cilindrada, potencia;
    private double litros100km;



private tipoCombustivel combustivel;

    public Carro(String marca, String modelo, int anoFabrico, int cilindrada, int potencia, double litros100km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;

        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.litros100km = litros100km;

    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getLitros100km() {
        return litros100km;
    }

    public void setLitros100km(double litros100km) {
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

    public void setMarca(String marca) {
        this.marca = marca;

    }

    public void setModelo(String modelo) {
        this.modelo = modelo;

    }

    public void setMarca(int anoFabrico) {
        this.anoFabrico = anoFabrico;

    }

public boolean  tipoCombustivel(tipoCombustivel combustivelCarro){


    for (tipoCombustivel i : tipoCombustivel.values()) {
        if(i.equals(combustivelCarro)){

          return true;
        }
    }

    return false;
}




    public void ligarCarro() {
        System.out.println("O carro esta ligado");
    }
}