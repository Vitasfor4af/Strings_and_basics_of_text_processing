package by.epam.stringAsArrayOfCharacters.task4;

import java.util.Scanner;

/* в строке найти количество чисел */

public class Task {

	public static void main(String[] args) {
		System.out.println("Input some string:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();

		char[] charArray = str.toCharArray();

		System.out.println("Count of numbers = " + numberCount(charArray));

	}

	private static int numberCount(char[] charArray) {
		boolean numberFlag = true;
		int numberCount = 0;
		
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] >= '0' && charArray[i] <= '9') {
				if (numberFlag) {
					numberCount++;
					numberFlag = false;
				}
			}
			else {
				numberFlag = true;
			}
		}

		return numberCount;
	}

}
