package Pizzaria2.Ingredients;

import Pizzaria2.Enums.IngredientMeasureUnits;
import Pizzaria2.Enums.IngredientOrigin;
import Pizzaria2.Enums.SeafoodType;

public class Seafood extends Topping{

    private SeafoodType type;

    public Seafood(int id, String nome, IngredientMeasureUnits measureUnit, double calories, IngredientOrigin origin, SeafoodType type) {
        super(id, nome, measureUnit, calories, origin);
        this.type = type;
    }
}
