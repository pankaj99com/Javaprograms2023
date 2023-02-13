package Reverse;

import java.util.Scanner;

public class ReverseString3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		String str = sc.nextLine();
		
		String s="";		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			s=ch+s;
			
		}
		System.out.println(s);
		
	}

}
