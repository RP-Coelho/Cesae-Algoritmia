package Pizzaria;

import Pizzaria.Enums.UnidadeMedida;

public class Ingrediente {
    private String codigo, nome;
    private double calorias;
    private UnidadeMedida medida;


    public Ingrediente(String codigo, String nome, double calorias, UnidadeMedida medida) {
        this.codigo = codigo;
        this.nome = nome;
        this.calorias = calorias;
        this.medida = medida;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public UnidadeMedida getMedida() {
        return medida;
    }

    public void setMedida(UnidadeMedida medida) {
        this.medida = medida;
    }
}
