package StringPrograms;

import java.util.Scanner;

public class PrintEachWord_1 {
//printing each word character by character
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");//pankaj
		
		String str=sc.nextLine();//string
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);//
			System.out.println(ch);
		}

	}

}
