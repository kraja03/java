package com.sparta.kr.streams;

import java.lang.reflect.Array;
import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> myArr = new ArrayList<>(List.of(22, 3, 45, 18, 20, 21));
        int sum = 0;

        for (Integer n : myArr) {
            if (isEven(n)) sum += n;
        }
//        var result = myArr.stream().filter(x -> isEven(x));
        var result = myArr.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
        System.out.println(result);
        System.out.println(sum);

        List<String> beatles = List.of("John", "Paul", "George", "Ringo");
        beatles.stream().filter(name -> name.startsWith("J")).forEach((name -> System.out.println(name)));

        HashMap<String, Integer> scores = new HashMap<>(Map.of(
                "Alice", 90,
                "Bob", 85,
                "Charlie", 95,
                "Diana", 80
        ));


        //Sort hashmap so that it is in ascending order of scores charlie,alice,bob,diana
        scores.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }

    public static boolean isEven(int n){
        return n % 2 ==0;
    }
}
