package session7;

import java.util.Scanner;

public class Assignment2 {
	private static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		System.out.println("Enter the first String");
		String string = in.nextLine();
		System.out.println("Enter the sub String");
		String subString = in.nextLine();
		//checking if substring is present within String
		if(string.contains(subString)){
			System.out.println("Sub String Found");
		}
		else
			System.out.println("Sub String not found");
	}
}
