package by.epam.stringAsArrayOfCharacters.task1;

import java.util.Scanner;

/* Дан массив названий переменных в camelCase.
   Преобразовать названия в snake_case. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of sentences = ");
		int size = scanner.nextInt();

		String[] values = new String[size];
		scanner.nextLine();
		for (int i = 0; i < values.length; i++) {
			System.out.println("Enter text containing camelCase words:");
			values[i] = scanner.nextLine();
		}
		scanner.close();

		System.out.println("Result of casting:");
		for (int i = 0; i < values.length; i++) {
			System.out.println(addUnderscoreToCamelCase(values[i]));
		}

	}

	private static char[] addUnderscoreToCamelCase(String variableStr) {
		char[] str = variableStr.toCharArray();
		int count = 0;
		for (int i = 0; i < str.length; i++) {
			if (Character.isUpperCase(str[i]) && i != 0) {
				count++;
			}
		}
		char[] copyStr = new char[str.length + count];
		for (int i = 0, j = 0; i < str.length; i++) {
			if (Character.isUpperCase(str[i]) && i != 0) {
				copyStr[j] = '_';
				copyStr[j + 1] = Character.toLowerCase(str[i]);
				j += 2;
			} else {
				copyStr[j] = str[i];
				j++;
			}
		}
		return copyStr;
	}

}
