package Reverse;

import java.util.Scanner;

public class ReverseString6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		String str = sc.nextLine();
		
		StringBuffer sb=new StringBuffer(str);
		
		System.out.println(sb.reverse());
		
	}

}
