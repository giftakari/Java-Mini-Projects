package Java_Data_Structure;

import java.util.Scanner;

public class ComputeAreaWithConstant {
    public  static  void main(String[] args){


        final  double PI = 3.14159;

        //Create a scanner class
        Scanner input = new Scanner( System.in);

        //Prompt the user to enter a radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area =  radius * radius * PI;

        // Prints output to the user's console
        System.out.println("The area for the circle of radius : " + radius + " is " + area);
        System.out.println(Math.pow(2,5));




    }
}
