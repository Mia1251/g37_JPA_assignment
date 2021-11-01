package se.lexicon.g37_jpa_assignment.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class RecipeInstructionTest {

    @Autowired
    private RecipeInstruction testObject;

    @BeforeEach
    void setUp() {
        testObject = new RecipeInstruction("1", "Hur man gör en potatisgratäng á la Mia");
        testObject.setInstructionId("1");
        testObject.setInstructions("Hur man gör en potatisgratäng á la Mia");
    }

    @Test
    @DisplayName("Test1: Create RecipeInstruction")
    public void test_create() {
        Assertions.assertEquals("1", testObject.getInstructionId());
        Assertions.assertEquals("Hur man gör en potatisgratäng á la Mia", testObject.getInstructions());
        System.out.println("Creating a RecipeInstruction was successful!");
    }

    @Test
    @DisplayName("Test2: Equals")
    public void test_equal() {
        RecipeInstruction expected = new RecipeInstruction("1","Hur man gör en potatisgratäng á la Mia");
        RecipeInstruction actual = testObject;
        Assertions.assertEquals(expected, actual);
        System.out.println("Testing Equals was successful!");
    }

    @Test
    @DisplayName("Test3: HashCode")
    public void test_hashCode() {
        RecipeInstruction expected = new RecipeInstruction("1","Hur man gör en potatisgratäng á la Mia");
        RecipeInstruction actual = testObject;
        Assertions.assertEquals(expected.hashCode(), actual.hashCode());
        System.out.println("Testing HashCode was successful!");
    }
}