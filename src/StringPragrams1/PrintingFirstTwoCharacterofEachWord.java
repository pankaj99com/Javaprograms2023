package StringPragrams1;

import java.util.Scanner;

public class PrintingFirstTwoCharacterofEachWord {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String word="";
		str=str+" ";
		
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(ch!=' ') {
				word=word+ch;
			}else if(word.length()<2) {
					System.out.println(word);
			}else {
					System.out.println(word.substring(0,2));
					word="";
				}
				
			
		}

	}

}
