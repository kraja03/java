package com.sparta.kr.adv_unittesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTests {

//    @ParameterizedTest
//    @CsvSource({
//            "1,1",
//            "2,2"
//    })
//    @DisplayName("Given a number, return it as a string")
//    public void givenNumber_Return_ItsString(int n, String expected){
//        Assertions.assertEquals(expected, FizzBuzzExample.FizzBuzz(n));
//    }

    @Test
    @DisplayName("Given three, return Fizz")
    public void givenThree_Return_Fizz(){
        Assertions.assertEquals("Fizz", FizzBuzzExample.FizzBuzz(3));
    }

    @ParameterizedTest
    @CsvSource({
            "3,Fizz",
            "6,Fizz",
            "9,Fizz"
    })
    @DisplayName("Given a multiple of three, return Fizz")
    public void givenANumberDivisibleByThreeButNotFive_Return_Fizz(int input, String expected){
        Assertions.assertEquals(expected, FizzBuzzExample.FizzBuzz(input));
    }

    @Test
    @DisplayName("Given five, return Buzz")
    public void givenFive_Return_Buzz(){
        Assertions.assertEquals("Buzz", FizzBuzzExample.FizzBuzz(5));
    }

    @ParameterizedTest
    @CsvSource({
            "5,Buzz",
            "10,Buzz",
            "20,Buzz"
    })
    @DisplayName("Given a multiple of five, return Buzz")
    public void givenANumberDivisibleByFiveButNotThree_Return_Fizz(int input, String expected){
        Assertions.assertEquals(expected, FizzBuzzExample.FizzBuzz(input));
    }

    @Test
    @DisplayName("Given fifteen, return FizzBuzz")
    public void givenFifteen_Return_FizzBuzz(){
        Assertions.assertEquals("FizzBuzz", FizzBuzzExample.FizzBuzz(15));
    }

    @ParameterizedTest
    @CsvSource({
            "30,FizzBuzz",
            "75,FizzBuzz",
            "90, FizzBuzz"
    })
    @DisplayName("Given a number divisible by 15, return FizzBuzz")
    public void givenANumberDivisibleByFifteen_Return_FizzBuzz(int input, String expected){
        Assertions.assertEquals(expected, FizzBuzzExample.FizzBuzz(input));
    }



}
