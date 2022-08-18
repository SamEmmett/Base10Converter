// ******************************************************************
//   BaseConversion.java
//
//   Recursively converts an integer from base 10 to another base
// ******************************************************************

import java.util.Scanner;

public class BaseConversion {

	public static void main(String[] args) {
		int base10Num;
		int base;

		Scanner scan = new Scanner(System.in);

		System.out.println();
		System.out.println("Base Conversion Program");
		System.out.print("Enter an integer: ");

		base10Num = scan.nextInt(); // assign the value to base10Num

		System.out.print("Enter the base: ");

		base = scan.nextInt(); // assign the value to base

		// Call convert and print the answer
		System.out.println(base10Num + " in base " + base + " is " + convert(base10Num, base));
	}

	// --------------------------------------------------
	// Converts a base 10 number to another base.
	// --------------------------------------------------
	public static String convert(int num, int b) {

		int quotient; // declare the quotient when num is divided by base b

		int remainder; // declare the remainder when num is divided by base b

		

		// calculate quotient
		quotient = num / b;

		// calculate remainder
		remainder = num % b;

		// base case: when quotient is 0
		if (quotient == 0) {
			return "" + remainder;
		}

		// recursive case: when quotient is not 0
		else {
			return convert(quotient, b) + remainder;
		}

	}
}
