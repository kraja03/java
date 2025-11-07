package com.sparta.kr.collections;

import com.sparta.kr.oop.*;
import com.sparta.kr.oop.Movable;
import com.sparta.kr.oop.Zoo.Dog;

import java.util.*;

public class App {
    public static void main(String[] args) {

        System.out.println(makeFiveSet(25));
        System.out.println(longWordList("Hello my first name is Khadijah Khadijah "));

    }
////        Member m1 = new Member("Nish", "Mandal", 1999, 5, 15);
////        Member m2 = new Member("Khadijah", "Raja", 2001, 4, 22);
////        Dog dog = new Dog("Bella", 2015, 5, 19, "Catch");
////        List<Movable> moveables = new ArrayList<>(List.of(m1,m2,dog));
////        moveables.add(new Dog("Fido",2001,12,1,"Bones"));
////        Movable[] moveablesArr = {m1,m2,dog};
////        moveablesArr[0] = new Dog("Rex",2001,12,1,"Bones");
////
////        Integer[] intArr = new Integer[3];
////    }
//
//        String message = "The cat in the hate comes back".trim().toLowerCase();
//        HashMap<Character, Integer> lettersCount = new HashMap<>();
//        for (char c : message.toCharArray()) {
//            if (c != ' ') {
//                if (!lettersCount.containsKey(c)) {
//                    lettersCount.put(c, 1);
//                } else {
//                    lettersCount.put(c, lettersCount.get(c) + 1);
//                }
//            }
//        }
//
//        System.out.println(lettersCount);

        public static HashSet<Integer> makeFiveSet(int max) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 5; i <= max; i += 5) {
                    set.add(i);
                }
            return set;
        }


        public static List<String> longWordList(String sentence) {
                ArrayList<String> longWords = new ArrayList<>();
                for (String word : sentence.split(" ")) {
                    if (word.length() >= 5) longWords.add(word);
                }
                return longWords;
            }

        }

