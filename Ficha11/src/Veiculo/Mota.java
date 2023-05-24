package Veiculo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veiculo {

    public Mota(String marca, String modelo, int anoFabrico, int cilindrada, int potencia, double litros100km) {
        super(marca, modelo, anoFabrico, cilindrada, potencia, litros100km);
    }

    public void lerImagem() throws FileNotFoundException {


            Scanner ficheiro = new Scanner(new File("src/Veiculo/Mota.txt"));
            while (ficheiro.hasNextLine()) {

                System.out.println(ficheiro.nextLine());
            }


    }

    public void imagem(){
        try {
            lerImagem();
        }catch (FileNotFoundException exception){
            System.out.println("Erro a importar ficheiro - Imagem não impressa!");
        }

    }

}
