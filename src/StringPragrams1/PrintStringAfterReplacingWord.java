package StringPragrams1;

import java.util.Scanner;

public class PrintStringAfterReplacingWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		str=str+" ";
		String word = "";
		String ns = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch != ' ') {
				word = word + ch;
			} else {

				if (word.equals("great")) {
					ns = ns + "powerful" + " ";
				} else {
					ns = ns + word + " ";
				}
				word = "";
			}
		}
		System.out.println(ns);
	}

}
