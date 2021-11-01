package se.lexicon.g37_jpa_assignment.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import se.lexicon.g37_jpa_assignment.model.Ingredient;

import java.util.List;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {

    @Query("select i from Ingredient i where i.ingredientName = :ingredient_name")
    List<Ingredient> findIngredientByIngredientName(@Param("ingredient_name") String ingredientName);

    @Query("select i from Ingredient i where i.ingredientName like %:ingredient_name%")
    List<Ingredient> findIngredientByIngredientNameContains(@Param("ingredient_name") String ingredientName);
}
