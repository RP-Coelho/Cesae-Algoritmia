package Pizzaria2;

import Pizzaria2.Enums.PizzaSize;
import Pizzaria2.Ingredients.Ingredient;

import java.util.ArrayList;

public class Pizza {

    private final int MAX_INGREDIENTS = 5;
    private int id, numberOfIngredients;
    private String name, description;
    private double price;
    private PizzaSize size;
    private ArrayList<PizzaIngredients> ingredients;

    /**
     * @param id                  - Codigo que identica uma <b>Pizza</b>
     * @param numberOfIngredients - Numero de ingredientes de uma <b>Pizza</b>
     * @param name                - Nome da <b>Pizza</b>
     * @param description         - Descricao da <b>Pizza</b>
     * @param price               - Valor qe custa a <b>Pizza</b>
     * @param size                - Tamanho da <b>Pizza</b>
     */
    public Pizza(int id, int numberOfIngredients, String name, String description, double price, PizzaSize size) {
        this.id = id;
        this.numberOfIngredients = numberOfIngredients;
        this.name = name;
        this.description = description;
        this.price = price;
        this.size = size;
        this.ingredients = new ArrayList<PizzaIngredients>(MAX_INGREDIENTS);
    }

    /**
     * Metodo que permite adiconar ingredientes a Pizza
     *
     * @param ingredientsToAdd
     */
    public void addIngredients(PizzaIngredients ingredientsToAdd) {
        this.ingredients.add(ingredientsToAdd);
    }

    /**
     * Permite eitar a quntidade de um dos ingredientes da pizza
     *
     * @param id          - do ingrediente a editar
     * @param newQuantity - quantidade a alterar
     */
    public void setIngredientQuantity(int id, double newQuantity) {
        this.ingredients.get(id).setQuantity(newQuantity);

    }

    /**
     * Metodo que permite remover ingrediente da pizza
     *
     * @param id do Ingrediente a remover
     */
    public void removeIngredient(int id) {
        this.ingredients.remove(id);
    }

    public void printPizza() {
        int count = 0;
        System.out.println("Nome: " + this.name);
        for (PizzaIngredients ingrediente : this.ingredients) {
            System.out.println("ID: " + count);
            System.out.println("Ingrediente: " + ingrediente.getIngredient().getNome());
            System.out.println("Quantidade: " + ingrediente.getQuantity());
            System.out.println("");

        }
        System.out.println();

    }

    public double countCalories() {
        int count = 0;

        for (PizzaIngredients ingrediente : this.ingredients) {
            count += ingrediente.getQuantity() * ingrediente.getIngredient().getCalories()
        }
        return  count;
    }
}
