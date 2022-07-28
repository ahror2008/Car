package com.company;

public class User implements Comparable<User> {
    String name;
    int age;
    int password;
    int card;

    public User() {
    }

    public User(String name, int age, int password, int card) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.card = card;
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

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    @Override
    public int compareTo(User o) {
        if (age == o.age) {
            return 1;
        } else if (age > o.age) {
            return 0;
        } else {
            return -1;
        }
    }
}
