package se.lexicon.g37_jpa_assignment.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class IngredientTest {

    Ingredient testObject;

    @BeforeEach
    public void setup() {
        testObject = new Ingredient(1, "Köttfärs");
    }

    @Test
    @DisplayName("Test1: create Ingredient")
    public void test_create() {
        Assertions.assertEquals(1,testObject.getIngredientId());
        Assertions.assertEquals("Köttfärs", testObject.getIngredientName());
        System.out.println("Testing to create new Ingredient was successful!");
    }

    @Test
    @DisplayName("Test2: Test Equals")
    public void test_equal() {
        Ingredient expected = new Ingredient(1, "Köttfärs");
        Assertions.assertEquals(testObject, expected);
        System.out.println("Testing Equals was successful!");
    }

    @Test
    @DisplayName("Test3: Test HashCode")
    public void test_hashCode() {
        Ingredient expected = new Ingredient(1, "Köttfärs");
        Assertions.assertEquals(expected.hashCode(),testObject.hashCode());
        System.out.println("Testing HashCode was successful!");
    }
}