public class Produto {

    private String nome;
    private double preco;
    private int stock;

    public Produto(String nome, double preco){
        this.nome=nome;
        this.preco=preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public void comprar(int quantidade){
        this.stock+=quantidade;
    }
    public void vender(int quantidade){
        if(this.stock>=quantidade) {
            this.stock -= quantidade;
        }else{
            System.out.println("O Stock não deixa realizar essa operação, neste momento temos \n"+ this.stock +  "unidade");
        }
    }


    public int getStock(){
        return this.stock;
    }
}
