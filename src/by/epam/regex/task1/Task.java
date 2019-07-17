package by.epam.regex.task1;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Cоздать приложение, разбирающее текст (текст хранится в строке)
   и позволяющее выполнять с текстом три различных операции:
   отсортировать абзацы по количеству предложений;
   в каждом предложении отсортировать слова по длине;
   отсортировать лексемы в предложении по убыванию количества
   вхождений заданного символа, а в случае равенства – по
   алфавиту. */

public class Task {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input some message:");
		String str = scanner.nextLine();

		System.out.println("\nWhat do you want to do?\nsort the paragraphs by the number of sentences(1);\n"
				+ "in each sentence, sort the words by length(2);\n"
				+ "sort the tokens in the sentence in descending order of quantity occurrences of a given character(3).");
		int choice;
		switch (choice = scanner.nextInt()) {
		case 1:
			System.out.println("1");
			StringTokenizer strToken = new StringTokenizer(str, ".?!");
			int count = strToken.countTokens(); // Counting no. of sentences in the paragraph
			if (count > 10)
				System.out.println("A maximum of 10 sentences are allowed in the paragraph");
			else {
				String sent[] = new String[count]; // Array to store the sentences separately
				int p[] = new int[count]; // Array to store no. of words of each sentence

				for (int i = 0; i < count; i++) {
					sent[i] = strToken.nextToken().trim(); // Saving sentences one by one in an array
					p[i] = countWords(sent[i]); // Saving no. of words of every sentence
				}
				sort(sent, p);
			}
			break;
		case 2:
			System.out.println("2");

			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("Invalid choice");
			System.exit(0);
			break;
		}
	}

	public static int countWords(String s) {
		StringTokenizer str = new StringTokenizer(s, " .,?!");
		int c = str.countTokens();
		return c;
	}

	// Function to sort the sentences in ascending order of their no. of words
	public static void sort(String w[], int p[]) {
		int n = w.length, t1 = 0;
		String t2 = "";

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (p[i] > p[j]) // for descending use p[i]<p[j]
				{
					t1 = p[i];
					p[i] = p[j];
					p[j] = t1;
					t2 = w[i];
					w[i] = w[j];
					w[j] = t2;
				}
			}
		}
		printResult(w, p); // Calling function for printing the result
	}

	public static void printResult(String w[], int p[]) // Function to print the final result
	{
		int n = w.length;
		for (int i = 0; i < n; i++) {
			System.out.println(w[i] + "\t=\t" + p[i]);
		}
	}

}
