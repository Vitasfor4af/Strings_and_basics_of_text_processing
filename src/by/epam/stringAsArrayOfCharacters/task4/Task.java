package by.epam.stringAsArrayOfCharacters.task4;

import java.util.Scanner;

/* в строке найти количество чисел */

public class Task {

	public static void main(String[] args) {
		System.out.println("Input some string:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char[] charArray = str.toCharArray();

		int digitCount = 0; 
		int numberCount = 0;
		boolean isNumber = false;
		for (int i = 0; i < str.length(); i++) {
			if (charArray[i] >= '0' && charArray[i] <= '9') {
				digitCount++;
				if (!isNumber) {
					numberCount++;
					isNumber = true;
				}
			} else {
				isNumber = false;
			}
		}
		System.out.println("Count of numbers = " + numberCount);

	}

}
