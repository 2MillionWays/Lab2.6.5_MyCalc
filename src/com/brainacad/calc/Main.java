package com.brainacad.calc;


import com.brainacad.shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triOne = new Triangle(3,4,5);

        System.out.println(triOne.getArea());
    }
}
