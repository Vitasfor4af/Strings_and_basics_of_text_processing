package by.epam.stringAsObject.task9;

import java.util.Scanner;

/* Посчитать количество строчных (маленьких) и
   прописных (больших) букв в введенной строке. Учитывать только английские
буквы. */

public class Task {

	public static void main(String[] args) {
		System.out.println("Input some message with spaces:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		while (isStringOnlyLatinAlphabet(str)) {
			System.out.println("Invalid data, try again");
			str = scanner.nextLine();
		}

		scanner.close();
		int countLowerCase = 0;
		int countUpperCase = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				countLowerCase++;
			} else if (Character.isUpperCase(str.charAt(i))) {
				countUpperCase++;
			}
		}
		System.out.println("the string \"" + str + "\" has " + countLowerCase + " lowercase and " + countUpperCase
				+ " uppercase letters.");
	}

	public static boolean isStringOnlyLatinAlphabet(String str) {
		if (str == null || str.equals("")) {
			return true;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((!(ch >= 'A' && ch <= 'Z')) && (!(ch >= 'a' && ch <= 'z')) && (!(ch == ' '))) {
				return true;
			}
		}
		return false;
	}

}
