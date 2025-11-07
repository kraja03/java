package com.sparta.kr.oop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Member implements Movable {

    private final String firstName;
    private String lastName;
    private LocalDate joinDate;

    public Member(String firstName, String lastName, int year, int month, int day) {
        this(firstName, lastName);
        this.joinDate = LocalDate.of(year, month, day);
    }

    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getFullName() { return firstName + " " + lastName; }

    public long getMemberDays() {
        if (joinDate == null) return 0;
        return joinDate.until(LocalDate.now(), ChronoUnit.DAYS);
    }

    public LocalDate getJoinDate() { return joinDate; } // getter for the date

    @Override
    public String toString() {
        if (joinDate != null) {
            return getFullName() + " joined on " + joinDate;
        } else {
            return getFullName() + " (join date not set)";
        }
    }

    @Override
    public String move() {
        return getFullName() + " is moving as a member";
    }
    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof Member member)) return false;
        return Objects.equals(firstName, member.firstName)
                && Objects.equals(lastName, member.lastName)
                && Objects.equals(joinDate, member.joinDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, joinDate);
    }
}
