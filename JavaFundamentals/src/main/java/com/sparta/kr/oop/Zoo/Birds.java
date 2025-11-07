package com.sparta.kr.oop.Zoo;

import com.sparta.kr.oop.Movable;

public class Birds extends Animal implements Movable {
    private String colour;

    public Birds(String name, int year, int month, String colour) {
        super(name, year, month);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String speak() {
        return "My " + getName() + " is doing Chirp Chirp!";
    }

    @Override
    public String toString() {
        return super.toString() + " and has " + colour + " feathers";
    }

    @Override
    public String move() {
        return "I am moving";
    }
}
