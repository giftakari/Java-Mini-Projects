package com.akaris_big_java;

import java.util.*;

public class ListDemo {
    public  static void main(String[] args){
        LinkedList<Integer> allList = new LinkedList<>();
        LinkedList<Integer> allList2 = new LinkedList<>(List.of(50,60,70,80,90));
        allList.add(100);
        allList.add(0, 5);
        allList.addAll(allList2);
        System.out.println(allList);
        System.out.println(allList.indexOf(70));
        System.out.println(allList.set(4, 200));
        System.out.println(allList);

        // Loops through the collections
        allList.forEach(x -> show(x));

    }

    static  void show(int n){
        if(n> 60){
            System.out.println(n);
        }
        if (n<60){
            System.out.println("Too low");
        }

    }

}
