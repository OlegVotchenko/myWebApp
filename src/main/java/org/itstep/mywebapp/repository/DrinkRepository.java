package org.itstep.mywebapp.repository;

import org.itstep.mywebapp.model.Drink;

import java.util.List;

/**
 * Created by Votchenko on 18.06.2017.
 */
public interface DrinkRepository {

    List<Drink> getAll();
    void delete(Integer id);
    Drink save(Drink drink);

    Drink get(Integer userId, Integer id);
}
