
/**
 * Create a class with a method to find the difference between the sum of the
 * squares and the square of the sum of the first n natural numbers.
 * 
 * @author rutuja pise
 *
 */

import java.util.Scanner;
public class Exercise6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		System.out.println("Difference between um of squares and square of sum is " + calculateDifference(n));
		sc.close();
	}

	static int calculateDifference(int n) {
		int sq1, sq2, sum1 = 0, sum2 = 0;
		for (int i = 1; i <= n; i++) {
			sq1 = i * i;
			sum1 = sum1 + sq1;
		}
		for (int j = 1; j <= n; j++) {
			sum2 = sum2 + j;
		}
		sq2 = sum2 * sum2;

		int diff = sum1 - sq2;

		return diff;
	}

}
