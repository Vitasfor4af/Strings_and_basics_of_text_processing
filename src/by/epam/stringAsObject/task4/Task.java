package by.epam.stringAsObject.task4;

/* С помощью функции копирования и операции конкатенации
   составить из частей слова “информатика” слово “торт”. */

public class Task {

	public static void main(String[] args) {
		String str = "информатика";
		String str2 = "";
		str2 = str.substring(7, 8) + str.substring(3, 5) + str.substring(7, 8);
		System.out.println(str2);
	}
}
