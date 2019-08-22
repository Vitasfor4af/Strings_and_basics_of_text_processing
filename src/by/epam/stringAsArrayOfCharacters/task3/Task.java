package by.epam.stringAsArrayOfCharacters.task3;

import java.util.Scanner;

/* в строке найти количество цифр */

public class Task {

	public static void main(String[] args) {
		System.out.println("Input some string:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();

		char[] charArray = str.toCharArray();
		System.out.println("Number of digits = " + digitCount(charArray));
	}

	private static int digitCount(char[] charArray) {
		int digitCount = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= '0' && charArray[i] <= '9') {
				digitCount++;
			}
		}
		return digitCount;
	}

}
