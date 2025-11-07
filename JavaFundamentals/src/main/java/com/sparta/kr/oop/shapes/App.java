package com.sparta.kr.oop.shapes;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle (5, 5);
        System.out.println(rectangle);

        Shape circle = new Circle (5);
        System.out.println(circle);

        ArrayList<Shape>shapes = new ArrayList<>(List.of(rectangle, circle));

        for(Shape shape : shapes){
            System.out.println(shape);
        }
    }
}
