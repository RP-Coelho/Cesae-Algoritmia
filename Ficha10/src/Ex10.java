import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double aumento;

        //Instanciar um funcionario
        Funcionario vitor = new Funcionario("Vitor", 1000, "Formação");
        // Imprimir os dados
        vitor.exibirDados();

        System.out.println("\n");
//Ler percentagem de aumento
        System.out.print("Quanto e o aumento em percentagem");
       aumento = input.nextDouble();

       vitor.aumentarSalrio(aumento);

        System.out.println();

        vitor.exibirDados();

    }
}
