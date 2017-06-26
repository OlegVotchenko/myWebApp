package org.itstep.mywebapp.service;

import org.itstep.mywebapp.model.User;
import org.itstep.mywebapp.repository.MockUserRepository;
import org.itstep.mywebapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

//    public void setRepository(UserRepository repository) {
//        this.repository = repository;
//    }

//    public UserServiceImpl(UserRepository repository) {
//        this.repository = repository;
//    }

    @Override
    public List<User> getAll() {
        return repository.getAll();
    }

    @Override
    public void delete(Integer id) {
        repository.delete(id);
    }

    @Override
    public User get(Integer id) {
        return repository.get(id);
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

}
