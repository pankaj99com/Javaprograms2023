package StringPragrams1;

import java.util.Scanner;

public class MakeAlternateWordAsUC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		str = str + " ";
		String word = "";
		String ns = "";
		
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			if(ch!=' ') {
				word=word+ch;
			}
			else {
				if(count++%2==0) {
					ns=ns+word.toUpperCase()+" ";
				}else {
					ns=ns+word.toLowerCase()+" ";
				}
				
				
				word="";
			}
		}
		System.out.println(ns);

	}

}
