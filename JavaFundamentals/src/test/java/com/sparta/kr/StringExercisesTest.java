package com.sparta.kr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringExercisesTest {

    @Test
    @DisplayName("Counts words starting with 't' in a normal array")
    public void testCountWordsNormal() {
        String[] words = {"The", "cat", "in", "the", "hat"};
        int result = StringExercises.countWords(words, 't');
        Assertions.assertEquals(2, result);
    }

    @Test
    @DisplayName("Counts words starting with 'T' and is case insensitive")
    public void testCountWordsCaseInsensitive() {
        String[] words = {"The", "cat", "in", "the", "hat"};
        int result = StringExercises.countWords(words, 'T');
        Assertions.assertEquals(2, result);
    }

    @Test
    @DisplayName("Returns 0 when character is not present")
    public void testCountWordsCharacterNotPresent() {
        String[] words = {"The", "cat", "in", "the", "hat"};
        int result = StringExercises.countWords(words, 'z');
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("Returns 0 for empty array")
    public void testCountWordsEmptyArray() {
        String[] words = {};
        int result = StringExercises.countWords(words, 't');
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("Returns 0 for null array")
    public void testCountWordsNullArray() {
        int result = StringExercises.countWords(null, 't');
        Assertions.assertEquals(0, result);
    }

    @Test
    @DisplayName("Counts words correctly when array contains nulls or empty strings")
    public void testCountWordsWithNullsAndEmptyStrings() {
        String[] words = {"apple", "", null, "apricot"};
        int result = StringExercises.countWords(words, 'a');
        Assertions.assertEquals(2, result);
    }
    @Test
    @DisplayName("Transforms Cathy with 10 correctly")
    void transformCathy() {
        String input = " Cathy";
        int n = 10;
        String expected = "CATHY0123456789";
        Assertions.assertEquals(expected, StringExercises.transformString(input, n));
    }

    @Test
    @DisplayName("Transforms empty string with 4 correctly")
    void transformEmptyString() {
        String input = "";
        int n = 4;
        String expected = "0123";
        Assertions.assertEquals(expected, StringExercises.transformString(input, n));
    }

    @Test
    @DisplayName("Transforms Piano with 12 correctly")
    void transformPiano() {
        String input = " Piano ";
        int n = 12;
        String expected = "PIANO01234567891011";
        Assertions.assertEquals(expected, StringExercises.transformString(input, n));
    }

    @Test
    @DisplayName("transformString returns only digits when input string is null")
    public void transformString_NullInput_ReturnsDigitsOnly() {
        String result = StringExercises.transformString(null, 5);
        Assertions.assertEquals("01234", result);
    }

    @ParameterizedTest
    @CsvSource({
            "racecar, true",
            "Madam, true",
            "hello, false",
            "'', false",
            "x, true",
            "null,false"
    })
    @DisplayName("Test various strings for palindrome correctness")
    public void testIsPalindrome(String input, boolean expected) {
        // Handle the literal "null" string to pass null as an argument
        if ("null".equals(input)) input = null;

        boolean result = StringExercises.isPalindrome(input);
        Assertions.assertEquals(expected, result);

}}


