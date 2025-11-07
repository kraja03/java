package com.sparta.kr.collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.*;
import org.junit.jupiter.api.Assertions;

public class collectionsTests {

    @Test
    @DisplayName("makeFiveSet returns multiples of 5 up to 25")
    public void makeFiveSetTest(){
        HashSet<Integer> expected = new HashSet<>(Arrays.asList(5, 10, 15, 20, 25));
        Assertions.assertEquals(expected, App.makeFiveSet(25));
    }

    @Test
    @DisplayName("makeFiveSet returns empty set when max is less than 5")
    public void makeFiveSetEmptyTest(){
        HashSet<Integer> expected = new HashSet<>();
        Assertions.assertEquals(expected, App.makeFiveSet(3));
    }

    @Test
    @DisplayName("longWordList returns words with 5 or more letters")
    public void longWordListTest() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Hello", "first", "Khadijah", "Khadijah"));
        Assertions.assertEquals(expected, App.longWordList("Hello my first name is Khadijah Khadijah"));
    }

    @Test
    @DisplayName("longWordList returns words keep duplicates and order")
    public void longWordListTestDuplicates() {
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("hello", "world", "hello"));
        Assertions.assertEquals(expected, App.longWordList("hello world hello"));
    }
}