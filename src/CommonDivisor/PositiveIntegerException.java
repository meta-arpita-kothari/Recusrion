package CommonDivisor;

import java.util.*;

public class PositiveIntegerException {
	static Scanner scan = new Scanner(System.in);

	PositiveIntegerException(Scanner in) {
		scan = in;
	}

	// handle scan exception
	// scan should be a positive integer
	static int setInput() {

		int num = 0;
		boolean flag = true;
		while (flag) {
			if (scan.hasNext()) {
				if (scan.hasNextInt()) {

					try {

						num = scan.nextInt();
					} catch (InputMismatchException e) {

						scan.next();
					}
					if (num > 0) {
						flag = false;
					} else {
						System.out.println("Please enter positive integer.");
					}
				} else {
					System.out.println("Enter correct format of input");
					scan.next();
				}
			}

		}
		return num;
	}
}
