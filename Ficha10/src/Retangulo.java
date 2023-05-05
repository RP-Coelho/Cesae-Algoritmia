public class Retangulo {

    private double largura;
    private double altura;


    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return getLargura();
    }

    public double getAltura() {
        return getAltura();

    }

    public void setLargura(double largura) {
        this.largura = largura;

    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * metrodo que calcula a area do rentagulo
     * @return da Area do retangulo
     */
    public double area(){
        return this.altura*this.largura;
        // é boa pratica colocar "this." porque podemos trabalhar
        // com uma variavel local ao estilo de double largura, dentro
        // da funçao por exemplo

    }

    /**
     *  metodo que calcula o perimetro do rentagulo
     * @return do perimetro do retangulo
     */
    public double perimetro(){
        return (2*this.altura)+(2*this.largura);
    }
}
