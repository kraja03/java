package com.sparta.kr.adv_unittesting;

public class FizzBuzzExample {

    public static String FizzBuzz(int n) {
//        return Integer.toString(n) ;
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }else if (n % 3 == 0){
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
        return Integer.toString(n);
    }
//        return n % 15 == 0 ? "FizzBuzz" :
//                n % 5 == 0 ? "Buzz" :
//                        n % 3 == 0? "Fizz" :
//                                Integer.toString(n);
    }
}
