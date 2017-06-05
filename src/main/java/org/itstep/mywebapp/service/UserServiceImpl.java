package org.itstep.mywebapp.service;

import org.itstep.mywebapp.model.User;
import org.itstep.mywebapp.repository.MockUserRepository;
import org.itstep.mywebapp.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserRepository repository = new MockUserRepository();

    @Override
    public List<User> getAll() {
        return repository.getAll();
    }

}
