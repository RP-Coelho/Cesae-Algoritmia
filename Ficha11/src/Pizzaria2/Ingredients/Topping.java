package Pizzaria2.Ingredients;

import Pizzaria2.Enums.IngredientMeasureUnits;
import Pizzaria2.Enums.IngredientOrigin;

public class Topping extends Ingredient{

    private IngredientOrigin origin;

    /**
     *
     * @param id do  <b>Topping/b>
     * @param nome do <b>Topping/b>
     * @param measureUnit do  <b>Topping/b>>
     * @param calories do  <b>Topping/b>
     * @param origin Tipo de origem  <b>Topping/b> possivel

     */
    public Topping(int id, String nome, IngredientMeasureUnits measureUnit, double calories, IngredientOrigin origin) {
        super(id, nome, measureUnit, calories);
        this.origin = origin;
    }
}
