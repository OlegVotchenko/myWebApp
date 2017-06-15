package org.itstep.mywebapp.service;

import org.itstep.mywebapp.model.Pet;
import org.itstep.mywebapp.repository.PetRepository;

import java.util.List;

/**
 * Created by Votchenko on 15.06.2017.
 */
public interface PetService {

    List<Pet> getAll();

    void delete(Integer id);
}
