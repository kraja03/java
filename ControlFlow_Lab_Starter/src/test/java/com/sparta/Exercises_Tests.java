package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Exercises_Tests {
    @Test
    @DisplayName("Given a temperature less than 15, getForecast returns It's cold")
    public void getForecast_Cold() {
        Assertions.assertEquals("It's cold", Exercises.getForecast(14) );
    }

    @Test
    @DisplayName("Given a temperature of 15, getForecast returns It's hot")
    public void getForecast_Hot() {
        Assertions.assertEquals("It's hot", Exercises.getForecast(15) );
    }

    @Test
    @DisplayName("Given a temperature over 15, getForecast returns It's hot")
    public void getForecast_Over15_Hot() {
        Assertions.assertEquals("It's hot", Exercises.getForecast(125));
    }
    @Test
    @DisplayName("Average returns correct average")
    public void Average_ReturnsCorrectAverage()
    {
        int[] nums = { 3, 8, 1, 7, 3 };
        Assertions.assertEquals(4.4, Exercises.average(nums));
    }

//    @Test
//    @DisplayName("When the Array is empty average returns zero")
//    public void WhenArrayIsEmpty_Average_ReturnsZero() {
//        int[] nums = {};
//        Assertions.assertEquals(0, Exercises.average(nums));
//    }

    @Test
    @DisplayName("When nums is null, average throws an IllegalArgumentException")
    public void whenArrayIsNullReturnException(){
       int[] nums = { };
       var exception = Assertions.assertThrows(NullPointerException.class, () ->{
                   Exercises.average(nums);
               });
    }
    @Test
    @DisplayName("Average throws NullPointedException when array is empty")
    public void averageThrowsExceptionForEmptyArray() {
        int[] empty = {};
        var exception = Assertions.assertThrows(NullPointerException.class, () -> {
            Exercises.average(empty);
        });
        Assertions.assertEquals("Array must not be empty ", exception.getMessage());
    }


    @ParameterizedTest
    @CsvSource( {
            "100, OAP",
            "60, OAP",
            "59, Standard",
            "18, Standard",
            "17, Student",
            "13, Student",
            "12, Child",
            "5, Child",
            "4, Free",
            "0, Free"
    })
    @DisplayName("Testing ticket types by age")
    public void TicketTypeTest(int age, String expected)
    {
        var result = Exercises.ticketType(age);
        Assertions.assertEquals(expected, result);
    }
    @Test
    @DisplayName("ticketType throws NullPointerException when age is null")
    public void ticketTypeThrowsExceptionForNullAge() {
        var exception = Assertions.assertThrows(NullPointerException.class, () -> {
            Exercises.ticketType(null);
        });
        Assertions.assertEquals("Age must not be null", exception.getMessage());
    }
    @Test
    @DisplayName("ticketType throws IllegalArgumentException when age is negative")
    public void ticketTypeThrowsExceptionForNegativeAge() {
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Exercises.ticketType(-1);
        });
        Assertions.assertEquals("Age must be 0 or greater", exception.getMessage());
    }


    // write unit tests for the 'Grade' method here
    @ParameterizedTest
    @CsvSource({
            "85, Pass with Distinction",
            "75, Pass with Distinction",
            "65, Pass with Merit",
            "50, Pass",
            "40, Pass",
            "35, Fail",
            "0, Fail",
    })
    @DisplayName("Testing grades by marks")
    public void gradeTest(int mark, String expectedGrade)
    {
        String actualGrade = Exercises.grade(mark);
        Assertions.assertEquals(expectedGrade, actualGrade);
    }

    @Test
    @DisplayName("Grade throws NullPointerException when mark is null")
    public void gradeThrowsExceptionForNullMark() {
        var exception = Assertions.assertThrows(NullPointerException.class, () -> {
            Exercises.grade(null);
        });
        Assertions.assertEquals("Mark must be between 0 and 100", exception.getMessage());
    }

    @Test
    @DisplayName("Grade throws IllegalArgumentException when mark is negative")
    public void gradeThrowsExceptionForNegativeMark() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Exercises.grade(-5);
        });
        Assertions.assertEquals("Mark must be between 0 and 100", exception.getMessage());
    }

    // write unit tests for the Scottish wedding example here
    @ParameterizedTest
    @CsvSource({
            "4, 20",
            "3, 50",
            "2, 50",
            "1, 100",
            "0, 200"
    })
    @DisplayName("Covid level should return correct maximum wedding guests from level 4 to 0")
    public void maxWeddingGuestTest(int covidLevel, int expectedGuests) {
        int maxWeddingNumber = Exercises.getScottishMaxWeddingNumber(covidLevel);
        Assertions.assertEquals(expectedGuests, maxWeddingNumber);
    }

    @Test
    @DisplayName("getScottishMaxWeddingNumber throws NullPointerException when covidLevel is null")
    void getWeddingGuestThrowsExceptionForNullCovidLevel() {
        var exception = Assertions.assertThrows(NullPointerException.class, () -> {
            Exercises.getScottishMaxWeddingNumber(null);
        });
        Assertions.assertEquals("CovidLevel must not be null", exception.getMessage());
    }
    @Test
    @DisplayName("getScottishMaxWeddingNumber returns 0 for unknown levels")
    public void maxWeddingNumberUnknownLevel() {
        Assertions.assertEquals(0, Exercises.getScottishMaxWeddingNumber(5));
        Assertions.assertEquals(0, Exercises.getScottishMaxWeddingNumber(10));
    }


//    @ParameterizedTest
//    @ValueSource(ints = {0})
//    @DisplayName("Covid Level 0 should allow 200 guests")
//    public void testCovidLevel0(int covidLevel) {
//        int expected = 200;
//        int actual = Exercises.getScottishMaxWeddingNumber(covidLevel);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @ParameterizedTest
//    @ValueSource(ints = {1})
//    @DisplayName("Covid Level 1 should allow 100 guests")
//    public void testCovidLevel1(int covidLevel) {
//        int expected = 100;
//        int actual = Exercises.getScottishMaxWeddingNumber(covidLevel);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @ParameterizedTest
//    @ValueSource(ints = {2})
//    @DisplayName("Covid Level 2 should allow 50 guests")
//    public void testCovidLevel2(int covidLevel) {
//        int expected = 50;
//        int actual = Exercises.getScottishMaxWeddingNumber(covidLevel);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @ParameterizedTest
//    @ValueSource(ints = {3})
//    @DisplayName("Covid Level 3 should allow 50 guests")
//    public void testCovidLevel3(int covidLevel) {
//        int expected = 50;
//        int actual = Exercises.getScottishMaxWeddingNumber(covidLevel);
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @ParameterizedTest
//    @ValueSource(ints = {4})
//    @DisplayName("Covid Level 4 should allow 20 guests")
//    public void testCovidLevel4(int covidLevel) {
//        int expected = 20;
//        int actual = Exercises.getScottishMaxWeddingNumber(covidLevel);
//        Assertions.assertEquals(expected, actual);
//    }
}

