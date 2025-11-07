package com.spartaglobal.kr;

public class StringExercise {

    public static String removeVowelsAndUppercase(String input) {
        return input.replaceAll("(?i)[aeiou]", "").toUpperCase();
    }

    public static void main(String[] args) {
        String text = "the cat in the hat comes back";
        System.out.println(removeVowelsAndUppercase(text));
    }
}

