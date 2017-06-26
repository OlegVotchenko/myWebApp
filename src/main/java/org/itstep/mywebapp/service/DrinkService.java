package org.itstep.mywebapp.service;

import org.itstep.mywebapp.model.Drink;

import java.util.List;

public interface DrinkService {

    List<Drink> getAll();

    Drink get(Integer userId, Integer id);

    void delete(Integer userId, Integer id);

    Drink save(Drink drink);

}
