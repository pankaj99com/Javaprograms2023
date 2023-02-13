package StringPragrams1;

import java.util.Scanner;

public class PrintingSpecialWord {
//I love my MOm
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.nextLine();
		String word="";
		str=str+" ";
		for(int i=0;i<str.length();i++) {
			
			char ch= str.charAt(i);
			if(ch!=' ') {
				word=word+ch;
			}else {
				
				char first=word.charAt(0);//M
				char last=word.charAt(word.length()-1);//last index,M
				
				
				if((Character.toUpperCase(first))==(Character.toUpperCase(last))) {
					System.out.println(word);
				}
				
				word="";
			}
		}
	}

}
