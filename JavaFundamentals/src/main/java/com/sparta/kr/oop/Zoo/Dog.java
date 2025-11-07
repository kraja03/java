package com.sparta.kr.oop.Zoo;

import com.sparta.kr.oop.Movable;

import java.time.LocalDate;
import java.util.Objects;

public class Dog extends Animal {

    private String favouriteGame;

    public Dog(String name, int year, int month, int day, String game) {
        super(name, year, month);
        this.birthDate = LocalDate.of(year, month, day);
        this.favouriteGame = game;
    }

    public String getFavouriteGame() {
        return favouriteGame;
    }

    @Override
    public String speak() {
        return "Barkk";
    }

    @Override
    public String toString() {
        return super.toString() + " and loves playing " + favouriteGame;
    }

    @Override
    public String move() {
        return getName() + " is moving Woof woof!";
    }

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof Dog dog)) return false;
        return Objects.equals(name, dog.name)
                && Objects.equals(favouriteGame, dog.favouriteGame)
                && Objects.equals(birthDate, dog.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, favouriteGame, birthDate);
    }
}
