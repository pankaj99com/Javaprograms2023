package NumberProblems;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Range");
		int num=sc.nextInt();
		int n=num;
		int rem=0;
		String sum="";
		
		while(n!=0) {
			
			rem=n%2;//8%2=4%2=0,2%2=0
			sum=rem+sum;//sum=0+0=0,sum=0,0
			
			n=n/2;//8/2=4,4%2=2
			
		}
		System.out.print(sum);
	}

}
