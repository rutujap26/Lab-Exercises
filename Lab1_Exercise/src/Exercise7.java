
/**
 * Create a method to check if a number is an increasing number
 * 
 * @author rutuja pise
 *
 */

import java.util.Scanner;
public class Exercise7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		boolean flag = checkNumber(num);

		if (flag) {
			System.out.println("Number is not an increasing number");
		} else {
			System.out.println("Number is an increasing number");
		}
		sc.close();
	}

	static boolean checkNumber(int n) {
		int digit = n % 10;
		boolean flag1;
		n = n / 10;
		while (n > 0) {
			if (digit <= n % 10) {
				flag1 = true;
				return flag1;

			}
			digit = n % 10;
			n = n / 10;
		}
		return false;
	}

}
