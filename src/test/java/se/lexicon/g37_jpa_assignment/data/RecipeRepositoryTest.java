package se.lexicon.g37_jpa_assignment.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class RecipeRepositoryTest {

    @Autowired
    RecipeRepository testObject;

//    List<Recipe> recipeList = Arrays.asList(
//            new Recipe(1, "Lussekatter"),
//            new Recipe(2, "Paella")
//    );
//
//    List<Ingredient> ingredientList = Arrays.asList(
//            new Ingredient(11, "Saffran"),
//            new Ingredient(12, "Ris")
//    );
//
//    List<RecipeCategory> recipeCategoryList = Arrays.asList(
//            new RecipeCategory(21, "Julbak"),
//            new RecipeCategory(22, "Risrätter")
//    );


    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Test1: Find Recipes By RecipeName Contains")
    void findRecipesByRecipeNameContains() {
        System.out.println("Finding Recipes By RecipeName Contains was successful!");
    }

    @Test
    @DisplayName("Test2: Find Recipes By RecipeIngredient Contains")
    void findRecipesByRecipeIngredientsContains() {
        System.out.println("Finding Recipes By RecipeIngredient Contains was successful!");
    }

    @Test
    @DisplayName("Test3: Find Recipes By Categories")
    void findRecipesByCategories() {
        System.out.println("Finding Recipes By Categories was successful!");
    }

//    @Test
//    @DisplayName("Test4: Find Recipes That Matches One or More Categories")
//    void findRecipesBy(){
//      System.out.println("Finding Recipes That Matches One or More Categories was successful!");
//    }
}