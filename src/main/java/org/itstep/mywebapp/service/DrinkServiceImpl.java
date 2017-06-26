package org.itstep.mywebapp.service;

import org.itstep.mywebapp.model.Drink;
import org.itstep.mywebapp.repository.DrinkRepository;
import org.itstep.mywebapp.repository.MockDrinkRepository;

import java.util.List;

/**
 * Created by Votchenko on 18.06.2017.
 */
public class DrinkServiceImpl implements DrinkService {

    private DrinkRepository repository = new MockDrinkRepository();


    @Override
    public List<Drink> getAll() {
        return repository.getAll();
    }

    @Override
    public Drink get(Integer userId, Integer id) {
        return repository.get(userId, id);
    }

    @Override
    public void delete(Integer userId, Integer id) {
        repository.delete(id);
    }

    @Override
    public Drink save(Drink drink) {
        return repository.save(drink);
    }
}
