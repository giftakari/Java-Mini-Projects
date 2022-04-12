package Java_Data_Structure;

import java.util.Scanner;

public class SimpleIfDemo {
    public  static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer :");
        int number = input.nextInt();

        if(number %5 ==0){
            System.out.println("Hi five");
        }
        if(number % 2 ==0){
            System.out.println("Hi Even");
        }
    }
}
