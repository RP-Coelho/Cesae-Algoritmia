

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrico;

    public Carro(String marca, String modelo, int anoFabrico){
        this.marca = marca;
        this.modelo=modelo;
        this.anoFabrico=anoFabrico;

    }

    public String getMarca(){
        return getMarca();
    }
public String getModelo(){
        return getModelo();

}
public int getAnoFabrico(){
        return  getAnoFabrico();

}

public void setMarca(String marca){
        this.marca=marca;

}
    public void setModelo(String modelo){
        this.modelo=modelo;

    }
    public void setMarca(int anoFabrico){
        this.anoFabrico=anoFabrico;

    }
    public void ligarCarro(){
        System.out.println("O carro esta ligado");
    }
}