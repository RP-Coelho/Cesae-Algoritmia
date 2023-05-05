public class Cao {
 // declarar atributos - variaveis de estacias porque nao tem o "static"
    private String nome;
    private String raca;

    // metodo construtor
    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;

    }

    public void ladrar(){
        System.out.println("Ruff Ruff!");
    }


    // metodos get - para devolvermos as nossas variaveis "privadas" de volta para o main
    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }
// metodos setter para podermos alterar/actualizar as nossas variaveis no metodo "construtor"
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setRaca(String nome){
        this.raca=raca;
    }

}
