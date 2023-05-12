
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        Carro carro1 = new Carro("bmw", "serie 1", 1985, 1499, 65, 5.5, tipoCombustivel.valueOf("DIESEL"));
        Carro carro2 = new Carro("Mercedes", "A-250", 2010, 1499, 150, 7.5, tipoCombustivel.valueOf("GPL"));

        carro1.ligarCarro();

        if (carro1.corrida(carro2) == null) {
            System.out.println("Empatados");

        } else if (carro1.corrida(carro2) == carro2) {
            System.out.println("Venceu carro 2");

        } else {
            System.out.println("Venceu carro 1");
        }

        if(carro1.consumoCombustivel(97)< carro2.consumoCombustivel(97)){
            System.out.println("Carro 1 consome menos "+carro1.consumoCombustivel(97));
            System.out.println("Carro 2 "+carro2.consumoCombustivel(97));
        } else if (carro1.consumoCombustivel(97) == carro2.consumoCombustivel(97)) {
            {
                System.out.println("Consomem o mesmo!" + carro1.consumoCombustivel(97));
            }
        }else{
            System.out.println("Carro 1  "+carro1.consumoCombustivel(97));
            System.out.println("Carro 2 consome menos "+carro2.consumoCombustivel(97));
        }

    }
}


