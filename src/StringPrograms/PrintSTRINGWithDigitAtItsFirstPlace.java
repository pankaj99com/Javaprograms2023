package StringPrograms;

import java.util.Scanner;

public class PrintSTRINGWithDigitAtItsFirstPlace {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.nextLine();
		String digits="";
		String s="";
		
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			if(Character.isDigit(ch)) {
				
				digits=digits+ch;
			}else {
				s=s+ch;
			}
		}
		
		String str1=digits+s;
		
		System.out.println(str1);

	}

}
