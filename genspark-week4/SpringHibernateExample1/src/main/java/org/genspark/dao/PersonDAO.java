package org.genspark.dao;
import org.genspark.model.Person;

import java.util.List;

public interface PersonDAO {
    public void save(Person person);
    public List<Person> list();
}
