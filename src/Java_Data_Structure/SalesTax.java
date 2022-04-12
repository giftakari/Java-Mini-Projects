package Java_Data_Structure;

import java.util.Scanner;

public class SalesTax {
    public  static  void main(String[] args){
        // Create a scanner class
        Scanner input = new Scanner(System.in);

        // Ask users to type  the sales price
        System.out.print(" Enter purchase amount :");
        double purchaseAmount = input.nextDouble();

        // Calculate tax
        double tax = purchaseAmount * 0.06;
        System.out.println("Sales is $" + (int)(tax * 100)/100.0);
        double amount =5;

        System.out.println(amount/2);
        System.out.println(5/2);


    }
}
