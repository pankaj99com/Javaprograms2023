package StringPragrams1;

import java.util.Scanner;

public class CountNumberOfWordsStartsWithSpecificChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		str=str+" ";
		String word="";
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			if(ch!=' ') {
				word=word+ch;
			}else {
				if(word.startsWith("I")) {
					count++;
				}
				word="";
			}
		}
		
		System.out.println(count);

	}

}
