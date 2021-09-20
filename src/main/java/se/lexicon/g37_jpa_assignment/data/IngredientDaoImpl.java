package se.lexicon.g37_jpa_assignment.data;

import org.springframework.stereotype.Repository;
import se.lexicon.g37_jpa_assignment.model.Ingredient;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Repository
public class IngredientDaoImpl implements IngredientDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Ingredient create(Ingredient ingredient) {
        return null;
    }

    @Override
    public Ingredient findById(Integer integer) {
        return null;
    }

    @Override
    public Collection<Ingredient> findAll() {
        return null;
    }

    @Override
    public Ingredient update(Ingredient ingredient) {
        return null;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public Ingredient findIngredientByName(String ingredientName) {
        return null;
    }

    @Override
    public Ingredient findIngredientByNameContains(String ingredientName) {
        return null;
    }
}
