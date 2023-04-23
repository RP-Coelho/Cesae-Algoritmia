import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex10 {
/*10. Escreva um programa que leia um ficheiro CSV contendo informações de vendas (tipo de produto, produto,
quantidade vendida, valor unitario) e calcule o valor total das vendas.*/

    public static int nlinhas() throws FileNotFoundException {

        Scanner ficheiro = new Scanner(new File("FichaPratica08/exercicio_10.csv"));

        int nlinhas = 0;


        while (ficheiro.hasNextLine()) {
            String line = ficheiro.nextLine();
            nlinhas++;

        }

        return nlinhas;


    }

    public static void LerFicheiro(int nlinhas) throws FileNotFoundException {

        Scanner ficheiro = new Scanner(new File("FichaPratica08/exercicio_10.csv"));
        int z = 0;
        String[][] dados = new String[nlinhas][6];
        double [] valorTotalLinha = new double[nlinhas];
        int total=0;
        while (ficheiro.hasNextLine()) {
            String line = ficheiro.nextLine();
            String[] colunas = line.split(",");
            for (int i = 0; i < colunas.length; i++) {
                dados[z][i] = colunas[i];
            }
            z++;

        }
        dados[0][4]="Total Vendido";

        for (int i = 0; i < dados.length;i++){
            if (i>0){
           valorTotalLinha[i]=Integer.parseInt(dados[i][2])*Double.parseDouble(dados[i][3]);
            dados[i][4]=valorTotalLinha[i]+"";}

            for(z=0; z <dados[0].length-1;z++){
                System.out.print(dados[i][z]);
                System.out.print(" || ");
            }
            System.out.println("");
         total+=valorTotalLinha[i];
        }

        System.out.println("\n O valor vendido total foi de "+total);
    }



  public static void main(String[] args) throws FileNotFoundException {

        try {
LerFicheiro(nlinhas());

        } catch (FileNotFoundException exc) {
            System.out.println("Grande ficheiro não encontrado catano!");
        }
    }
}
