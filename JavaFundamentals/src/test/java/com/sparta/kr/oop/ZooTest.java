package com.sparta.kr.oop;

import com.sparta.kr.oop.Zoo.Animal;
import com.sparta.kr.oop.Zoo.Cat;
import com.sparta.kr.oop.Zoo.Fishes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;

public class ZooTest {

    @Test
    @DisplayName("Cat: getName and setName work")
    public void testAnimalName() {
        Cat cat = new Cat("Generic", 2020, 5, 26);
        Assertions.assertEquals("Generic", cat.getName());
        cat.setName("Fluffy");
        Assertions.assertEquals("Fluffy", cat.getName());

    }

    @Test
    @DisplayName("Cat: getAge returns correct years")
    public void testAnimalAge() {
        LocalDate birthDate = LocalDate.now().minusYears(3);
        Cat cat = new Cat("TestAnimal", birthDate.getYear(), birthDate.getMonthValue(), birthDate.getDayOfMonth());
        Assertions.assertEquals(3, cat.getAge());
    }

    @Test
    @DisplayName("Cat: getBirthDate returns correct date")
    public void testAnimalBirthDate() {
        Cat cat = new Cat("TestAnimal", 2021, 4, 7);
        Assertions.assertEquals("My animal is born on:" + LocalDate.of(2021, 4, 7), cat.getBirthDate());
    }

    @Test
    @DisplayName("Cat is saying the default sound")
    public void testAnimalSpeak() {
        Cat cat = new Cat("TestAnimal", 2021, 6, 5);
        Assertions.assertEquals("Meoww", cat.speak());
    }

    @ParameterizedTest
    @DisplayName("Multiple choices")
    @CsvSource({
            "Cat1, 2020, Meoww",
            "Fish, 2023, Ooooooooooooooooooooooo"// name, age, sound
    })

    public void displayNameAge(String name, int year, String sound) {

        Animal animal;
        if (name.startsWith("Cat")) {
            animal = new Cat(name, year, 6, 1);
        } else if (name.equals("Fish")) {
            animal = new Fishes(name, year, 3, "Carp"); // ziua fixă
        } else {
            throw new IllegalArgumentException("Unknown animal type");
        }
        Assertions.assertEquals(name, animal.getName(), "Name doesn't match");
        Assertions.assertEquals((2025 - year), animal.getAge(), "Age doesn't correspond");
        Assertions.assertEquals(sound, animal.speak(), "Sound doesn't match");
    }
}

//        @Test
//        @DisplayName("Cat: should return correct age and sound")
//        public void testCat() {
//            Cat cat = new Cat("Kitty", 2020, 10, 6);
//            int expectedAge = (int) ChronoUnit.YEARS.between(LocalDate.of(2020, 10, 6), LocalDate.now());
//            Assertions.assertEquals(expectedAge, cat.getAge());
//            Assertions.assertEquals("Meowwwwwwww", cat.speak());
//        }
//
//        @Test
//        @DisplayName("Dog: should return correct favourite game and sound")
//        public void testDog() {
//            Dog dog = new Dog("Buck", 2000, 8, 25, "Soccer");
//            Assertions.assertEquals("Soccer", dog.getFavouriteGame());
//            Assertions.assertEquals("Bark!", dog.speak());
//        }
//
//        @Test
//        @DisplayName("Bird should return correct colour and sound")
//        public void testBird() {
//            Birds bird = new Birds("Rocco", 2025, 1, "Blue");
//            Assertions.assertEquals("Blue", bird.getColour());
//            Assertions.assertEquals("My Rocco is doing Chirp Chirp!", bird.speak());
//        }
//
//        @Test
//        @DisplayName("Fish: should return correct species and sound")
//        public void testFish() {
//            Fishes fish = new Fishes("Nemo", 2023, 5, "Clownfish");
//            Assertions.assertEquals("Clownfish", fish.getSpecies());
//            Assertions.assertEquals("Blub blub blub", fish.speak());
//        }
//
//        @Test
//        @DisplayName("Cat: name can be changed")
//        public void testCatNameChange() {
//            Cat cat = new Cat("Karina", 2020, 10, 6);
//            Assertions.assertEquals("Karina", cat.getName());
//            cat.setName("Fluffy");
//            Assertions.assertEquals("Fluffy", cat.getName());
//        }
//
//        @Test
//        @DisplayName("Dog: name can be changed")
//        public void testDogNameChange() {
//            Dog dog = new Dog("Buddy", 2010, 7, 21, "Fetch");
//            Assertions.assertEquals("Buddy", dog.getName());
//            dog.setName("Max");
//            Assertions.assertEquals("Max", dog.getName());
//        }
//    }
//
