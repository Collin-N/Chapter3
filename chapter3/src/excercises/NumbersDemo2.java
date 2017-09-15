package excercises;

import java.util.Scanner;

public class NumbersDemo2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("input one integer >>");
		num1 = input.nextInt();
		System.out.print("input second integer >>");
		num2 = input.nextInt();
		
		displayTwiceTheNumber(num1, num2);
		displayNumberPlusFive(num1, num2);
		displayNumberSquared(num1, num2);
	}
	public static void displayTwiceTheNumber(int x, int y)
	{
		int firstNumber;
		int secondNumber;
		
		firstNumber = x * 2;
		secondNumber = y * 2;
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
	
	}
	public static void displayNumberPlusFive(int a, int b) {
		int firstNumber;
		int secondNumber;
		
		firstNumber = a + 5;
		secondNumber = b + 5;
		
		System.out.println(firstNumber);
		System.out.println(secondNumber);
	}
	public static void displayNumberSquared(int i, int e) {
		
		int square = (int) Math.pow(i, 2);
		int square2 = (int)Math.pow(e, 2);
		
		System.out.println(square);
		System.out.println(square2);
	}

}
