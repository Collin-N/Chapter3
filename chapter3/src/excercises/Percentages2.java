package excercises;

import java.util.Scanner;

public class Percentages2 {

	public static void 
	main(String[] args) {
		 double  num1;
		 double num2;
		 double precent;
		 Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter first number >>");
			num1 = keyboard.nextDouble();
			System.out.println("Enter Second number >>");
			num2 = keyboard.nextDouble();
			precent = computePercent(num1, num2);
			System.out.println(num1 + " is " + precent + "% of " + num2);
		}
	 public static double computePercent(double pr, double dscent) {
		 double precent;
	 	precent = pr * dscent / 100;
	 	return precent;
		 

	}

}
