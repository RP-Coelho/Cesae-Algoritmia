public class Livro {
  //Atributos de instancia

    private String titulo,autor,categoria;
    private int paginas,isbn;

    //Mwetodo construtor

    public Livro(String titulo, String autor, String categoria, int paginas, int isbn){
       this.titulo=titulo;
       this.autor=autor;
       this.categoria=categoria;
       this.paginas=paginas;
       this.isbn=isbn;
    }

    /**
     *
     * Imprime na consola os detalhes do livro
     */
    public void exibirDetalhes(){
        System.out.println("Titulo "+this.titulo);
        System.out.println("Autor "+this.autor);
        System.out.println("Categoria "+this.categoria);
        System.out.println("Paginas "+this.paginas);
        System.out.println("ISBN "+this.isbn);

    }

}
