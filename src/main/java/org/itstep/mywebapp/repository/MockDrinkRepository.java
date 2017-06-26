package org.itstep.mywebapp.repository;

import org.itstep.mywebapp.Logged;
import org.itstep.mywebapp.model.Drink;
import org.itstep.mywebapp.web.DrinkServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Votchenko on 18.06.2017.
 */
public class MockDrinkRepository implements DrinkRepository {
    private static final Logger LOG = LoggerFactory.getLogger(DrinkRepository.class);
    private Map<Integer, Drink> drinkMap = new ConcurrentHashMap<>();

    private AtomicInteger idCounter = new AtomicInteger(1);

    {
        save(new Drink(1, "Cola", 1, LocalDateTime.now(),1));
        save(new Drink(2, "Cola", 4, LocalDateTime.now(), 3));
        save(new Drink(3, "Sprite", 1, LocalDateTime.now(), 3));
        save(new Drink(4, "Water", 3, LocalDateTime.now(), 3));
        save(new Drink(5, "Water", 2, LocalDateTime.now(), 2));

}

    @Override
    public List<Drink> getAll() {
        LOG.debug("Gel all drinks of user = {}", Logged.id);

        ArrayList<Drink> drinkArrayList = new ArrayList<>();
        for (Map.Entry<Integer, Drink> entry : drinkMap.entrySet()) {
            if (entry.getValue().getUserId()==Logged.id){
                drinkArrayList.add(entry.getValue());
            }
        }
        return drinkArrayList;
    }

    @Override

    public void delete(Integer id) {
        LOG.debug("Delete drink with id = {}", id);
        drinkMap.remove(id);
    }

    @Override
    public Drink save(Drink drink) {
        LOG.debug("Save drink with id = {}", drink.getId());
        if (drink.getId() == null){
            drink.setId(idCounter.getAndIncrement());
            drink.setDateTime(LocalDateTime.now());
        }
        else {
            drinkMap.put(drink.getId(),drink);
        }
        return drink;

    }

    @Override
    public Drink get(Integer userId, Integer id) {
        LOG.debug("Get drink with id = {}", id);
        return drinkMap.get(id);
    }
}
