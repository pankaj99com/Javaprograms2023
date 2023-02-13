package StringPrograms;

import java.util.Scanner;

public class PrintingTotalNumberOfVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the SString");
		String str = sc.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			char ch=Character.toUpperCase(c);
			
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				count++;
			}
		}
		System.out.println(count);
	}

}
