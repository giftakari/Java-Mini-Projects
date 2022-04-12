package Java_Data_Structure;

import java.util.Scanner;

public class ComputeAverage {
    public  static void main(String[] args){

       // Create a Scanner object(users)
         Scanner input = new Scanner(System.in);

         // Prompt users to type input
        System.out.println("Enter three numbers :");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Compute the average of three numbers
        double average = (number1 + number2 + number3)/3;

        // Display the result to the users
        System.out.println("The average of: " + number1 +" " + number2 +" " + number3 + " is " + average) ;


    }
}
