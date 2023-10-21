/*
	Make a JAVA program which will – Generate random decimal number from 0 up to 100
		Print out
			1. The number
			2. Integer part of the number
			3. Decimal part of the number
			4. Character whose CODE is number from (2)
		– The printout should be with proper formatting
*/
import java.util.Random;

class Main {
	public static void main( String args[]) {
		// Generate a Random Number
		Random random = new Random();
		double numberDouble = random.nextDouble() * 100;
		int numberInt = (int)numberDouble;

		// Print out the results
		System.out.println("From 0..100, the computer picked " + numberDouble);
		System.out.println("Integer part of this number is:" + numberInt ); 
		System.out.println("Decimal part of this number is: " + (numberDouble - numberInt) );
		System.out.println("Character with code: " + numberInt + " is: " + (char)numberInt );
	}
}
