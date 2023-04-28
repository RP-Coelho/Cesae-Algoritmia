import java.util.Scanner;

public class Ex1 {
/*Escreva um programa onde cria uma classe chamada "Pessoa" com um atributo de nome, idade e altura.
Crie duas instâncias da classe "Pessoa", defina os seus atributos usando o construtor e imprima seu nome,
idade e altura*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = "Ricardo";
        int idade = 30;
        double altura = 1.60;

        Pessoa ricardo = new Pessoa(nome,idade,altura);
        Pessoa gabriel = new Pessoa("Gabriel",29,1.73);
        System.out.println("Diga-me o seu nome");
       String nomeInput=input.nextLine();
        System.out.println("Diga-me a sua idade");
        idade= input.nextInt();
        System.out.println("Diga-me a sua altura");
        altura= input.nextDouble();

        Pessoa nomeRandom = new Pessoa(nomeInput,idade,altura);

        System.out.println("Nom da primeira Pessoa: " + ricardo.getNome());
        System.out.println("Idade da primera Pessoa: " + ricardo.getIdade());
        System.out.println("Altura da primeira Pessoa " + ricardo.getAltura());

        System.out.println("\n ----------------------- \n");

        System.out.println("Nom da segunda Pessoa: " + gabriel.getNome());
        System.out.println("Idade da segunda Pessoa: " + gabriel.getIdade());
        System.out.println("Altura da segunda Pessoa " + gabriel.getAltura());

        System.out.println("\n ----------------------- \n");

        System.out.println("Nom da terceira Pessoa: " + nomeRandom.getNome());
        System.out.println("Idade da terceira Pessoa: " + nomeRandom.getIdade());
        System.out.println("Altura da terceira Pessoa " + nomeRandom.getAltura());
    }

}
