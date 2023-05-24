package Pizzaria2.Ingredients;

import Pizzaria2.Enums.IngredientMeasureUnits;
import Pizzaria2.Enums.IngredientOrigin;
import Pizzaria2.Enums.MeatType;

public class Meat extends Topping{

    private MeatType type;

    public Meat(int id, String nome, IngredientMeasureUnits measureUnit, double calories, IngredientOrigin origin, MeatType type) {
        super(id, nome, measureUnit, calories, origin);
        this.type = type;
    }
}
