package com.zooshop.Animals;

/**
 * Created by RENT on 2017-06-05.
 */
public class Cat {
    double price;
    int age;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public Cat(double price, int age) {
        this.price = price;
        this.age = age;
    }
}
