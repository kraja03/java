package com.sparta.kr.oop.Zoo;

import com.sparta.kr.oop.Movable;

public class Fishes extends Animal implements Movable {
    private String species;

    public Fishes(String name, int year, int month, String species) {
        super(name, year, month);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String speak() {
        return "Ooooooooooooooooooooooo";
    }

    @Override
    public String toString() {
        return super.toString() + " and is of the species " + species;
    }

    @Override
    public String move() {
        return "I am moving Ooooooooooooooooooooooo ";
    }
}
