package StringPrograms;

import java.util.Scanner;

public class PrintStringWithUpperCaseAtFirstPlace {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String");
		String str= sc.nextLine();
		String UC="";
		String rest="";
		String s="";
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				UC=UC+ch;
			}else {
				rest=rest+ch;
			}
		}
		
		s=UC+rest;
		
		System.out.println(s);
	}
	

}
