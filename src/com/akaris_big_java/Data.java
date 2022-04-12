package com.akaris_big_java;

public class Data<T> {
    T obj;
    void setObj(T v){
        obj =v;
    }
    T getObj(){
        return obj;
    }
    public  static  void main(String[] args){
        Data<Integer> d = new Data<>();
        d.setObj(100);
        System.out.println(d.getObj());

    }

}
