public class Atleta {
    private String nomeAtleta, modalidade,paisOrigem;
    private double pesoAtleta,altura;

    public Atleta(String nomeAtleta, String modalidade, String paisOrigem, double pesoAtleta, double altura) {
        this.nomeAtleta = nomeAtleta;
        this.modalidade = modalidade;
        this.paisOrigem = paisOrigem;
        this.pesoAtleta = pesoAtleta;
        this.altura = altura;
    }

    public String getNomeAtleta() {
        return nomeAtleta;
    }

    public void setNomeAtleta(String nomeAtleta) {
        this.nomeAtleta = nomeAtleta;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public double getPesoAtleta() {
        return pesoAtleta;
    }

    public void setPesoAtleta(double pesoAtleta) {
        this.pesoAtleta = pesoAtleta;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
