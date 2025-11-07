package com.sparta.kr;

import java.util.ArrayList;

public class StringExercises {
    public static int countWords(String [] words , char c){
        if (words == null) {
            return 0;
        }
        int count = 0;
        char target = Character.toLowerCase(c);
        for (String word : words) {
            if (word != null && !word.isEmpty()) {
                if (Character.toLowerCase(word.charAt(0)) == target) {
                    count++;
                }
            }
        }

        return count;
    }
    public static int countWordsInString(String phrase, char c) {
        if (phrase == null || phrase.isEmpty()) {
            return 0;
        }
        String[] words = phrase.split("\\s+"); // split by whitespace
        return countWords(words, c);
    }

    public static String transformString(String input, int n) {
        if (input == null) input = ""; // handle null input
        String trimmedUpper = input.trim().toUpperCase();
        StringBuilder sb = new StringBuilder(trimmedUpper);
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }
        return sb.toString();
    }

//    public static boolean isPalindrome(String input){
//        if (input == null || input.isEmpty()){
//            return false;
//        }
//        String normalized = input.toLowerCase();
//        int left = 0;
//        int right = normalized.length() - 1;
//        while (left < right) {
//            if (normalized.charAt(left) != normalized.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
public static boolean isPalindrome(String str) {
    if (str == null || str.isEmpty()) return false;

    String lower = str.toLowerCase();
    return lower.equals(new StringBuilder(lower).reverse().toString());

    }
}
