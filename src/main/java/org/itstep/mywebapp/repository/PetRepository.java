package org.itstep.mywebapp.repository;

import org.itstep.mywebapp.model.Pet;

import java.util.List;

/**
 * Created by Votchenko on 15.06.2017.
 */
public interface PetRepository {

    List<Pet> getAll();

    void delete(Integer id);
}
