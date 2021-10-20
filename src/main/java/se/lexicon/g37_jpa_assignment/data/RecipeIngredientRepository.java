package se.lexicon.g37_jpa_assignment.data;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.g37_jpa_assignment.model.RecipeIngredient;

public interface RecipeIngredientRepository extends CrudRepository<RecipeIngredient, Integer> {
}
