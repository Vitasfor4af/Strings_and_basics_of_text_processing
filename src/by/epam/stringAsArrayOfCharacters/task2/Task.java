package by.epam.stringAsArrayOfCharacters.task2;

import java.util.Scanner;

/* Замените в строке все вхождения 'word' на 'letter'. */

public class Task {

	public static void main(String[] args) {
		System.out.println("Input some string:");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		char[] charArray = str.toCharArray();
		
		System.out.println("The modified string is :");
		System.out.println(translate(charArray));

	}

	static char[] translate(char[] str) {
		char[] copyArr = new char[str.length * 2]; 
		// Start traversing from second character
		for (int i = 1; i < str.length; i++) {
			// If previous character is 'A' and
			// current character is 'B"
			if (str[i - 1] == 'w' && str[i] == 'o' && str[i + 1] == 'r' && str[i + 2] == 'd') {
				// Replace previous character with
				// 'C' and move all subsequent
				// characters one position back
				copyArr[i - 1] = 'l';
				copyArr[i + 1] = 'e';
				copyArr[i + 2] = 't';
				copyArr[i + 3] = 't';
				copyArr[i + 4] = 'e';
				copyArr[i + 5] = 'r';
				int j;
				for (j = i; j < copyArr.length - 1; j++)
					copyArr[j] = copyArr[j + 1];
				copyArr[j] = ' ';

			}
		}
		return copyArr;
	}

}
