package by.epam.stringAsObject.task6;

import java.util.Scanner;

/* Из заданной строки получить новую, повторив каждый символ дважды. */

public class Task {

	public static void main(String[] args) {
		System.out.println("Input some message:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();

		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			newStr += str.charAt(i);
			newStr += str.charAt(i);
		}
		System.out.println(newStr);
	}

}
