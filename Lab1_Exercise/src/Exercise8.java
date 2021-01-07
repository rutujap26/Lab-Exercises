
/**
 * Create a method to check if a number is a power of two or not
 * 
 * @author rutuja pise
 *
 */

import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = sc.nextInt();
		boolean flag = checkNumber(n);

		if (flag) {
			System.out.println("Number is a power of 2");
		} else {
			System.out.println("Number is not a power of 2");
		}
		sc.close();
	}

	static boolean checkNumber(int num) {
		while (num > 1) {
			if (num % 2 != 0) {
				return false;
			}
			num = num / 2;
		}
		return true;

	}

}
