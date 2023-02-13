package Reverse;

import java.util.Scanner;

public class ReverseString7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		String str = sc.nextLine();
		
		StringBuilder sb=new StringBuilder(str);
		
		System.out.println(sb.reverse());
		
	}

}
