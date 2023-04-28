public class Ex2 {

    /*2. Escreva um programa onde cria uma classe chamada "Cão" com um nome e um atributo de raça. Deve
conter um método de ladrar (imprime na consola um latido). Crie três instâncias da classe "Cão", defina os
seus atributos usando o construtor e modifique os atributos usando os métodos setter e imprima os
valores atualizados.*/

    public static void main(String[] args) {
String nome= "Max";
String raca= "Pastor Alemão";

Cao max = new Cao(nome, raca);

nome="Bobby";
raca="Pastor Belga";

Cao bobby = new Cao(nome,raca);


Cao cookie = new Cao("Cookie","Pincher");

        System.out.println("Nome do primeiro cao: " + bobby.getNome());
        System.out.println("Raça do primero cao: " + bobby.getRaca());


        System.out.println("\n ----------------------- \n");

        System.out.println("Nome do segundo cao: " + max.getNome());
        System.out.println("Raça do segundo cao: " + max.getRaca());


        System.out.println("\n ----------------------- \n");

        System.out.println("Nome do terceiro cao: " + cookie.getNome());
        System.out.println("Raça do terceiro cao: " + cookie.getRaca());


        System.out.println("\n ----------------------- \n");

cookie.setNome("Brownie");

        System.out.println("o novo nome é da cookie é " + cookie.getNome());
    }



}
