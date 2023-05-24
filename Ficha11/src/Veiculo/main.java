package Veiculo;

public class main {

   public static void main(String[] args) {


   Carro carro1 = new Carro("bmw", "serie 1", 1985, 1499, 65, 5.5, TipoCombustivel.DIESEL);
   Carro carro2 = new Carro("Mercedes", "A-250", 2010, 1499, 150, 7.5, TipoCombustivel.GPL);

   Mota yamaha = new Mota("Yamaha","C250",2017,1995,350,5.6);

   Camiao toyota =new Camiao("Toyota","CT140",2014,1650,750,10.5,850);


   // Corrida entre dois veiculos
      System.out.println("***** Corrida *****");
      if(carro1.corrida(yamaha)==carro1){
carro1.exibirDetalhes();
      }else{
yamaha.exibirDetalhes();
      }

   // corrida entre doiss carros
      System.out.println("\n***** Outra corrida *****");

      if(toyota.corrida(carro2)==toyota){
         toyota.exibirDetalhes();
      }else{
carro2.exibirDetalhes();
      }

   // Custo de uma viagem de carro

      System.out.println("\nCusto de uma viagem de carro de 300kms");
      System.out.println(carro2.custoCombustivel(300));

   // Viagem valida de camião
      System.out.print("\nViagem válida para 600kgs ");
      System.out.println(toyota.cargaCamiao(600));

   // Viagem valida de camião
      System.out.println("\nViagem inválida para 3000kgs ");
       System.out.println(toyota.cargaCamiao(6000));

    // Imprimir a motinha

       yamaha.imagem();


}
}
