package StringPrograms;

import java.util.Scanner;

public class PrintingStringAfterConvertingTheCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String s = "";
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			
			if(Character.isLowerCase(ch)) {
				s=s+Character.toUpperCase(ch);
			}else {
				s=s+Character.toLowerCase(ch);
			}
		}
		
		System.out.println(s);
	}

}
