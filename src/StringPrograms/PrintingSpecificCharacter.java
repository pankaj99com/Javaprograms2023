package StringPrograms;

import java.util.Scanner;

public class PrintingSpecificCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the SString");
		String str = sc.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'A') {
				count++;
				

			}
		}
		System.out.println("The count of char is "+count);
	}

}
