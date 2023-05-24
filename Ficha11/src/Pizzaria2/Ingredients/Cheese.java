package Pizzaria2.Ingredients;

import Pizzaria2.Enums.CheeseType;
import Pizzaria2.Enums.IngredientMeasureUnits;
import Pizzaria2.Enums.IngredientOrigin;

public class Cheese extends Topping{

    private CheeseType type;


    public Cheese(int id, String nome, IngredientMeasureUnits measureUnit, double calories, IngredientOrigin origin, CheeseType type) {
        super(id, nome, measureUnit, calories, origin);
        this.type = type;
    }
}
