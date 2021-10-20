package se.lexicon.g37_jpa_assignment.data;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.g37_jpa_assignment.model.Recipe;

import java.util.List;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {

    List<Recipe> findRecipesByRecipeNameContains(String recipeName);

    List<Recipe> findRecipesByRecipeIngredientsContains(String recipeIngredientName);

    List<Recipe> findRecipesByCategories(String recipeCategory);

    List<Recipe> findRecipesByCategoriesMatches(List<String> RecipeCategory);
}
