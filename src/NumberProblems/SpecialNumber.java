package NumberProblems;

import java.util.Scanner;

public class SpecialNumber {
//153=1+125+27=153
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Range");
		int num=sc.nextInt();
		int n=num;
		int sum=0;
		int prod=1;

		
		while(num!=0) {
			int rem=num%10;
			prod=prod*rem;
			sum=sum+rem;
			num=num/10;
			
		}
		
		if(sum+prod==n) {
			System.out.println("Its a Special number");
		}else {
			System.out.println("Its not a special number");
		}

	}

}
