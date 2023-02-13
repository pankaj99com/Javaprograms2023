package NumberProblems;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Range");
		int num=sc.nextInt();
		int n=num;
		int sum=0;

		
		while(num!=0) {
			int rem=num%10;//545%10=5,54%10=4,5%10=5
			sum=sum*10+rem;//5,50+4=54,540+5=545
			num=num/10;//54,5,0
			
		}
		
		if(sum==n) {
			System.out.println("Its a Plaindrome number");
		}else {
			System.out.println("Its not a plaindrome number");
		}

	}

}
