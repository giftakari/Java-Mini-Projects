package Java_Data_Structure;

import java.util.Scanner;

public class AdditionQuiz {
    public  static  void main(String[] args ){
        int number1 = 500;
        int number2 = 1000;
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input from users
        System.out.print("What is " + number1 +" + " + number2 +" :");

        // Calculate the sum
        int total = number1 + number2;
        if(input.nextInt() ==total){
            System.out.println(" You are Correct," + number1 + " + "  + number2 + " equals " + total);
        }
        else{
            System.out.println("Ops, please check and try again" );
        }



    }
}
