package se.lexicon.g37_jpa_assignment.data;

import se.lexicon.g37_jpa_assignment.model.Recipe;

import java.util.List;

public interface RecipeDao extends GenericDao<Recipe, Integer> {

    List<Recipe> findRecipeByNameContains(String recipeName);

    List<Recipe> findRecipeByIngredientName(String ingredientName);

    List<Recipe> findRecipeByCategoryName(String categoryName);

    List<Recipe> findRecipeSeveralCategories(List<String> recipeCategory);
}
