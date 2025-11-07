package com.sparta.kr.oop.Zoo;

import com.sparta.kr.oop.Member;

import java.time.LocalDate;
import java.util.Objects;

public class Cat extends Animal {

    public Cat(String name, int year, int month, int day) {
        super(name, year, month);
        this.birthDate = LocalDate.of(year, month, day);
    }

    @Override
    public String speak() {
        return "Meoww";
    }

    @Override
    public String move() {
        return getName() + " is moving meow!";
    }

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof Cat cat)) return false;
        return Objects.equals(name, cat.name)
                && Objects.equals(birthDate, cat.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate);
    }
}
