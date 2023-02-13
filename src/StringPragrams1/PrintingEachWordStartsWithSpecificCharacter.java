package StringPragrams1;

import java.util.Scanner;

public class PrintingEachWordStartsWithSpecificCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String word = "";
		str = str + " ";
		System.out.println("Enter the word to be searched");
		String sw=sc.next();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ') {
				word = word + ch;
				
			} else {
				if (word.startsWith(sw)) {
					System.out.println(word);
				word = "";
				}else {
					System.out.println("word not found"+i);
				}
					
			}

		}

	}

}
