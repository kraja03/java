package com.sparta.kr.oop.shapes;

public abstract class Shape {
    public abstract int calculateArea();

    @Override
    public String toString(){
        return getClass().getName() + "Area " + calculateArea();
    }

}
