package se.lexicon.g37_jpa_assignment.data;

import org.springframework.stereotype.Repository;
import se.lexicon.g37_jpa_assignment.model.Recipe;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

@Repository
public class RecipeDaoImpl implements RecipeDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Recipe create(Recipe recipe) {
        return null;
    }

    @Override
    public Recipe findById(Integer integer) {
        return null;
    }

    @Override
    public Collection<Recipe> findAll() {
        return null;
    }

    @Override
    public Recipe update(Recipe recipe) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public List<Recipe> findRecipeByNameContains(String recipeName) {
        return null;
    }

    @Override
    public List<Recipe> findRecipeByIngredientName(String ingredientName) {
        return null;
    }

    @Override
    public List<Recipe> findRecipeByCategoryName(String categoryName) {
        return null;
    }

    @Override
    public List<Recipe> findRecipeSeveralCategories(List<String> recipeCategory) {
        return null;
    }
}
