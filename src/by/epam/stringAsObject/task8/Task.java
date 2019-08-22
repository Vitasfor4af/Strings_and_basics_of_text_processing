package by.epam.stringAsObject.task8;

import java.util.Scanner;

/* Вводится строка слов, разделенных пробелами.
 *  Найти самое длинное слово и вывести его на экран.
 *   Случай, когда самых
длинных слов может быть несколько, не обрабатывать. */

public class Task {

	public static void main(String[] args) {
		System.out.println("Input some message with spaces:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();

		int i;
		int max = 0;
		int id = 0;
		int count = 0;
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count += 1;
			} else {
				if (count > max) {
					max = count;
					id = i - count;
				}
				count = 0;
			}
		}
		if (count > max) {
			max = count;
			id = i - count;
		}
		max += id;
		for (i = id; i < max; i++) {
			System.out.print(str.charAt(i));
		}
	}
}
