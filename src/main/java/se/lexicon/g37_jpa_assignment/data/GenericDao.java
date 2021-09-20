package se.lexicon.g37_jpa_assignment.data;

import java.util.Collection;

public interface GenericDao<T, ID> {

    T create(T t);
    T findById(ID id);
    Collection<T> findAll();
    T update(T t);
    void delete(ID id);

}
