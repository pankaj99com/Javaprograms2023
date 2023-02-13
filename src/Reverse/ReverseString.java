package Reverse;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");

		String str = sc.nextLine();
		String[] arr = str.split(" ");
		String s = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			s = s + arr[i]+" ";
		}
		System.out.println(s);
	}

}
