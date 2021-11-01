package se.lexicon.g37_jpa_assignment.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.g37_jpa_assignment.model.Ingredient;

import java.util.List;

@DataJpaTest
class IngredientRepositoryTest {

    @Autowired
    IngredientRepository testObject;
    Ingredient ingredient;
    Ingredient ingredient2;
    Ingredient ingredient3;

    @BeforeEach
    void setUp() {
        ingredient = new Ingredient("Saffran");
        ingredient2 = new Ingredient("Kanel");
        ingredient3 = new Ingredient("Paprika");
        testObject.save(ingredient);
        testObject.save(ingredient2);
        testObject.save(ingredient3);
    }

    @Test
    @DisplayName("Test1: Find Ingredient By IngredientName")
    void findIngredientByIngredientName() {
        List<Ingredient> ingredientFound = testObject.findIngredientByIngredientName("Saffran");
        ingredientFound.forEach(System.out::println);
        System.out.println("Test 1 was successful");
    }

    @Test
    @DisplayName("Test2: Find Ingredient By IngredientName Contains")
    void findIngredientByIngredientNameContains() {
        List<Ingredient> result = testObject.findIngredientByIngredientNameContains("pri");
        result.forEach(System.out::println);
        System.out.println("Test 2 was successful");
    }
}