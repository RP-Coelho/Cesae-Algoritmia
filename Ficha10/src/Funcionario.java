public class Funcionario {

    private String nome, departamento;
    private double salario;


    public Funcionario(String nome, double salario, String departamento){

        this.nome=nome;
        this.salario=salario;
        this.departamento=departamento;
    }
    public void aumentarSalrio(double aumento){
        this.salario*=(1+(aumento/100)) ; // esta função recebe um double como percetual Ex 15%
    }

    public void exibirDados(){
        System.out.println("Nome " + this.nome);
        System.out.println("Salario " +this.salario);
        System.out.println("Departamento " + this.departamento);
    }
}
