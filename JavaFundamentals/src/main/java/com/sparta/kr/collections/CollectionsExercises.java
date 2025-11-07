package com.sparta.kr.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CollectionsExercises {
    public static HashSet<Integer> makeFiveSet(int max) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= max; i++) {
            if (i % 5 == 0) {
                set.add(i);
            }
        }
        return set;
    }
    public static List<String> longWordList(String sentence) {
        List<String> list = new ArrayList<>();
        if (sentence == null || sentence.isEmpty()) return list;

        String[] words = sentence.split("\\s+");
        for (String word : words) {
            if (word.length() >= 5) {
                list.add(word);
            }
        }
        return list;
    }
}

