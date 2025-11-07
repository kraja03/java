package com.sparta.kr.oop;

import com.sparta.kr.oop.Zoo.Cat;
import com.sparta.kr.oop.Zoo.Dog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        Member m1 = new Member("Nish", "Mandal", 1999, 5, 15);
//        Member m2 = new Member("Khadijah", "Raja", 2001, 4, 22);
//
//        Cat cat = new Cat("Fluffy", 2020, 10, 6);
//        Dog dog1 = new Dog("Buddy", 2019, 5, 20, "soccer");
//
//        System.out.println(m1.getFullName());
//        System.out.println(m1.getJoinDate());
//        System.out.println(m2.getFullName());
//        System.out.println(m2.getJoinDate());
//
//        m1.setLastName("Kumar");
//        System.out.println(m1.getFullName());
//
//        Member noel = new Member("Noel", "Gallagher");
//
//        BaseballMember nahisah = new BaseballMember("Nahisah", "Nasleem", 2022, 12, 6, "quarterback");
//        System.out.println(nahisah.getFullName());
//        System.out.println(nahisah.getJoinDate());
//        System.out.println(nahisah.getPosition());
//        nahisah.setPosition("Goalie");
//        System.out.println(nahisah.getPosition());
//
//
//
//        ArrayList<Movable> movers = new ArrayList<>(List.of(m1, m2, nahisah, cat, dog1));
//        for (Movable mover : movers) {
//            System.out.println(mover.move());
//
//        }

        Member paul1 = new Member("Paul", "McCartney", 2024,5,22);
        Member paul2 = new Member("Paul", "McCartney", 2024,5,22);
        Member paul3 = paul1;
        System.out.println("m1 == m2: " + (paul1.equals(paul2)));
        System.out.println("m1 == m3: " + (paul1.equals(paul3)));


        System.out.println("paul 1 hashcode: " + paul1.hashCode());
        System.out.println("paul 2 hashcode: " + paul2.hashCode());
        System.out.println("paul 3 hashcode: " + paul3.hashCode());



        HashSet<Integer> setInts = new HashSet<>();
        setInts.add(5);
        setInts.add(5);
        setInts.add(2);
        setInts.add(3);

        HashSet<Member> setMembers = new HashSet<>();
        setMembers.add(paul1);
        setMembers.add(paul2);
        setMembers.add(paul3);
        System.out.println(setMembers);
    }
}
