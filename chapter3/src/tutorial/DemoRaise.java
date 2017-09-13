package tutorial;

import java.util.Scanner;

public class DemoRaise {

	public static void main(String[] args) {
		double salary;
		double startingWage;
		
		
		
		System.out.println("Demonstrating some raises");
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("input salary here >>");	
		salary =input.nextDouble();	
		System.out.println("input starting wage here >>");
		startingWage =input.nextDouble();
		predictRaise(400.00);
		predictRaise(salary);
		predictRaise(startingWage);

	}
public static void predictRaise(double salary) {
	
	double newSalary;
	final double RAISE_RATE = 1.10;
	newSalary = salary * RAISE_RATE;
	System.out.println("curent salary: " + salary + "  After raise: " + newSalary);
	
	
}
}
