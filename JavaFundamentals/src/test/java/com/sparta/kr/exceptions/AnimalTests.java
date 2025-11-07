package com.sparta.kr.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AnimalTests {

        @ParameterizedTest
        @CsvSource(
                {"0,0",
                        "10,10"
                })
        @DisplayName("Given an age of 0 or above, setAge changes the age")
        public void setAgeHappyPath(int newAge, int expectedAge){
            Animal sut = new Animal();
            sut.setAge(newAge);
            Assertions.assertEquals(expectedAge, sut.getAge());
        }

        @Test
        @DisplayName("Given an age of 0 or above, setAge throws an Exception")
        public void setAgeSadPath(){
            Animal sut = new Animal();
            var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> sut.setAge(-1));
            Assertions.assertEquals("Age must not be negative: -1", exception.getMessage());
        }

        //Add tests for setName() and setVaccinationDate() for their happy and sad paths.

        @Test
        @DisplayName("setName() sets name correctly")
        void setNameHappyPath() {
            Animal animal = new Animal();
            animal.setName("Fido");
            Assertions.assertEquals("FIDO", animal.getName());
        }

        @Test
        @DisplayName("setName() throws IllegalArgumentException for empty string")
        void setNameThrowsExceptionForEmpty() {
            Animal animal = new Animal();

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                animal.setName("");
            });
        }


        @Test
        @DisplayName("setVaccinationDate() correctly parses and sets a valid date string")
        void setVaccinationDateHappyPath() throws Exception {

            Animal animal = new Animal();
            String dateString = "15-12-2024";
            SimpleDateFormat expectedFormat = new SimpleDateFormat("dd-MM-yyyy");
            Date expectedDate = expectedFormat.parse(dateString);

            animal.setVaccinationDate(dateString);
            Date actualDate = animal.getVaccinationDate();

            Assertions.assertEquals(expectedDate, actualDate);
        }

        @Test
        @DisplayName("setVaccinationDate() throws ParseException for incorrect date format (MM/dd/yyyy)")
        void setVaccinationDateSadPathIncorrectFormat() {
            Animal animal = new Animal();
            String invalidDateString = "12/15/2024";

            Assertions.assertThrows(ParseException.class, () -> {
                animal.setVaccinationDate(invalidDateString);
            });
        }
    }
