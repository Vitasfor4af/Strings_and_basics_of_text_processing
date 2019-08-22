package by.epam.regex.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа
   и его тип (открывающий  тег, закрывающий тег, содержимое тега, тег без тела).
   Пользоваться готовыми парсерами XML для решения данной задачи нельзя. */

public class Task {

	public static void main(String[] args) {
		String str = "<notes>\n" + "<note id = \"1\">\n" + "<to>Вася</to>\n" + "<from>Света</from>\n"
				+ "<heading>Напоминание</heading>\n" + "<body>Позвони мне завтра!</body>\n" + "</note>\n"
				+ "<note id = \"2\">\n" + "<to>Петя</to>\n" + "<from>Маша</from>\n"
				+ "<heading>Важное напоминание</heading>\n" + "<body/>\n" + "</note>\n" + "</notes>";
		
		String regex = "(?<=(<\\w+>)).+(?=(</\\w+>))";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}

}
