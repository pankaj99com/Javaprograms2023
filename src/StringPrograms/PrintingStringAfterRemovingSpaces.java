package StringPrograms;

import java.util.Scanner;

public class PrintingStringAfterRemovingSpaces {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isWhitespace(ch)) {
				s = s + ch;
			}
		}
		System.out.println(s);
	}

}
