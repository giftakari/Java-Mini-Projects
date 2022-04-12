package com.akaris_big_java;

import java.util.ArrayDeque;

public class DequeDemo {
    public  static  void main(String[] args){
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offerLast(100);
        dq.offerLast(20);
        dq.offerLast(30);
        dq.offerLast(40);
        dq.offerLast(50);
        System.out.println(dq);
        dq.forEach(x-> System.out.println(x));

    }
}
