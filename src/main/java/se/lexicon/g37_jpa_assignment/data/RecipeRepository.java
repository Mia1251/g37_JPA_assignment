package se.lexicon.g37_jpa_assignment.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import se.lexicon.g37_jpa_assignment.model.Recipe;

import java.util.List;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {

    @Query("select r from Recipe r where r.recipeName like %:recipe_name%")
    List<Recipe> findRecipesByRecipeNameContains(@Param("recipe_name") String recipeName);

    @Query("select r from Recipe r where r.recipeIngredients = :recipe_ingredient")
    List<Recipe> findRecipesByRecipeIngredients(@Param("recipe_ingredient") String recipeIngredientName);

    @Query("select r from Recipe r where r.categories = :recipe_category")
    List<Recipe> findRecipesByCategories(@Param("recipe_category") String categories);

//      TODO: Not completed
//    List<Recipe> findRecipesByCategoriesMatches();
}
