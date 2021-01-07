
/**
 * Write a Java program that prompts the user for an integer and 
 * then prints out all the prime numbers up to that Integer
 * 
 * @author rutuja pise
 */
import java.util.Scanner;

class Exercise4 {
	public static void main(String[] args) {
		int num, p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num = sc.nextInt();
		for (int i = 2; i < num; i++) {
			p = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					p = 1;
			}
			if (p == 0) {
				System.out.println(i);
			}

		}
		sc.close();
	}
}