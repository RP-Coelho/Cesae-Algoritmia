public class Circulo {

    // atributo de instancia
    private double raio;
    // atributo de classe
    private static double PI=3.141592;

    // metodo construtor
    public Circulo(double Raio){
        this.raio=raio;
    }
    // metodo get
    public double getRaio(){
      return this.raio;
    }

    // metodo set
    public void setRaio(double raio){
        this.raio = raio;
    }

    public double area(){
        return PI*(this.raio*this.raio);
    }
public double perimetro(){
        return  2*PI*this.raio;
}

}
