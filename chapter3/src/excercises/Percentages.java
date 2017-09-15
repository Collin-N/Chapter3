package excercises;

public class Percentages {

	public static void main(String[] args) {
	    double  num1 = 99;
		double num2 = 99;
		double precent;
		precent = computePercent(num1, num2);
		System.out.println(num1 + " " + precent + " " + num2);
	}
 public static double computePercent(double pr, double dscent) {
	 double precent;
 	precent = pr * dscent / 100;
 	return precent;
	 
 }
}
