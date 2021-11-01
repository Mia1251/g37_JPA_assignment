package se.lexicon.g37_jpa_assignment.model;

import org.assertj.core.internal.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    @Autowired
    private Recipe testObject;

    @BeforeEach
    void setUp() {
        testObject = new Recipe(1,"Ugnsbakad kronärtskocka");
    }

    @Test
    @DisplayName("Test1: Create Recipe")
    public void test_create() {
        Assertions.assertEquals(1, testObject.getRecipeId());
        Assertions.assertEquals("Ugnsbakad kronärtskocka", testObject.getRecipeName());
        System.out.println("Creating a Recipe was successful!");
    }

    @Test
    @DisplayName("Test2: Equals")
    public void test_equal() {
        Recipe expected = new Recipe(1,"Ugnsbakad kronärtskocka");
        Assertions.assertTrue(testObject.equals(expected));
        System.out.println("Testing Equals was successful!");
    }

    @Test
    @DisplayName("Test3: HashCode")
    public void test_hashCode() {
        Recipe expected = new Recipe(1, "Ugnsbakad kronärtskocka");
        Assertions.assertEquals(expected.hashCode(), testObject.hashCode());
        System.out.println("Testing HashCode was successful!");
    }
}