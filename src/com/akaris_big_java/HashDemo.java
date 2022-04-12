package com.akaris_big_java;

import java.util.HashSet;

public class HashDemo{
    public static void main(String[] args){
        HashSet<Integer> hs = new HashSet<>();
        hs.add(100);
        hs.add(200);
        hs.add(499);
        hs.add(100);

        System.out.println(hs);
    }
}
