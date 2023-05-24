package Pizzaria2.Ingredients;

import Pizzaria2.Enums.IngredientMeasureUnits;

public class Ingredient {
private int id;
private String nome;
private IngredientMeasureUnits measureUnit;
private double calories;

    /**
     *
     * @param id do <b>Ingrediente</b>
     * @param nome - ingrediente <b>Ingrediente</b>
     * @param measureUnit - uniddde da medida <b>Ingrediente</b>
     * @param calories - do <b>Ingrediente</b>
     */
    public Ingredient(int id, String nome, IngredientMeasureUnits measureUnit, double calories) {
        this.id = id;
        this.nome = nome;
        this.measureUnit = measureUnit;
        this.calories = calories;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public IngredientMeasureUnits getMeasureUnit() {
        return measureUnit;
    }

    public double getCalories() {
        return calories;
    }
}
