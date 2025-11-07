package com.sparta.kr.oop.Zoo;

import com.sparta.kr.oop.Member;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) {

//        String RESET = "\\u001B[0m";
//        String RED = "\\u001B[31m";
//        String BG_RED = "\\u001B[41m";
//        String GREEN = "\\u001B[32m";
//        String YELLOW = "\\u001B[33m";
//        String BLUE = "\\u001B[34m";
//        String PURPLE = "\\u001B[35m";
//        String CYAN = "\\u001B[36m";
//
////    System.out.println(BG_RED+ "ANIMAL CLASS" + RESET);
////    Animal animal = new Animal("Animal", 2024, 10);
////    System.out.println(animal.getName());
////    System.out.println("My animal is " + animal.getAge() + " year old.");
////    System.out.println(animal.getBirthDate());
////    animal.setName("Animal name");
////    System.out.println(animal.getName());
////    animal.setSound("Animal make sound");
////    System.out.println(animal.speak());
//
//        System.out.println(GREEN + "\\nCAT CLASS" + RESET);
//        Cat cat = new Cat("Karina", 2020, 10, 6);
//        System.out.println(cat.getName());
//        System.out.println("My cat is " + cat.getAge() + " year old.");
//        System.out.println(cat.getBirthDate());
//        cat.setName("Fluffy");
//        System.out.println("My cat's name is " + cat.getName());
////cat.setSound("Meow");
//        System.out.println(cat.toString());
//        System.out.println(cat.speak());
//
//        System.out.println(PURPLE + "\\nDOG CLASS" + RESET);
//        Dog dog1 = new Dog("Buck", 2000, 8, 25, "soccer");
//        System.out.println(dog1.getName());
//        System.out.println("My dog is " + dog1.getAge() + " year old.");
//        System.out.println(dog1.getBirthDate());
//        dog1.setName("Bob");
//        System.out.println("My dog's name is " + dog1.getName());
////dog1.setSound("Bark");
//        System.out.println("My dog favourite game is " + dog1.getFavouriteGame());
//        System.out.println(dog1.toString());
//        System.out.println(dog1.speak());
//
//        System.out.println(PURPLE + "\\nBird CLASS" + RESET);
//        Birds bird = new Birds("Lina", 2024, 05, "Blue");
//        System.out.println(bird.getColour());
//        System.out.println(bird.getBirthDate());
//        System.out.println(bird.speak());
//        System.out.println(bird.getName());
//
//        System.out.println(PURPLE + "\\nFish CLASS" + RESET);
//        Fishes fish = new Fishes("Rocco", 2020, 07, "Carp");
//        System.out.println(fish.getSpecies());
//        System.out.println(fish.getBirthDate());
//        System.out.println(fish.speak());
//        System.out.println(fish.getName());
//
//        ArrayList<Animal> animals = new ArrayList<>(List.of(fish, bird, dog1, cat));
//        for(Animal animal : animals)
//            System.out.println(animal.getName() + " from " + animal.toString());

        Dog bella = new Dog("Bella", 2015, 5, 19, "Catch");
        Dog bella2 = new Dog("Bella", 2015, 5, 19, "Catch");
        Dog buck = new Dog("Buck", 2000, 8, 25, "soccer");
        Dog fluffy = bella;
        System.out.println("d1 == d2: " + (bella.equals(bella2)));
        System.out.println("d1 == d3: " + (bella.equals(buck)));
        System.out.println("d4 == d1: " + (fluffy.equals(bella)));

        System.out.println("Bella hashcode: " + bella.hashCode());
        System.out.println("Bella2 hashcode: " + bella2.hashCode());
        System.out.println("Buck hashcode: " + buck.hashCode());


        HashSet<Dog> setDogs = new HashSet<>();
        setDogs.add(bella);
        setDogs.add(bella2);
        setDogs.add(buck);
        System.out.println(setDogs);
    }

}