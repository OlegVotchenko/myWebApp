package org.itstep.mywebapp.model;

import java.time.LocalDateTime;

public class Drink {

    Integer id;

    String name;

    Integer capacity;

    LocalDateTime dateTime;

    Integer userId;

    public Drink() {

    }

    public Drink(int id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public LocalDateTime getDateTime() {

        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {

        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Drink(Integer id, String name, Integer capacity, Integer userId) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.userId = userId;
    }

    public Drink(Integer id, String name, Integer capacity, LocalDateTime dateTime, Integer userId) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.dateTime = dateTime;
        this.userId = userId;
    }

}
