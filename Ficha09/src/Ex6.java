import java.util.ArrayList;

public class Ex6 {

    public static void main(String[] args) {

Atleta atleta1 = new Atleta("Obikuelu","Atletismo","Porutgal",85,1.95);
Atleta atleta2 = new Atleta("Evora","Salto","Portugal",85,1.95);
Atleta atleta3 = new Atleta("Mamona","Atletismo","Portugal",65,1.80);


        ArrayList<Atleta> listaAtleta1 = new ArrayList<Atleta>();
        listaAtleta1.add(atleta1);
        listaAtleta1.add(atleta2);
        listaAtleta1.add(atleta3);

        ArrayList<Atleta> listaAtleta2 = new ArrayList<Atleta>();
        listaAtleta2.add(atleta1);
        listaAtleta2.add(atleta3);

   Competicao torneio = new Competicao("Olimpiadas","Portugal", listaAtleta1);
   Competicao torneio2 = new Competicao("Tour","Espanha",listaAtleta2);



   torneio2.exibirCompeticao();
    }
}
