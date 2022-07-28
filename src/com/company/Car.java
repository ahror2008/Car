package com.company;

public class Car implements Comparable<Car> {
    String name;
    String brand;
    int age;
    int price;
    int index;

    public Car() {
    }

    public Car(String name, String brand, int age, int price, int index) {
        this.name = name;
        this.brand = brand;
        this.age = age;
        this.price = price;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public int compareTo(Car o) {
        if (price == o.price) {
            return 1;
        } else if (price > o.price) {
            return 0;
        } else {
            return -1;
        }
    }
}
