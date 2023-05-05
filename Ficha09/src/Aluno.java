public class Aluno {
    // Atributos de instancia
    private String nome, curso;
    private int idade;
    private double media;

    // Metodo construtor

    public  Aluno(String nome, int idade, String curso, double media){
        this.nome=nome;
        this.idade=idade;
        this.curso=curso;
        this.media=media;

    }


    // Metodo situação

    /**
     *
     * @return true se aprovado || false se reprovado
     */
    public boolean situacao() {
        if (this.media >= 9.5) {
            System.out.println("Aprovado");
            return true;
        } else {
            System.out.println("Reprovado");
            return false;
        }
    }
}

