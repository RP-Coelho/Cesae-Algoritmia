public class Ex7 {

    public static void main(String[] args) {

        //Instanciar os livros na class livros
        Livro javaHeadsFirst = new Livro("Heads First Java", "Kathy Sierra", "Programação",600,10002);
        Livro tresPorquinhos = new Livro("Os Três Porquinhos","Desconhecido", "Infantil", 50, 10005);

        javaHeadsFirst.exibirDetalhes();
        System.out.println("\n");
        tresPorquinhos.exibirDetalhes();


    }



}
