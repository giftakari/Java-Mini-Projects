package com.akaris_big_java;

public class Student {
    int Id;
    String name;
    String gender;

    Student(int Id, String name, String gender){
        this.Id = Id;
        this.name =name;
        this.gender= gender;
    }

    String updateProdile(String newName){
        this.name = newName;

        return this.name;
    }

}
