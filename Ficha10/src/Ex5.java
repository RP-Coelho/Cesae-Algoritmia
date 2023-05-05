import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

    String marca="bmw", modelo="serie 1";
    int anoFabrico=2019;


    Carro carro1=new Carro(marca,modelo,anoFabrico);

carro1.ligarCarro();

}
}


