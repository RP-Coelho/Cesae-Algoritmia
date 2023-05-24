package Pizzaria2.Ingredients;

import Pizzaria2.Enums.IngredientMeasureUnits;
import Pizzaria2.Enums.IngredientOrigin;
import Pizzaria2.Enums.VegetableType;

public class Vegetable extends Topping{

    private VegetableType type;

    public Vegetable(int id, String nome, IngredientMeasureUnits measureUnit, double calories, IngredientOrigin origin, VegetableType type) {
        super(id, nome, measureUnit, calories, origin);
        this.type = type;
    }
}
