
/**
 * The Fibonacci sequence is defined by the following rule. The first 2 values 
 * in the sequence are 1, 1. Every subsequent value is the sum of the 2 values preceding it. 
 * Write a Java program that uses both recursive and non-recursive functions to print 
 * the nth value of the Fibonacci sequence
 * 
 * @author rutuja pise
 */

import java.util.Scanner;

class Fibonacci {
	int nonRecFibonacci(int n) {
		int a = 1, b = 1, c = 0;
		if (n == 1)
			return 1;
		else if (n == 2)
			return 1;
		else {
			for (int i = 3; i <= n; i++) {
				c = a + b;
				a = b;
				b = c;
			}
			return c;
		}
	}

	int recFibonacci(int n) {
		if (n == 1)
			return 1;
		else if (n == 2)
			return 1;
		else {
			return recFibonacci(n - 1) + recFibonacci(n - 2);
		}
	}
}

class Exercise3 {
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n = sc.nextInt();
		System.out.println("Using Recursive method: " + f.recFibonacci(n));
		System.out.println("Using Non Recursive method: " + f.nonRecFibonacci(n));
		sc.close();
	}
}