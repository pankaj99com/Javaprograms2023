package StringPrograms;

import java.util.Scanner;

public class PrintingCountOfUpperCaseChar {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the SString");
		String str= sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)) {
				count++;
				System.out.print(ch);
			
			}
			
		}
		System.out.println();
		System.out.println(count);
	}

}
