package NumberProblems;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int n=num;
		
		System.out.println("Factors of "+num+" are:");
		for(int i=1;i<=n/2;i++) {
			
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		
		
	}

}
