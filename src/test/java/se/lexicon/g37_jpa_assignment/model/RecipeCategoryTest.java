package se.lexicon.g37_jpa_assignment.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class RecipeCategoryTest {

    @Autowired
    private RecipeCategory testObject;

    @BeforeEach
    void setUp() {
        testObject = new RecipeCategory(0,"Bakverk");
    }

    @Test
    @DisplayName("Test1: Create RecipeCategory")
    public void test_create() {
        Assertions.assertEquals(0, testObject.getCategoryId());
        Assertions.assertEquals("Bakverk", testObject.getCategory());
        System.out.println("Creating a category was successful!");
    }

    @Test
    @DisplayName("Test2: Equals")
    public void test_equal() {
        RecipeCategory expected = new RecipeCategory(1,"Bakverk");
        Assertions.assertTrue(testObject.equals(expected));
        System.out.println("Testing Equals was successful!");
    }

    @Test
    @DisplayName("Test3: HashCode")
    public void test_hashCode() {
        RecipeCategory expected = new RecipeCategory(1,"Bakverk");
        Assertions.assertEquals(expected.hashCode(), testObject.hashCode());
        System.out.println("Testing HashCode was successful!");
    }
}