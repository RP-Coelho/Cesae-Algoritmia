package Entidades;

public abstract class Entidade {
    private String nome;
    private int vida;
    private int forca;

    /**
     * Metodo construtor da nossa classe abstracta Entidade
     * @param nome -> Nome da entidade
     * @param vida -> Vida da entidade
     * @param forca -> Força da entidade
     */
    public Entidade(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    /**
     * Metodo para conseguir aceder ao atributo vida
     * @return a vida que a entidade tenha
     */
    public int getVida() {
        return vida;
    }

    /**
     * Metodo para modificar a vida da entidade
     * @param vida -> A vida que modifica
     */
    public void setVida(int vida) {
        this.vida += vida;
    }

    /**
     * Metodo para conseguir aceder ao atributo força
     * @return a força que a entidade tenha
     */
    public int getForca() {
        return forca;
    }

    /**
     * Metodo para modificar a força da entidade
     * @param forca -> a modificar
     */
    public void setForca(int forca) {
        this.forca += forca;
    }

    /**
     * Metodo para aceder ao atributo do nome
     * @return o nome da nossa entidade
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo abstracto de exibir detalhes para forçarmos a implementação nas nossas subclasses.
     */
    public abstract void exibirDetalhes();



}
