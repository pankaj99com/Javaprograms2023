package NumberProblems;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		int n=0;
		n=num;
		
		int count=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		
		if(count==2) {
			System.out.println("its a prime number");
		}else {
			System.out.println("Its not a prime number");
		}
	}

}
