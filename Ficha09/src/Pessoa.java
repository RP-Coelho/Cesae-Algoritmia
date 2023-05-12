public class Pessoa {


    private String nome, email;
    private int idade, telefone;
    private double altura;


    public Pessoa(String nome, int idade, double altura, String email, int telefone) {

        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.email = email;
        this.telefone = telefone;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;

    }

    public double getAltura() {
        return this.altura;
    }


}
