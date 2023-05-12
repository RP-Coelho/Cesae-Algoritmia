import java.util.ArrayList;
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


        Pessoa ricardo = new Pessoa(nome, idade, altura, "example@gmail.com", 9874573);
        Pessoa gabriel = new Pessoa("Gabriel", 29, 1.73, "teste@gmail.com", 9874573);
        Pessoa nomeRandom = new Pessoa("Joaquim", 35, 1.85, "blabla@gmail.com", 9874573);

        ArrayList<Pessoa> agenda = new ArrayList<>();
        agenda.add(ricardo);
        agenda.add(gabriel);
        agenda.add((nomeRandom));

Agenda listaPessoa= new Agenda(agenda);

        System.out.println("------");
        listaPessoa.getAll();
    }

}
