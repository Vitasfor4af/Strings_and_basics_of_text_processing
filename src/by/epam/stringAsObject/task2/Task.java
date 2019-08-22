package by.epam.stringAsObject.task2;

import java.util.Scanner;

/* В строке вставить после каждого символа 'a' символ 'b'. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input some string:");
		String str = scanner.nextLine();
		String str2 = "";
		scanner.close();

		for (int i = 0; i < str.length(); i++) {
			str2 += str.charAt(i);
			if (str.charAt(i) == 'a') {
				str2 += 'b';
			}
		}

		System.out.println(str2);

	}
}
