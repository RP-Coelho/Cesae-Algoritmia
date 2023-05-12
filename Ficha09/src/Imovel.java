public class Imovel {
    private String rua, cidade;
    private int nPorta, nQuartos, nBanho;
    private Tipo tipoImovel;
    private Acabamento acabamentoImovel;
    private double area, areaPiscina, valorTotal;

    public Imovel(String rua, String cidade, int nPorta, int nQuartos, int nBanho, Tipo tipoImovel, Acabamento acabamentoImovel, double area, double areaPiscina) {
        this.rua = rua;
        this.cidade = cidade;
        this.nPorta = nPorta;
        this.nQuartos = nQuartos;
        this.nBanho = nBanho;
        this.tipoImovel = tipoImovel;
        this.acabamentoImovel = acabamentoImovel;
        this.area = area;
        this.areaPiscina = areaPiscina;
        this.valorTotal = 0;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    public int getnPorta() {
        return nPorta;
    }

    public int getnQuartos() {
        return nQuartos;
    }

    public int getnBanho() {
        return nBanho;
    }

    public Tipo getTipoImovel() {
        return tipoImovel;
    }

    public Acabamento getAcabamentoImovel() {
        return acabamentoImovel;
    }

    public double getArea() {
        return area;
    }

    public double getAreaPiscina() {
        return areaPiscina;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setAcabamentoImovel(Acabamento acabamentoImovel) {
        this.acabamentoImovel = acabamentoImovel;
    }

    public double tipoImovel(Tipo imovel){
        switch(imovel){
            case apartamento -> {
                return this.area*1000;
            }

            case casa -> {
                return this.area*3000;
            }
            case mansão -> {
                return this.area*5000;
            }
            default -> throw new IllegalStateException("Opção não encontrada: " + this.tipoImovel);
        }
    }

    public double tipoAcabamento(Acabamento acabamento){
        switch (acabamento){
            case restauro -> {
                return 0.5;
            }
            case usada -> {
                return 0.9;
            }
            case nova -> {
                return 1;
            }
            case altoAcabamento -> {
                return 1.25;
            }
            default -> throw new IllegalStateException("Opção não encontrada: " + this.acabamentoImovel);
        }
    }

    public double imovelCalculo() {
     valorTotal=tipoImovel(tipoImovel)*tipoAcabamento(acabamentoImovel);
     valorTotal+=nQuartos*7500+nBanho*10.500;
     valorTotal+=areaPiscina*1000;


        setValorTotal(valorTotal);
        return valorTotal;
    }

    public void imprimirDescricao(){

        System.out.println("O Tipo de casa é: "+ getTipoImovel());
        System.out.println("O Acabamento de casa é: "+ getAcabamentoImovel());
        System.out.println("O Numero de quartos da casa é: "+ getnQuartos());
        System.out.println("O Numero de casas de banho da casa é: "+ getnBanho());
        System.out.println("A area da casa é: "+ getArea());
        System.out.println("A area da piscina é: "+ getAreaPiscina());
        System.out.println("A morada da casa é: "+ getRua()+" "+ getnPorta()+ ", "+getCidade()  );
        System.out.println("\n O valor da casa é: "+ getValorTotal());

    }

    public Imovel compararImoveis(Imovel imovel2){
        if(imovelCalculo()>imovel2.imovelCalculo()){
            return this;
        }else if(this.valorTotal==imovel2.imovelCalculo()){
            return null;
        }else{
            return imovel2;
        }
    }
}
