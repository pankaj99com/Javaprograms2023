package Reverse;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		String str = sc.nextLine();
		char[] ch=str.toCharArray();
		String s="";		
		for(int i=0;i<ch.length;i++) {
			s=ch[i]+s;
			
		}
		System.out.println(s);
		
	}

}
