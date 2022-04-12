package com.akaris_big_java;

public class Main {

    public static void main(String[] args) {
       // Car car = new Car(100, "Mazda", "Momo");
        //System.out.println(car.carName);
        //System.out.println(car.speed());
        Student student = new Student(23, "Akaris", "Male");
        System.out.println(student.Id);
        System.out.println(student.name);
        System.out.println(student.gender);
        System.out.println(student.updateProdile("Godsgift"));



        String  state="MissiMa";

        System.out.println(state.length());
        System.out.println(state.toUpperCase());
        System.out.println(state.replace("issi", " Thanks Ma"));
        System.out.println("Hello World".replace("World", "Dave"));
	// write your code here
    }
}
