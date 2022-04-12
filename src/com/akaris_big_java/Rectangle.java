package com.akaris_big_java;

public class Rectangle extends  Shape {
    double radius;



    @Override
    public double perimeter() {
        return 2 * Math.PI* radius  ;
    }

    public  double area(){
        return Math.PI*radius* radius;
    }
}
