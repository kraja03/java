package com.sparta.kr.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {

        //    @Test
//    @DisplayName("My first test")
//    void firstTest(){
//        Assertions.assertTrue(true);
//    }
        @Test
        @DisplayName("getGreeting, when given a time of 4, returns good evening")
        public void getGreeting_GivenATimeOf4_ReturnsGoodEvening() {
            int time = 4;
            String expected = "Good evening!";
            String actual = App.getGreeting(time);
            Assertions.assertEquals(expected, actual);
        }

        @Test
        @DisplayName("getGreeting, when given a time of 5, returns good morning")
        public void getGreeting_GivenATimeOf5_ReturnsGoodMorning() {
            int time = 5;
            String expected = "Good morning!";
            String actual = App.getGreeting(time);
            Assertions.assertEquals(expected, actual);
        }

        @Test
        @DisplayName("getGreeting, when given a time of 9, returns good morning")
        public void getGreeting_GivenATimeOf9_ReturnsGoodMorning() {
            int time = 9;
            String expected = "Good morning!";
            String actual = App.getGreeting(time);
            Assertions.assertEquals(expected, actual);
        }

        @Test
        @DisplayName("getGreeting, when given a time of 11, returns good morning")
        public void getGreeting_GivenATimeOf11_ReturnsGoodMorning() {
            int time = 11;
            String expected = "Good morning!";
            String actual = App.getGreeting(time);
            Assertions.assertEquals(expected, actual);
        }

        @Test
        @DisplayName("getGreeting, when given a time of 12, returns good morning")
        public void getGreeting_GivenATimeOf12_ReturnsGoodMorning() {
            int time = 12;
            String expected = "Good afternoon!";
            String actual = App.getGreeting(time);
            Assertions.assertEquals(expected, actual);
        }

        @Test
        @DisplayName("getGreeting, when given a time of 14, returns good afternoon")
        public void getGreeting_GivenATimeOf14_ReturnsGoodAfternoon() {
            int time = 14;
            String expected = "Good afternoon!";
            String actual = App.getGreeting(time);
            Assertions.assertEquals(expected, actual);
        }

        @Test
        @DisplayName("getGreeting, when given a time of 18, returns good afternoon")
        public void getGreeting_GivenATimeOf18_ReturnsGoodAfternoon() {
            int time = 18;
            String expected = "Good afternoon!";
            String actual = App.getGreeting(time);
            Assertions.assertEquals(expected, actual);
        }

        @Test
        @DisplayName("getGreeting, when given a time of 19, returns good evening")
        public void getGreeting_GivenATimeOf19_ReturnsGoodEvening() {
            int time = 19;
            String expected = "Good evening!";
            String actual = App.getGreeting(time);
            Assertions.assertEquals(expected, actual);
        }

        @Test
        @DisplayName("getGreeting, when given a time of 21, returns good evening")
        public void getGreeting_GivenATimeOf21_ReturnsGoodEvening() {
            int time = 21;
            String expected = "Good evening!";
            String actual = App.getGreeting(time);
            Assertions.assertEquals(expected, actual);
        }

        @Test
        @DisplayName("getGreeting, when given a time of 24, returns good evening")
        public void getGreeting_GivenATimeOf24_ReturnsGoodEvening() {
            int time = 24;
            String expected = "Good evening!";
            String actual = App.getGreeting(time);
            Assertions.assertEquals(expected, actual);
        }

    @ParameterizedTest
    @ValueSource(ints = {5,11}) // supported numbers, characters, booleans, strings and classes
    @DisplayName("getGreeting, when given a time from 5 to 11, returns good morning")
    public void getGreeting_GivenATimeFrom5To11_ReturnsGoodMorning(int time){
        Assertions.assertEquals("Good morning!", App.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {5,11})
    @DisplayName("getGreeting, when given a time, returns appropriate greeting")
    public void getGreeting_GivenATime_ReturnsAppropriateGreeting(int time){
        Assertions.assertEquals("Good morning!", App.getGreeting(time));
    }

    @ParameterizedTest
    @CsvSource({
            "Good evening!, 2",
            "Good morning!, 8",
            "Good afternoon!, 15",
            "Good evening!, 21"
    })
    @DisplayName("getGreeting, when given a time, returns appropriate greeting")
    public void givenATime_Greeting_ReturnsAnAppropriateGreeting(String greeting, int time){
        Assertions.assertEquals(greeting, App.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {12,18})
    @DisplayName("getGreeting, when given a time from 12 to 18, returns good afternoon")
    public void getGreeting_GivenAfternoonTimes_ReturnsGoodAfternoon(int time) {
        Assertions.assertEquals("Good afternoon!", App.getGreeting(time));
    }

    @ParameterizedTest
    @CsvSource({
            "5, Good morning!",
            "8, Good morning!",
            "11, Good morning!",
            "12, Good afternoon!",
            "15, Good afternoon!",
            "18, Good afternoon!",
            "19, Good evening!",
            "23, Good evening!",
            "0, Good evening!",
            "4, Good evening!"
    })
    @DisplayName("getGreeting returns correct greeting for valid hours")
    public void testValidTimes(int timeOfDay, String expectedGreeting) {
        Assertions.assertEquals(expectedGreeting, App.getGreeting(timeOfDay));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 24, 100})
    @DisplayName("Invalid time throws an IllegalArgumentException")
    void testInvalidTimes(int invalidTime) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> App.getGreeting(invalidTime));
    }



//    @ParameterizedTest
//    @ValueSource(ints = {19, 20, 21, 22, 23})
//    @DisplayName("getGreeting, when given a time from 19 to 23, returns good evening")
//    public void getGreeting_GivenEveningTimes_ReturnsGoodEvening(int time) {
//        Assertions.assertEquals("Good evening!", App.getGreeting(time));
//    }
//
//    @ParameterizedTest
//    @ValueSource(ints = {0, 1, 2, 3, 4})
//    @DisplayName("getGreeting, when given a time from 0 to 4, returns good evening")
//    public void getGreeting_GivenEarlyMorningTimes_ReturnsGoodEvening(int time) {
//        Assertions.assertEquals("Good evening!", App.getGreeting(time));
//    }

    //combined both 0-4 and 19-23
    @ParameterizedTest
    @ValueSource(ints = {0, 4, 22, 23})
    @DisplayName("getGreeting, when given a time for evening, returns good evening")
    public void getGreeting_GivenEveningTimes_ReturnsGoodEvening(int time) {
        Assertions.assertEquals("Good evening!", App.getGreeting(time));
    }
}

