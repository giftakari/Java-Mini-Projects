package com.akaris_big_java;

import java.util.*;

public class DateTime {
    public  static  void main(String[] args){
        Date d = new Date("7/17/1982");
        System.out.println(d.getTime());


        GregorianCalendar gc = new GregorianCalendar();
        TimeZone tz = gc.getTimeZone();
        System.out.println("Hi");
        System.out.println("DateTime.main");

        System.out.format("");


                System.out.println(gc.isLeapYear(2023));



        System.out.println(gc.get(Calendar.DAY_OF_MONTH));

        System.out.println(System.currentTimeMillis()/1000);
        System.out.println(System.currentTimeMillis()/1000/60);
        System.out.println(System.currentTimeMillis()/1000/60/60);
        System.out.println(System.currentTimeMillis()/1000/60/60/24);
        System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
    }
}
