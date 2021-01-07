
/**
 * Write a java program that simulates a traffic light. 
 * The program lets the user select one of three lights: red, yellow, or green with radio buttons. 
 * On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in 
 * the console .Initially there is no message shown.
 * 
 * @author rutuja pise
 */

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select one of three lights: Red, Yellow, Green");
		String in = sc.nextLine();
		System.out.println(trafficLight(in));
		sc.close();
	}

	static String trafficLight(String in) {
		switch (in) {
		case "red":
			return "stop";
		case "yellow":
			return "ready";
		case "green":
			return "go";
		}
		return null;
	}

}
