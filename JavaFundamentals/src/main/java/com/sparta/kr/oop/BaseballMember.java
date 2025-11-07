package com.sparta.kr.oop;

public class BaseballMember extends Member {

    private String position;

    public BaseballMember(String firstName, String lastName, int year, int month, int day, String position) {
        super(firstName, lastName, year, month, day);
        this.position = position; // fixed typo
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String move() {
        return getFullName() + " is moving as a baseball member"; // added space and better readability
    }

    @Override
    public String toString() {
        return super.toString() + ", Position: " + position; // optional: makes printing info neat
    }
}
