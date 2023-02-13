package StringPragrams1;

import java.util.Scanner;

public class PrintingEachWord {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.nextLine();
		str=str+" ";
		String word="";
		
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			
			if(ch!=' ') {
				word=word+ch;
			}else {
				System.out.println(word);
				word="";
			}
		}

	}

}
