package com.sparta.kr.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

public class CollectionsExercisesTests {
    @Test
    @DisplayName("makeFiveSet returns all numbers divisible by 5 up to max")
    public void testMakeFiveSet() {
        HashSet<Integer> expected = new HashSet<>();
        expected.add(5);
        expected.add(10);
        expected.add(15);

        Assertions.assertEquals(expected, CollectionsExercises.makeFiveSet(15));
    }

    @Test
    @DisplayName("makeFiveSet returns empty set when max < 5")
    public void testMakeFiveSetEmpty() {
        Assertions.assertTrue(CollectionsExercises.makeFiveSet(4).isEmpty());
    }

    @Test
    @DisplayName("longWordList returns all words of length 5 or more")
    public void testLongWordList() {
        String sentence = "The quick brown fox jumps over lazy dogs";
        List<String> expected = List.of("quick", "brown", "jumps");
        Assertions.assertEquals(expected, CollectionsExercises.longWordList(sentence));
    }
}

