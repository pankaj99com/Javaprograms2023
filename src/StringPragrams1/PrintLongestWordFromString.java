package StringPragrams1;

import java.util.Scanner;

public class PrintLongestWordFromString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.nextLine();
		String word="";
		str=str+" ";
		String longest="";
		
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			
			
			if(ch!=' ') {
				
				word=word+ch;
				
			}else {
				
				if(word.length()>longest.length()) {
					
					longest=word;
					System.out.println(longest);
					
				}
				
				word="";
			}
		}
		
		System.out.println(longest);

	}

}
