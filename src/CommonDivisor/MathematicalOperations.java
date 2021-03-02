package CommonDivisor;

import java.util.*;

/*
 * Defines methods for least common multiple(LCM)
 * through recursion
 */
public final class MathematicalOperations {

	/**
	 * L.C.M. of two numbers
	 * 
	 * @param int num1 First number
	 * @param int num2 Second Number
	 * @return int result of LCM
	 */
	public static int findLCM(int num1, int num2) {
		// return lcm of two numbers
		return lcm(num1, num2, 2);
	}

	/**
	 * Private Helper Method Return minimum of two numbers
	 * 
	 * @param int num1 First number
	 * @param int num2 Second Number
	 * @return int result of min
	 */
	private static int Min(int num1, int num2) {
		return num1 >= num2 ? num2 : num1;
	}

	/**
	 * Private Helper Method find lcm of two numbers
	 * 
	 * @param int num1 First number
	 * @param int num2 Second Number
	 * @param int k value of factor
	 * @return int result of LCM
	 */
	private static int lcm(int num1, int num2, int k) {
		// If either of the two numbers
		// is 1, return their product
		if (num1 == 1 || num2 == 1)
			return num1 * num2;

		// If both the numbers are equal
		if (num1 == num2)
			return num1;

		// If k is smaller than the
		// minimum of the two numbers
		if (k <= Min(num1, num2)) {

			// Checks if both numbers are
			// divisible by k or not
			if (num1 % k == 0 && num2 % k == 0) {

				// Recursively call LCM() function
				return k * lcm(num1 / k, num2 / k, 2);
			}

			// Otherwise
			else
				return lcm(num1, num2, k + 1);
		}

		// If k exceeds minimum
		else
			return num1 * num2;
	}

	/**
	 * H.C.F of two numbers using Euclid’s algorithm
	 * 
	 * @param int num1 First number
	 * @param int num2 Second Number
	 * @return int result of HCF
	 */
	public static int findHCF(int num1, int num2) {
		// if one number is equal to 0, return other number
		if (num1 == 0)
			return num2;

		// divide first number from second number
		return findHCF(num2 % num1, num1);
	}

	// main method to call other methods
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2; // declare two integer variable
		boolean flag = true; // for looping while loop
		

		while (flag) {
			System.out.println("\n\nMENU : \n" + "1. LCM of two numbers \n"
					+ "2. HCF of two numbers \n" + "0. Exit \n");
			System.out.println("Enter your choice: ");
			int choice = input.nextInt();
			switch (choice) {
			case 0:
				System.out.println("Okay, bye!");
				System.exit(1);

			case 1:
				System.out.println("Enter first num: ");
				num1 = PositiveIntegerException.setInput();
				System.out.println("Enter second num: ");
				num2 = PositiveIntegerException.setInput();
				System.out.println("LCM of " + num1 + " and " + num2 + " is: "
						+ MathematicalOperations.findLCM(num1, num2));
				break;

			case 2:
				System.out.println("Enter first num: ");
				num1 = PositiveIntegerException.setInput();
				System.out.println("Enter second num: ");
				num2 = PositiveIntegerException.setInput();
				System.out.println("HCF of " + num1 + " and " + num2 + " is: "
						+ MathematicalOperations.findHCF(num1, num2));
				break;
			default:
				System.out.println("Enter valid choice!!");
			}
		}

		input.close(); // Scanner input closed
	}

}
