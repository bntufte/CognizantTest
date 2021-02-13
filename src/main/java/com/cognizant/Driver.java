package com.cognizant;

import java.util.Scanner;

public class Driver {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String input = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input an interger.");
		input = scan.nextLine();
		while (input != null)
		if (validateInput(input)) {
			System.out.println(processInput(input));
			input = null;
		}
		else {
			System.out.println("Input must be an integer 0 through 10.");
			System.out.println("Re-enter a valid number");
			input = scan.nextLine();
		}
		System.out.println("Program has ended.");
	}

	public static boolean validateInput(String num) {		
		if (num.equals("0") || num.equals("1") || num.equals("2") || num.equals("3") ||
			num.equals("4") || num.equals("5") || num.equals("6") || num.equals("7") ||
			num.equals("8") || num.equals("9") || num.equals("10"))
			return true;
		return false;
	}
	
	public static int processInput(String num) {
		int counter = 0;
		int number = Integer.parseInt(num);
		for(int i = 0; i <= number; i++) {
			String numberTemp = String.valueOf(i);
			for(int j = 0; j < numberTemp.length(); j++) {
				if(numberTemp.charAt(j) == '2') {
					++counter;
				}
			}
		}
		return counter;
	}
}
