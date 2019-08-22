package by.epam.stringAsObject.task1;

import java.util.Scanner;

/* Дан текст (строка). Найдите наибольшее количество подряд
   идущих пробелов в нем. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input some string:");
		String str = scanner.nextLine();
		System.out.println(getMaxSpacesCount(str));
		scanner.close();
	}

	private static int getMaxSpacesCount(String str) {
		int maxSpaces = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				int spacesCount = 0;

				while (str.charAt(i) == ' ') {
					spacesCount++;
					i++;
				}
				if (spacesCount > maxSpaces) {
					maxSpaces = spacesCount;
				}
			}
		}
		return maxSpaces;
	}

}
