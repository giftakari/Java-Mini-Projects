package Java_Data_Structure;

import java.util.Scanner;

public class ComputeLoan {
    public  static  void main(String[] args){
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        //  Ask users to enter number no of years,loan amount , interest rate
        System.out.print("Enter annual interest rate, eg 0.25,9.55 etc: ");

        double annualInterestRate = input.nextDouble();

        // Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate /1200;

        // Enter number of years
        System.out.print("Enter number of years as an integer ");
        int numberOfYears = input.nextInt();

        // Enter loan amount
        System.out.print("Enter a loan amount eg 10.7 :");
        double loanAmount = input.nextDouble();

        // Calculate payment
        double monthlyPay = loanAmount * monthlyInterestRate/(1- 1/Math.pow(1+ monthlyInterestRate, numberOfYears *12));
        double totalPayment = monthlyPay * numberOfYears *12;

        // Display results
        System.out.println(" The monthly payment is $ "+ (int)(monthlyPay * 100)/100.0);
        System.out.println("The total payment is $" + (int)(totalPayment * 100)/100.0);





    }
}
