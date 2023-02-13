package StringPragrams1;

import java.util.Scanner;

public class FindSpecificWordInAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		
		String str= sc.nextLine();
		str=str+"";
		String word="";
		int count=0;
		System.out.println("Enter the word");
		String w=sc.next();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' ') {
				word=word+ch;
			}else {
				if(word.equalsIgnoreCase(w)) {
					System.out.println(word);
					count++;
				}
				word="";
			}
		}
		if(count==0) {
			System.out.println("Word not found");
		}else {
			System.out.println("Word found");
		}

	}

}
