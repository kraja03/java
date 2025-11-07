package com.spartaglobal.kr;

import java.util.*;


public class ArrayExercises {
    // Given an array of integers, convert them to a single int made up of the digits
    public static int arrayListToInt(ArrayList<Integer> digits) {
        int result = 0;
        for (int digit : digits) {
            result = result * 10 + digit;
        }
        return result;
    }


    public static String removeVowelsAndUppercase(String input) {
        return input.replaceAll("([aeiouAEIOU])", "").toUpperCase();
    }

    // For an array of ints, return the second highest number
    public static int secondHighest(int[] nums) {
        HashSet<Integer> ints = new HashSet<>();
        for (int n : nums) ints.add(n);
        ArrayList<Integer> sorted = new ArrayList<>(ints);
        Collections.sort(sorted);
        System.out.println("Ints sorted: " + sorted);
        return sorted.get(sorted.size() - 2);
    }


    // For a String, create an array of all the duplicate letters
    public static List<Character> duplicateLetters(String input) {
        input = input.toLowerCase();
        ArrayList<Character> duplicates = new ArrayList<>();
        HashSet<Character> seen = new HashSet<>();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (seen.contains(c) && !duplicates.contains(c)) duplicates.add(c);
                seen.add(c);
            }
        }
        return duplicates;
    }

    // Create a 2-value array which counts all consonants and vowels in a string
    public static int[] countConsonantsAndVowels(String input) {
        int vowels = 0, consonants = 0;
        input = input.toLowerCase();

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }

        return new int[]{consonants, vowels};
    }

    // Write a method that takes a string and a letter and checks if the letter is in that string
    public static boolean containsLetter(String input, char letter) {
        return input.toLowerCase().indexOf(Character.toLowerCase(letter)) != -1;
    }

    // Give a sequence of numbers return the sum of all numbers divisible by 2 and/or 3
    public static int sumDivisibleBy2or3(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            if (n % 2 == 0 || n % 3 == 0) sum += n;
        }
        return sum;
    }
























    // Write a method that takes a string and returns it with all the consonants in uppercase
    public static String consonantsUppercase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) && "aeiouAEIOU".indexOf(c) == -1)
                result.append(Character.toUpperCase(c));
            else
                result.append(c);
        }
        return result.toString();
    }

    // Given 3 int values a, b, c — return their sum unless a 13 appears (stop counting at 13)
    public static int sumSkip13(int a, int b, int c) {
        if (a == 13) return 0;
        if (b == 13) return a;
        if (c == 13) return a + b;
        return a + b + c;
    }

    // Return true if array does NOT contain any triples (3 same numbers in a row)
    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2])
                return false;
        }
        return true;
    }

    // Return true if there are scores of 100 next to each other
    public static boolean scores100(int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] == 100 && scores[i + 1] == 100)
                return true;
        }
        return false;
    }
}



