import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Diga-me o raio da circunferencia");
        double raio= input.nextDouble();


        Circulo circulo = new Circulo(raio);

        System.out.println("A area da circunferencia é de " + circulo.area());
        System.out.println("O perimetro da circunferencia é de " + circulo.perimetro());


        System.out.println("o raio da circunferencia mudou?");
circulo.setRaio(input.nextDouble());

        System.out.println("A area da circunferencia é de " + circulo.area());
        System.out.println("O perimetro da circunferencia é de " + circulo.perimetro());



    }


}
