package se.lexicon.g37_jpa_assignment.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.g37_jpa_assignment.model.Ingredient;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class IngredientRepositoryTest {

    @Autowired
    IngredientRepository testObject;
    Ingredient ingredient;

    @BeforeEach
    public void setUp() {
        ingredient = new Ingredient(1, "Potato");
        testObject.save(ingredient);
    }

    @Test
    @DisplayName("Testing: Find Ingredient By IngredientName")
    public void findIngredientByIngredientName() {
        List<Ingredient> ingredients = testObject.findIngredientByIngredientName("Potato");
        ingredients.forEach(System.out::println);

    }

    @Test
    @DisplayName("Testing: Find Ingredient By IngredientName Contains")
    public void findIngredientByIngredientNameContains() {
        List<Ingredient> ingredients = testObject.findIngredientByIngredientNameContains("tat");
        ingredients.forEach(System.out::println);

    }
}