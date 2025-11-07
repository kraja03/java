package com.sparta.kr;


public class StringMain {
        public static void main(String[] args) {
            String[] words = {"The", "cat", "in", "the", "hat"};
            int result = StringExercises.countWords(words, 't');
            System.out.println(result);

        System.out.println(StringExercises.isPalindrome("racecar"));
        System.out.println(StringExercises.isPalindrome("Madam"));
        System.out.println(StringExercises.isPalindrome("hello"));
        System.out.println(StringExercises.isPalindrome(""));
}
    }

