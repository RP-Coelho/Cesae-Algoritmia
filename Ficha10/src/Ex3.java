import java.util.Scanner;

public class Ex3 {
    /* Escreva um programa onde cria uma classe chamada "Retângulo" com atributos de largura e altura. Calcule
a área e o perímetro do retângulo */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// declaro as variaveis
    double largura =1.5;
   double altura = 2.5;
// instanciar um retangulo chamado terreno
  Retangulo terreno = new Retangulo(largura,altura);

        System.out.println("A area do terreno é " + terreno.area());
        System.out.println("o perimentro do terreno é de " + terreno.perimetro());

// pergunto ao utilizador para actualizar os valores do terreno
        System.out.println("Tem novas medidas?");
        System.out.println("Coloque a nova altura");
        terreno.setAltura(input.nextDouble());
        System.out.println("\n Coloque a nova largura");
        terreno.setLargura(input.nextDouble());

        System.out.println("A area do terreno é " + terreno.area());
        System.out.println("o perimentro do terreno é de " + terreno.perimetro());


        // pergunto ao utilizador para um novo terreno
        System.out.println(" medidas?");
        System.out.println("Coloque a  altura");
        altura=input.nextDouble();
        System.out.println("\n Coloque a largura");
        largura=input.nextDouble();

        Retangulo terreno2= new Retangulo(largura,altura);

        // Calcular a area e perimetro
        System.out.println("A area do terreno é " + terreno2.area());
        System.out.println("o perimentro do terreno é de " + terreno2.perimetro());

        System.out.println("\n\n");

        // Nao estava no exercicio, paa percebermos qual o retangulo maior
        // e o porque de o metodo "area" não ser void com um sout direto com o resultado
        if(terreno2.area()< terreno.area()){
            System.out.println("O terreno 2 e maior");
        }else{
            System.out.println("O terreno 1 afinal é maior");
        }
    }



}
