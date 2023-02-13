package StringPragrams1;

import java.util.Scanner;

public class PrintingEachWordContainsSpecificCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String word = "";
		str = str + " ";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {
				if (word.contains("a"))
					System.out.println(word);
				word = "";
			}

		}

	}

}
