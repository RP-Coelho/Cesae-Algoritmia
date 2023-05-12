import java.util.ArrayList;


public class Agenda {


    private ArrayList<Pessoa> agenda = new ArrayList<>();


    //metodo construtor é passarmos como parametro o nosso Arraylist de pessoas
    public Agenda(ArrayList<Pessoa> pessoa){
        this.agenda=pessoa;
    }

    public ArrayList<Pessoa> getAgenda() {
        return agenda;
    }

    public void getAll(){
        for(Pessoa pessoa:agenda){
            System.out.print("O nome é " + pessoa.getNome()+";");
            System.out.print(" A idade é "+ pessoa.getIdade()+";");
            System.out.print(" o email é "+ pessoa.getEmail()+";");
            System.out.print(" O telemovel é " + pessoa.getTelefone()+";"+"\n");


        }
    }
}
