public class Cao {

    private String nome;
    private String raca;

    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;

    }

    public void ladrar(){
        System.out.println("Ruff Ruff!");
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setRaca(String nome){
        this.raca=raca;
    }

}
