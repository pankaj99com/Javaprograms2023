package StringPragrams1;

import java.util.Scanner;

public class PrintingEachWordOfSpecificLength {

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
				if (word.length()==5)
					System.out.println(word);
				word = "";
			}

		}

	}

}
