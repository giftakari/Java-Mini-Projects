package com.akaris_big_java;

public class RegexExample {
    public  static void main(String[] args){
        String str = "p";
        System.out.println(str.matches("[^abc]"));
        String str2 ="XY";
        System.out.println(str2.matches("[a-zA-Z0-9]"));
        String str3 = "y9";
        System.out.println(str3.matches("[a-zA-Z][0-9]"));
        // Meta character

        String str4 = "a";
        System.out.println(str4.matches("\\S"));
        // USE quantifier

        String str5 ="abcdef";
        System.out.println(str5.matches(".*"));

        String str6= "akaris@gmail.com";

        System.out.println(str6.matches("\\w@gmail"));
        System.out.println("Java".matches("Java"));
        System.out.println("Java".equals("Java"));

        String ssn = "111 22 4444";
        System.out.println(ssn.matches("[\\d\s]{3}[\\d\s]{2}[\\d\s]{4}]"));
        System.out.println("Smith".matches("[a-zA-Z]{1,6}"));
        System.out.println("John123".matches("[a-zA-Z]+[0-9]+"));
        System.out.println();
        String message ="Welcome to Java";
        System.out.println(message.charAt(0));
        System.out.println(message.length());
        System.out.println(message.charAt(13));
        System.out.println(message.charAt(14));
        System.out.println(message.matches("[a-zA-Z].+"));
        System.out.println(message.matches("\\w.+"));




    }
}
