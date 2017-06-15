package org.itstep.mywebapp.model;

/**
 * Created by Votchenko on 11.06.2017.
 */
public class Pet {

    private Integer id;
    private String kind;
    private String name;
    private Integer age;


    public Pet(Integer id, String kind, String name, Integer age) {
        this.id = id;
        this.kind = kind;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pet(String kind, String name) {
        this.kind = kind;
        this.name = name;
    }

    public Pet(String kind) {

        this.kind = kind;
    }

    public Pet() {
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKind() {

        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override

    public String toString() {
        return "Pet{" +
                "kind='" + kind + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
