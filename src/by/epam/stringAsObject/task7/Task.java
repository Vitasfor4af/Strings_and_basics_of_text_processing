package by.epam.stringAsObject.task7;

import java.util.Scanner;

/* Вводится строка. Требуется удалить из нее повторяющиеся
   символы и все пробелы. Например, если было введено "abc cde
def", то должно быть выведено "abcdef". */

public class Task {

	public static void main(String[] args) {
		System.out.println("Input some message:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String newStr = "";
		int count = 0;

//		for (int i = 0; i < str.length(); i++) {
//			for (int j = 0; j < str.length(); j++) {
//				if (str.charAt(i) == str.charAt(j)) {
//					newStr += str.charAt(i);
//				}
//			}
//		}
		for (int i = 0; i < str.length(); i++) {
			if (!newStr.contains(String.valueOf(str.charAt(i)))) {
				newStr += String.valueOf(str.charAt(i));
			}
		}
		newStr = newStr.replace(" ", "");
		System.out.println(newStr);
	}

}
