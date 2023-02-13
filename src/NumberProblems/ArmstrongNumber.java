package NumberProblems;

import java.util.Scanner;

public class ArmstrongNumber {
//153=1+125+27=153
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Range");
		int num=sc.nextInt();
		int n=num;
		int sum=0;

		
		while(num!=0) {
			int rem=num%10;//153%10=3,15%10,1%10
			sum=sum+(rem*rem*rem);//0+27,27+125=152,152+1
			num=num/10;//15,1
			
		}
		
		if(sum==n) {
			System.out.println("Its a Armstrong number");
		}else {
			System.out.println("Its not a Armstrong number");
		}

	}

}
