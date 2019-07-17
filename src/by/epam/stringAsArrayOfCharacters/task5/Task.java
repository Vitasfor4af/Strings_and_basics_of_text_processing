package by.epam.stringAsArrayOfCharacters.task5;

import java.util.Scanner;

/* Удалить в строке все лишние пробелы,
   то есть серии подряд идущих пробелов заменить на одиночные пробелы.
   Крайние пробелы в строке удалить. */

public class Task {

	public static void main(String[] args) {
		System.out.println("Input some string:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char[] charArray = str.toCharArray();
		char[] copyArray = new char[charArray.length];
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i; j < copyArray.length; j++) {
				if (!(charArray[i] == ' ')) {
					copyArray[j] = charArray[i];
				}
			}
		}
		System.out.println(copyArray);

	}

}
