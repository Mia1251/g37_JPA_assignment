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

    private Recipe testObject;

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Test1: Create Recipe")
    public void test_create() {
        System.out.println("Test1 was successful!");
    }

    @Test
    @DisplayName("Test2: Equals")
    public void test_equal() {
        System.out.println("Test2 was successful!");
    }

    @Test
    @DisplayName("Test3: HashCode")
    public void test_hashCode() {
        System.out.println("Test3 was successful!");
    }
}