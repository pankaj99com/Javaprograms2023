package NumberProblems;

import java.util.Scanner;

public class PrintAllNumbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Range");
		int num=sc.nextInt();

		
		while(num!=0) {
			int rem=num%10;
			System.out.println(rem);
			num=num/10;
			System.out.println(num);
		}

	}

}
