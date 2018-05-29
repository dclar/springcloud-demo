package org.dclar.stream.cloud.kafka.producer.entity;

/**
 * Description:
 *
 * @author dclar
 */
public class User {

    private String name;
    private int age;


    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static User newInstance(String name, int age) {
        return new User(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
