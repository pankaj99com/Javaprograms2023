package StringPragrams1;

import java.util.Scanner;

public class MakeFirstLetterOfWordAsUC {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		str=str+" ";
		String word="";
		String ns="";
		
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			
			if(ch!=' ') {
				word=word+ch;
			}else {
				
				char first=word.charAt(0);
				first=Character.toUpperCase(first);
				ns=ns+first+word.substring(1)+" ";
				
				word="";
			}
		}
		System.out.println(ns);
	}

}
