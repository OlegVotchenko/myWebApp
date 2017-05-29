package org.itstep.mywebapp;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    List<User> userList = new ArrayList<>();

    {
        userList.add(new User("Mike"));
        userList.add(new User("Natasha"));

    }

    public List<User> getAll() {
        return userList;
    }


}
