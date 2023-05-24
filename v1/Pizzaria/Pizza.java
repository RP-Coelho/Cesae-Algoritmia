package Pizzaria;

import Pizzaria.Enums.Tamanho;
import Pizzaria.Enums.UnidadeMedida;
import Veiculo.Carro;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class Pizza {
    private String nome, codigo, descricao;
    private double preco;

    private ArrayList<Double> quantidade;
    private Tamanho tamanho;

    private final int numeroIngredientes = 5;
    private ArrayList<Ingrediente> ingrediente;



    public Pizza(String nome, String codigo, String descricao, double preco, ArrayList<Double> quantidade, Tamanho tamanho, ArrayList<Ingrediente> ingrediente) {
        this.nome = nome;
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
        this.tamanho = tamanho;

        this.ingrediente = ingrediente;
    }


    public int getNumeroIngredientes() {
        return numeroIngredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }





    public void combinacaoIngredientes(ArrayList<Ingrediente> listaTotal) {
        Scanner sc = new Scanner(System.in);
        String opcao;
        String[] opcao2;
        int count = 1;

        for (Ingrediente ingrediente : listaTotal) {
            System.out.println("Ingediente " + count + " - " + ingrediente);

            count++;
        }
        do {
            System.out.println("Escolha 5 ingredientes desta lista");
            System.out.println("Diga-me o numero da lista de ingredientes que deseja na pizza");
            System.out.println("Separe por virgulas \",\" ");
            opcao = sc.nextLine();
            opcao = sc.nextLine();
            opcao2 = opcao.split(",");
            if (opcao2.length != 5) {
                System.out.println("Erro, numero de ingredientes escolhidos invalido");
            }
        } while (opcao2.length != 5);
        for (int i = 0; i < opcao2.length; i++) {
            this.ingrediente.add(listaTotal.get(i));
        }
    }
}



