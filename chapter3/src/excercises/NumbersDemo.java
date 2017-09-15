package excercises;

public class NumbersDemo {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
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
