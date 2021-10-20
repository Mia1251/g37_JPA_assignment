package se.lexicon.g37_jpa_assignment.data;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.g37_jpa_assignment.model.Ingredient;

import java.util.List;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {

    List<Ingredient> findIngredientByIngredientName(String ingredientName);

    List<Ingredient> findIngredientByIngredientNameContains(String ingredientName);
}
