package com.sparta.kr.oop.Zoo;

import com.sparta.kr.oop.Movable;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Animal implements Movable {

    protected String name;
    protected LocalDate birthDate;

    public Animal(String name, int year, int month) {
        this.name = name;
        this.birthDate = LocalDate.of(year, month, 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(this.birthDate, LocalDate.now());
    }

    public String getBirthDate() {
        return "My animal is born on:" + birthDate;
    }

    public abstract String speak();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " named '" + name + "' was born on " + birthDate;
    }
}
