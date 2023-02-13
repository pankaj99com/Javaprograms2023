package NumberProblems;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		int n = num;
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		
		for(int i=1;i<=num;i++) {
			
			c=a+b;
			System.out.print(" "+c);
			
			a=b;
			b=c;
		}

	}

}
