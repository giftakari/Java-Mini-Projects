package Java_Data_Structure;

import java.util.Scanner;

public class ComputeAreaWithConsole {
    public  static  void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for radius :");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * 3.14159;
        // Display to the console
        System.out.println("The area for the circle of radius: " + radius + " is "+ area);
    }
}
