

public class Carro {

    private String modelo, marca;
    private int anoFabrico, cilindrada, potencia;
    private double litros100km;
    private tipoCombustivel combustivelCarro;
    private static int anoAtual = 2023;

    public Carro(String marca, String modelo, int anoFabrico, int cilindrada, int potencia, double litros100km, tipoCombustivel combustivelCarro) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;

        this.cilindrada = cilindrada;
        this.potencia = potencia;
        this.litros100km = litros100km;
        this.combustivelCarro = combustivelCarro;
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

    public tipoCombustivel getCombustivelCarro() {
        return combustivelCarro;
    }

    public void setCombustivelCarro(tipoCombustivel combustivelCarro) {
        this.combustivelCarro = combustivelCarro;
    }

    public boolean tipoCombustivel(tipoCombustivel combustivelCarro) {


        for (tipoCombustivel i : tipoCombustivel.values()) {
            if (i.equals(combustivelCarro)) {

                return true;
            }
        }

        return false;
    }


    public void ligarCarro() {
        if ((anoAtual - this.anoFabrico) > 30) {
            if (this.combustivelCarro.equals(tipoCombustivel.DIESEL)) {
                System.out.println("Deita um pouco de fumo... Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            } else {
                System.out.println("Custa a pegar... O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }
        } else {
            if (this.potencia < 250) {
                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmmm");
            } else {
                System.out.println("O carro está ligado!");
                System.out.println("VRUMMMMMM");
            }

        }
    }

    public Carro corrida(Carro carro2) {

        if (this.potencia > carro2.potencia) {
            return this;

        } else if (this.potencia == carro2.potencia) {
            if (this.cilindrada > carro2.cilindrada) {
                return this;

            } else if (this.cilindrada == carro2.cilindrada) {
                if ((anoAtual - this.anoFabrico) > (anoAtual - carro2.anoFabrico)) {
                    return this;

                } else if ((anoAtual - this.anoFabrico) == (anoAtual - carro2.anoFabrico)) {
                    return null;

                } else {
                    return carro2;

                }

            } else {
                return carro2;

            }

        } else {
            return carro2;

        }


    }

    public double consumoCombustivel(double km) {
        return km / 100 * this.litros100km;
    }


}