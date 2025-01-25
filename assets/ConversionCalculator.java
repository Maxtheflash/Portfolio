// Branden Maxwell 
// Conversions Lab week 8

import java.util.Scanner;

//class statement

public class ConversionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for measurement or number (double) (string)
		
        System.out.print("Enter the measurement or number to convert: ");
        double value = scanner.nextDouble();
        System.out.print("Enter the conversion code: Hint (GL, IC, PK, MK):  ");
		
		// input from user converted to uppercase for better results 
		
        String conversionCode = scanner.next().toUpperCase();  

        // Creation of Switch Statements for conversions
		
        switch (conversionCode) {
           
		   case "GL":
                double liters = value * 3.78541178;
                System.out.println(value + " gallons is equal to " + liters + " liters.");
                break;
           
		   case "IC":
                double centimeters = value * 2.5;
                System.out.println(value + " inches is equal to " + centimeters + " centimeters.");
                break;
            
			case "PK":
                double kilograms = value * 0.45359237;
                System.out.println(value + " pounds is equal to " + kilograms + " kilograms.");
                break;
           
		   case "MK":
                double kilometers = value * 1.609344;
                System.out.println(value + " miles is equal to " + kilometers + " kilometers.");
                break;
           
		   default:
                System.out.println("Invalid conversion code. Please enter GL, IC, PK, or MK.");
                break;
        }

        scanner.close();
    }
}
