package se.lexicon.g37_jpa_assignment.data;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.g37_jpa_assignment.model.RecipeInstruction;

public interface RecipeInstructionRepository extends CrudRepository<RecipeInstruction, Integer> {

}
