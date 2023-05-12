import java.util.ArrayList;

public class Competicao {
    private String nomeCompeticao,paisCompeticao;
    private ArrayList<Atleta> listaAtleta;

    public Competicao(String nomeCompeticao, String paisCompeticao, ArrayList<Atleta> listaAtleta) {
        this.nomeCompeticao = nomeCompeticao;
        this.paisCompeticao = paisCompeticao;
        this.listaAtleta = listaAtleta;

    }

    public String getNomeCompeticao() {
        return nomeCompeticao;
    }

    public ArrayList<Atleta> getListaAtleta() {
        return listaAtleta;
    }

    public String getPaisCompeticao() {
        return paisCompeticao;
    }

    public void exibirCompeticao(){

        System.out.print("Nome: "+ getNomeCompeticao()+";");
        System.out.print(" Pais: "+ getPaisCompeticao()+";");
        System.out.print("O nome do atleta participante ");
        for(Atleta atleta: listaAtleta) {

            System.out.print(atleta.getNomeAtleta() + "; ");
        }

    }
}
