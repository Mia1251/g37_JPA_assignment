package se.lexicon.g37_jpa_assignment.data;

import se.lexicon.g37_jpa_assignment.model.Ingredient;

public interface IngredientDao extends GenericDao<Ingredient, Integer> {

    Ingredient findIngredientByName(String ingredientName);

    Ingredient findIngredientByNameContains(String ingredientName);

}
