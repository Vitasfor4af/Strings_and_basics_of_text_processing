package by.epam.stringAsObject.task3;

import java.util.Scanner;

/* Проверить, является ли заданное слово палиндромом. */

public class Task {

	public static void main(String[] args) {
		System.out.println("Input some word:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
		String str2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str2 += str.charAt(i);
		}
		if (str2.equals(str)) {
			System.out.println("the word is palindrome.");
		} else {
			System.out.println("the word is not palindrome.");
		}
	}

}
