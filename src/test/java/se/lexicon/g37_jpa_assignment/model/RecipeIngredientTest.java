package se.lexicon.g37_jpa_assignment.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class RecipeIngredientTest {

    @Autowired
    RecipeIngredient testObject;
    Recipe recipe = new Recipe(11, "Ugnsbakad kronärtskocka");
    Ingredient ingredient = new Ingredient(1,"Kronärtskocka");
    String recipeIngredientId;

    @BeforeEach
    void setUp() {
        testObject = new RecipeIngredient(recipe, ingredient);
        testObject.setRecipeIngredientId(recipeIngredientId);
        testObject.setIngredient(ingredient);
        testObject.setAmount(400);
        testObject.setMeasurement(Measurement.G);
        testObject.setRecipe(recipe);
    }

    @Test
    @DisplayName("Test1: Create RecipeIngredient")
    public void test_create() {
        Assertions.assertEquals(ingredient, testObject.getIngredient());
        System.out.println("Creating a RecipeIngredient was successful!");
    }

    @Test
    @DisplayName("Test2: Equals")
    public void test_equal() {
        RecipeIngredient expected = new RecipeIngredient(recipe, ingredient);
        Assertions.assertTrue(testObject.equals(expected));
        System.out.println("Testing Equals was successful!");
    }

    @Test
    @DisplayName("Test3: HashCode")
    public void test_hashCode() {
        RecipeIngredient expected = new RecipeIngredient(recipe, ingredient);
        Assertions.assertEquals(expected.hashCode(), testObject.hashCode());
        System.out.println("Testing HashCode was successful!");
    }
}