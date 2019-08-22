package by.epam.stringAsObject.task10;

import java.util.Scanner;

/* Строка X состоит из нескольких предложений,
   каждое из которых кончается точкой, восклицательным или
    вопросительным знаком.
     Определить количество предложений в строке X. */

public class Task {

	public static void main(String[] args) {
		System.out.println("Input some message with spaces:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		while (isText(str) < 1) {
			System.out.println("The entered text does not contain sentences (at least one sentence). try again");
			str = scanner.nextLine();
		}
		scanner.close();

		System.out.println("This text has " + isText(str) + " sentences.");
	}

	public static int isText(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == '.') || (str.charAt(i) == '?') || (str.charAt(i) == '!')) {
				count++;
			}
		}
		return count;
	}

}
