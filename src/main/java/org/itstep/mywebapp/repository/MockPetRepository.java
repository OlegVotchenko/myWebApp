package org.itstep.mywebapp.repository;

import org.itstep.mywebapp.model.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Votchenko on 15.06.2017.
 */
public class MockPetRepository implements PetRepository {


    private Map<Integer, Pet> pets = new ConcurrentHashMap<>();

    {
        pets.put(1, new Pet(1,"dog", "Sharik", 2));
        pets.put(2, new Pet(2,"dog", "Bim", 12));
        pets.put(3, new Pet(3,"cat", "Murzik", 6));
        pets.put(4, new Pet(4,"cat", "Barkis", 2));
    }



    public List<Pet> getAll() {
        return new ArrayList<>(pets.values());
    }

    @Override
    public void delete(Integer id) {
        pets.remove(id);
    }
}
