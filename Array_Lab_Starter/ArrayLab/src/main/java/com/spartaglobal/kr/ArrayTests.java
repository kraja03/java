package com.spartaglobal.kr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayTests {
    @Test
    @DisplayName("arrayListToInt converts [5,2,7,9] to 5279")
        public void singleDigitTest(){
            ArrayList<Integer> digits = new ArrayList<>();
            digits.add(5);
            digits.add(2);
            digits.add(7);
            digits.add(9);
            int expected = 5279;
        Assertions.assertEquals(expected, ArrayExercises.arrayListToInt(digits));
        }
    @Test
    @DisplayName("arrayListToInt converts [7,5,1] to 751")
    public void singleDigitTest2(){
        ArrayList<Integer> digits = new ArrayList<>();
        digits.add(7);
        digits.add(5);
        digits.add(1);
        int expected = 751;
        Assertions.assertEquals(expected, ArrayExercises.arrayListToInt(digits));
    }
    @Test
    @DisplayName("removeVowelsAndUppercase removes the vowels and makes uppercase")
    public void removeVowelsTest(){
        String input = "The cat in the hat comes back";
        String expected = "TH CT N TH HT CMS BCK";
        Assertions.assertEquals(expected, StringExercise.removeVowelsAndUppercase(input));
    }
    @Test
    @DisplayName("removeVowelsAndUppercase works with mixed case input")
    public void mixedCaseTest() {
        String input = "Java Programming";
        String expected = "JV PRGRMMNG";
        Assertions.assertEquals(expected, StringExercise.removeVowelsAndUppercase(input));
    }

    @Test @DisplayName("secondHighest finds second largest number")
    void testSecondHighest() {
        Assertions.assertEquals(8, ArrayExercises.secondHighest(new int[]{3, 8, 10, 2}));
    }

    @Test @DisplayName("secondHighest works with negatives")
    void testSecondHighestNegative() {
        Assertions.assertEquals(-2, ArrayExercises.secondHighest(new int[]{-5, -2, -9}));
    }

    @Test @DisplayName("duplicateLetters finds duplicates")
    void testDuplicateLetters() {
       Assertions.assertEquals(Arrays.asList('l'), ArrayExercises.duplicateLetters("Hello"));
    }

    @Test @DisplayName("duplicateLetters multiple duplicates")
    void testDuplicateLettersMultiple() {
        Assertions.assertEquals(Arrays.asList('a', 'n'), ArrayExercises.duplicateLetters("Banana"));
    }

    @Test @DisplayName("countConsonantsAndVowels counts properly")
    void testCountConsonantsAndVowels() {
        Assertions.assertArrayEquals(new int[]{7, 3}, ArrayExercises.countConsonantsAndVowels("Hello World"));
    }

    @Test @DisplayName("countConsonantsAndVowels empty string returns zeros")
    void testCountConsonantsAndVowelsEmpty() {
        Assertions.assertArrayEquals(new int[]{0, 0}, ArrayExercises.countConsonantsAndVowels(""));
    }

    @Test @DisplayName("containsLetter letter present")
    void testContainsLetterTrue() {
        Assertions.assertTrue(ArrayExercises.containsLetter("Hello", 'e'));
    }

    @Test @DisplayName("containsLetter letter not present")
    void testContainsLetterFalse() {
        Assertions.assertFalse(ArrayExercises.containsLetter("World", 'x'));
    }

    @Test @DisplayName("sumDivisibleBy2or3 sums correctly")
    void testSumDivisible() {
        Assertions.assertEquals(30, ArrayExercises.sumDivisibleBy2or3(new int[]{1, 2, 3, 6, 8, 10}));
    }

    @Test @DisplayName("sumDivisibleBy2or3 handles no matches")
    void testSumDivisibleNone() {
       Assertions.assertEquals(1, ArrayExercises.sumDivisibleBy2or3(new int[]{1}));
    }














    @Test @DisplayName("consonantsUppercase converts consonants only")
    void testConsonantsUppercase() {
        Assertions.assertEquals("HLL WrLD", ArrayExercises.consonantsUppercase("Hell Wrld"));
    }

    @Test @DisplayName("consonantsUppercase keeps vowels lowercase")
    void testConsonantsUppercaseKeepVowels() {
        Assertions.assertEquals("AEIOU", ArrayExercises.consonantsUppercase("aeiou"));
    }

    @Test @DisplayName("sumSkip13 stops at 13")
    void testSumSkip13() {
        Assertions.assertEquals(6, ArrayExercises.sumSkip13(1, 5, 13));
    }

    @Test @DisplayName("sumSkip13 handles 13 at start")
    void testSumSkip13AtStart() {
       Assertions.assertEquals(0, ArrayExercises.sumSkip13(13, 5, 6));
    }

    @Test @DisplayName("noTriples returns true when no triples")
    void testNoTriplesTrue() {
        Assertions.assertTrue(ArrayExercises.noTriples(new int[]{1, 2, 2, 3}));
    }

    @Test @DisplayName("noTriples returns false when triple exists")
    void testNoTriplesFalse() {
        Assertions.assertFalse(ArrayExercises.noTriples(new int[]{1, 2, 2, 2, 3}));
    }

    @Test @DisplayName("scores100 returns true for consecutive 100s")
    void testScores100True() {
        Assertions.assertTrue(ArrayExercises.scores100(new int[]{50, 100, 100, 80}));
    }

    @Test @DisplayName("scores100 returns false when not consecutive")
    void testScores100False() {
        Assertions.assertFalse(ArrayExercises.scores100(new int[]{100, 90, 100}));
    }
}
