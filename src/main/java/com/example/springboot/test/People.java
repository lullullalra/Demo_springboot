package com.example.springboot.test;

public class People {
    int hungryState = 50;

    void eat(){
        hungryState += 10;
    }


    public static void main(String[] args) {
        People p = new People();
        p.eat();
    }
}
