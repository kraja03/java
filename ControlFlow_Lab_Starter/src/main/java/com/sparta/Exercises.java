package com.sparta;

public class Exercises {

    // Question 1 change this method so that it uses the ternary operator ?
    public static String getForecast(int temp) {
        return (temp < 15) ? "It's cold" : "It's hot";
    }

    // Question 2
    // returns the average of the array nums
    public static double average(int[] nums) {
        if (nums == null || nums.length == 0){
            throw new NullPointerException("Array must not be empty ");
        }
        double sum = 0;
        for (int n : nums){
            sum += n;
        }
        return sum / nums.length;
        
    }

    // Question 3

    // returns the type of ticket a customer is eligible for based on their age
    // "Standard" if they are between 18 and 59 inclusive
    // "OAP" if they are 60 or over
    // "Student" if they are 13-17 inclusive
    // "Child" if they are 5-12
    // "Free" if they are under 5
    public static String ticketType(Integer age) {
        String ticketType;

        if (age == null) {
            throw new NullPointerException("Age must not be null");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age must be 0 or greater");
        }
        if (age >= 18 && age <= 59) {
            ticketType = "Standard";
        } else if (age >= 60) {
            ticketType = "OAP";
        } else if (age >= 13) {
            ticketType = "Student";
        } else if (age >= 5) {
            ticketType = "Child";
        } else {
            ticketType = "Free";
        }
        return ticketType;
        }


    // Question 4
    public static String grade(Integer mark) {
        var grade = "";

        if (mark == null) {
            throw new NullPointerException("Mark must not be null");
        }
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Mark must be between 0 and 100");
        }
        if (mark >= 75) {
            grade = "Pass with Distinction";
        } else if (mark >= 60) {
            grade = "Pass with Merit";
        } else if (mark >= 40) {
            grade = "Pass";
        } else {
            grade = "Fail";
        }
        return grade;
    }

    // Question 5
    public static int getScottishMaxWeddingNumber(Integer covidLevel) {
        if (covidLevel == null) {
            throw new NullPointerException("CovidLevel must not be null");
        }
        switch (covidLevel) {
            case 0:
                return 200;
            case 1:
                return 100;
            case 2:
                return 50;
            case 3:
                return 50;
            case 4:
                return 20;
            default:
                return 0;
        }
    }
}
