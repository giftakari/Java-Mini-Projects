package com.akaris_big_java;

public class GenericsDemo<T> {
   T data[] =(T[]) new Object[3];

    public  static  void main(String[] args){
        GenericsDemo<String> gd = new GenericsDemo<>();
        gd.data[0]= "Hi";
        gd.data[1]="Welome Akaris";
        gd.data[2]="Feel free";


        Object obj = new String("Hello Student");
        System.out.println(obj);
        obj = new Integer(100);
        System.out.println(obj);

        //




    }
}
