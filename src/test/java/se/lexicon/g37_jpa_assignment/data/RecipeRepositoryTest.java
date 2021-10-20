package se.lexicon.g37_jpa_assignment.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.g37_jpa_assignment.model.*;

import java.util.Arrays;
import java.util.List;

@DataJpaTest
class RecipeRepositoryTest {

    @Autowired
    RecipeRepository testObject;
    //    Recipe recipe;
    List<Recipe> recipeList = Arrays.asList(
            new Recipe(1, "Bondens bästa gryta"),
            new Recipe(2, "Minestronesoppa"),
            new Recipe(3, "Kroppkakor"),
            new Recipe(4, "Kålpudding")
    );
    //    RecipeIngredient recipeIngredient;
    List<RecipeIngredient> recipeIngredientList = Arrays.asList(
            new RecipeIngredient(new Ingredient("Kött"),0.5, Measurement.KG,recipeList.get(0)),
            new RecipeIngredient(new Ingredient("Grönsaker"),1.5, Measurement.KG,recipeList.get(0)),
            new RecipeIngredient(new Ingredient("Potatis"),5.0, Measurement.KG,recipeList.get(0))
    );

    //    RecipeCategory recipeCategory;
    List<RecipeCategory> recipeCategoryList = Arrays.asList(
            new RecipeCategory(1, "Pasta"),
            new RecipeCategory(2, "Potatis"),
            new RecipeCategory(3, "Soppor"),
            new RecipeCategory(4, "Färs"),
            new RecipeCategory(5, "Grytor"),
            new RecipeCategory(6, "Kött"),
            new RecipeCategory(7, "Grönsaker")
    );


    @BeforeEach
    public void setUp() {
        recipeList.get(0).setRecipeIngredients(recipeIngredientList);
        testObject.saveAll(recipeList);

    }

    @Test
    public void findRecipesByRecipeNameContains() {
        List<Recipe> recipes = testObject.findRecipesByRecipeNameContains("ond");
        recipes.forEach(System.out::println);
    }

    @Test
    public void findRecipesByRecipeIngredientsContains() {
//        List<Recipe> recipes = testObject.findRecipesByRecipeIngredientsContains("");
//        recipes.forEach(System.out::println);
    }

    @Test
    public void findRecipesByCategories() {
//        List<Recipe> recipes = testObject.findRecipesByCategories("Fågel");
//        recipes.forEach(System.out::println);
    }

    @Test
    public void findRecipesByCategoriesMatches() {
    }
}