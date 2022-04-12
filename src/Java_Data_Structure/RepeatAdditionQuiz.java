package Java_Data_Structure;

import java.util.Scanner;

public class RepeatAdditionQuiz {
    public  static  void main(String[] args){
        int i =1;
        while (i < 10) if (i % 2 == 0) {
            System.out.println(i);
        }
        int number1 = (int)(Math.random()* 10);
        int number2 =(int)(Math.random()* 10);

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Whats is " + number1 + " + " + number2 + "?");
        int answer = input.nextInt();

        while ( number1 + number2 != answer){
            System.out.println("Ops, Try again. Whats is " + number1 + " + " + number2 +" ?");
            answer = input.nextInt();
        }
        System.out.println("You got it right");




    }
}
