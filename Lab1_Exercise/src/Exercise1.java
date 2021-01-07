/**
 * Create a method to find the sum of the cubes of the digits of an n digit number
 * @author rutuja pise
 *
 */

import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt(); 
		System.out.println("Cube of digits of "+num+" is "+cubeDigit(num));
		sc.close();
	}
	
	static int cubeDigit(int n) {
		int sum = 0, cube, digit;
		while(n>0) {
			digit = n%10;
			cube = digit*digit*digit;
			sum = sum + cube;
			n = n/10;
		}
		return sum;
	}

}
