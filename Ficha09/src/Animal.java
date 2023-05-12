import java.util.ArrayList;

public class Animal {

    private String nome, especie, paisOrigem;

    private double peso;
private ArrayList<String> listaAlimentacao;


    public Animal(String nome, String especie, String paisOrigem, double peso, ArrayList<String> listaAlimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.paisOrigem = paisOrigem;
        this.peso = peso;
        this.listaAlimentacao=listaAlimentacao ;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comer(String alimento, int gramas) {
        gramas /= 1000;
        boolean p = true;
        for (String alimentacao : this.listaAlimentacao) {
            if (alimento.equals(alimentacao)) {
                this.peso += gramas;
                System.out.println("O animal comeu");
                p = false;
                break;
            }
        }
        if (p) {
            System.out.println("O animal recusou essa comida");
        }
    }


}
