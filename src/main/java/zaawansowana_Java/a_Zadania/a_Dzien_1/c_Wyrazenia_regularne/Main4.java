package zaawansowana_Java.a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

import java.util.regex.Pattern;

public class Main4 {

	public static void main(String[] args) {
		boolean result1 = Pattern.matches("(\\w+)=\\1", "Ala=Ala");
		System.out.println("result 1 " + result1);

		boolean result2 = Pattern.matches("\\.", ".");
		System.out.println("result 2 " + result2);

		boolean result3 = Pattern.matches("abc+", "abcccc");
		System.out.println("result 3 " + result3);

		boolean result4 = Pattern.matches("abc.", "abcw");
		System.out.println("result 4 " + result4);

		String pat1 = "abc\\.";
		boolean result5 = Pattern.matches(pat1, "abc.");
		System.out.println("result 5 " + result5);

		boolean result6 = Pattern.matches("(\\w+)=\\1", "Ala=Ala");
		System.out.println("result 6 " + result6);

		Pattern pattern1 = Pattern.compile("^abc");
		boolean result7 = pattern1.matcher("Nazywam sie abc").find();
		System.out.println("result 7 " + result7);

		boolean result8 = pattern1.matcher("abc to moje imie").find();
		System.out.println("result 8 " + result8);

		Pattern pattern2 = Pattern.compile("abc$");
		boolean result9 = pattern2.matcher("Nazywam sie abc").find();
		System.out.println("result 9 " + result9);

		boolean result10 = pattern2.matcher("abc to moje imie").find();
		System.out.println("result 10 " + result10);

		boolean result11 = Pattern.matches("[0-9]", "1");
		System.out.println("result 11 " + result11);

		boolean result12 = Pattern.matches("^\\d{2}-\\d{3}$", "09-522");
		System.out.println("result 12 " + result12);

	}

}
