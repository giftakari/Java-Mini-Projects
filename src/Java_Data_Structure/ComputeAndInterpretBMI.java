package Java_Data_Structure;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public  static  void main(String[] args){
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user for input for weight
        System.out.println("Enter a weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt user for input for height
        System.out.println("Enter a height in pounds: ");
        double height = input.nextDouble();

        final  double KILOGRAMS_PER_POUND = 0.45359237;
        final  double METER_PER_INCH = 0.0254;

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeter = height * METER_PER_INCH;
        double bmi = weightInKilograms/ (heightInMeter * heightInMeter);

        // Display  results to the console
        System.out.println("BMI is " + bmi);
      if (bmi < 18.5){
          System.out.println("Underweight");
      }
      else if(bmi <25){
          System.out.println("normal");
      }else if(bmi <30){
          System.out.println("Overweight");
      }else{
          System.out.println("Obese");
      }

    }
}
