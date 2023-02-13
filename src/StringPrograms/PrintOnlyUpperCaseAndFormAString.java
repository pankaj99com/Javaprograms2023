package StringPrograms;

import java.util.Scanner;

public class PrintOnlyUpperCaseAndFormAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the SString");
		String str = sc.nextLine();
		String s = "";// empty string and after checking the UC construct a
						// string

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				s = s + c;
			}
		}
		System.out.println(s);
	}

}
