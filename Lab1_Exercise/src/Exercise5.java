
/**
 * Create a class with a method which can calculate the sum of first n natural
 * numbers which are divisible by 3 or 5.
 * 
 * @author rutuja pise
 *
 */

import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt(); 
		int sumOfNum = calculateSum(n);
		System.out.println("Sum of " + n + " natural numbers which are divisible by 3 or 5 is " + sumOfNum);
		sc.close();
	}

	static int calculateSum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

}
