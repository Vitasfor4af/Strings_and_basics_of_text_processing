package by.epam.stringAsObject.task5;

import java.util.Scanner;

/* Подсчитать, сколько раз среди символов заданной строки
   встречается буква “а”. */

public class Task {

	public static void main(String[] args) {
		System.out.println("Input some message:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("count of \"a\" = " + count);
	}

}
