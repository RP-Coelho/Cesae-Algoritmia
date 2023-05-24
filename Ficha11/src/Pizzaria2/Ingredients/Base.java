package Pizzaria2.Ingredients;

import Pizzaria2.Enums.IngredientMeasureUnits;
import Pizzaria2.Enums.PizzaBase;

public class Base extends Ingredient{

    private PizzaBase type;
    private String description;

    /**
     *
     * @param id do  <b>base/b>
     * @param nome do  <b>base/b>
     *
     * @param calories do  <b>base/b>
     * @param type Tipo de <b>base/b>  possivel
     * @param description descricao da   <b>base/b>
     */
    public Base(int id, String nome, double calories, PizzaBase type, String description) {
        super(id, nome, IngredientMeasureUnits.GRAMAS, calories); // Em vez de perguntar qual a Unidade medida especifico logo no metodo construtor diretamente
        this.type = type;
        this.description = description;
    }
}
