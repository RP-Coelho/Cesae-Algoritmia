package Pizzaria2;

import Pizzaria2.Enums.*;

import Pizzaria2.Ingredients.*;

public class PizzaDemo {
    public static void main(String[] args) {
        // Instanciar Ingredientes
        Base baseFina = new Base(1, "Base Fina", 90, PizzaBase.FINA, "Massa fina italiana");

        Vegetable tomate = new Vegetable(2, "Tomate", IngredientMeasureUnits.GRAMAS, 5, IngredientOrigin.NACIONAL, VegetableType.TOMATE);
        Vegetable ananas = new Vegetable(3, "Ananas dos Açores", IngredientMeasureUnits.GRAMAS, 12, IngredientOrigin.NACIONAL, VegetableType.ANANAS);
        Meat fiambre = new Meat(4, "Fiambre de frango", IngredientMeasureUnits.GRAMAS, 40, IngredientOrigin.NACIONAL, MeatType.FRANGO);
        Cheese mozzarella = new Cheese(5, "Queijo Mozzarella", IngredientMeasureUnits.GRAMAS, 35, IngredientOrigin.NACIONAL, CheeseType.MOZZARELLA);

        //Instanciar Pizzas

        Pizza havaiana = new Pizza(100, 5, "Havaiana", "Pizza  do Havai com Ananás", 15, PizzaSize.KING);

        // Adicionar a pizza havaina os seus Ingredientes
        havaiana.addIngredients(new PizzaIngredients(baseFina, 150));
        havaiana.addIngredients(new PizzaIngredients(tomate, 50));
        havaiana.addIngredients(new PizzaIngredients(ananas, 100));
        havaiana.addIngredients(new PizzaIngredients(fiambre, 100));
        havaiana.addIngredients(new PizzaIngredients(mozzarella, 150));


        havaiana.printPizza();

        havaiana.setIngredientQuantity(3,110);
        havaiana.printPizza();


        System.out.println("Kcal" + havaiana.countCalories());


    }
}
