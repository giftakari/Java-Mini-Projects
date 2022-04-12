package com.akaris_big_java;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public  static  void  main(String[] args){
        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);
        p.forEach(x -> System.out.println(x));

        System.out.println(p.element());

    }
}
