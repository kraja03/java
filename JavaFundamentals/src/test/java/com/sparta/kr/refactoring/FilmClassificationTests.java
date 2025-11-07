package com.sparta.kr.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FilmClassificationTests {

    @ParameterizedTest
    @ValueSource(ints = {0, 11})
    @DisplayName("Ages 0-11: should return 'U & PG films are available.")
    public void getClassificationsByAge_Under12_ReturnsUandPG(int age) {
        Assertions.assertEquals(
                "U & PG films are available.",
                FilmClassification.getClassificationsByAge(age)
        );
    }
    @ParameterizedTest
    @ValueSource(ints = {12, 14})
    @DisplayName("Ages 12–14: should return 'U, PG & 12 films are available.'")
    public void getClassificationsByAge_12To14_ReturnsUpTo12(int age) {
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassification.getClassificationsByAge(age));
    }
    @ParameterizedTest
    @ValueSource(ints = {15, 17})
    @DisplayName("Ages 15–17: should return 'U, PG, 12 & 15 films are available.'")
    public void getClassificationsByAge_15To17_ReturnsUpTo15(int age) {
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassification.getClassificationsByAge(age));
    }
    @ParameterizedTest
    @ValueSource(ints = {18, 100})
    @DisplayName("Ages 18 and above: should return 'All films are available.'")
    public void getClassificationsByAge_18Plus_ReturnsAllFilms(int age) {
        Assertions.assertEquals("All films are available.", FilmClassification.getClassificationsByAge(age));
    }
    @DisplayName("Test FilmClassification for all EP and BVA cases")
    public void testFilmClassificationBoundaries(int age, String expected) {
        Assertions.assertEquals(expected, FilmClassification.getClassificationsByAge(age));
    }
    @ParameterizedTest
    @CsvSource({
            "0, 'U & PG films are available.'",
            "11, 'U & PG films are available.'",
            "12, 'U, PG & 12 films are available.'",
            "14, 'U, PG & 12 films are available.'",
            "15, 'U, PG, 12 & 15 films are available.'",
            "17, 'U, PG, 12 & 15 films are available.'",
            "18, 'All films are available.'",
            "25, 'All films are available.'"
    })
    @DisplayName("getClassificationsByAge returns correct classification for valid ages")
    public void testValidAges(int age, String expected) {
        Assertions.assertEquals(expected, FilmClassification.getClassificationsByAge(age));
    }

    @ParameterizedTest
    @CsvSource({
            "-1",
            "-10",
            "-100"
    })
    @DisplayName("getClassificationsByAge throws exception for negative ages")
    public void testNegativeAges(int age) {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> FilmClassification.getClassificationsByAge(age)
        );
        Assertions.assertEquals("Age must not be a negative number " + age, exception.getMessage());
    }
}

