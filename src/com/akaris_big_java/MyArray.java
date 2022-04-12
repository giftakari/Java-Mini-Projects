package com.akaris_big_java;

public class MyArray {
    static <E> void show (E[]  list){
        for (E e:list
             ) {
            System.out.println(e);
        }
    }
    public  static  void  main (String[] args){
        show(new String[]{"Hi", "Godsgift", "Akari"});
        show(new Integer[]{30,78,200,75});
    }


}
