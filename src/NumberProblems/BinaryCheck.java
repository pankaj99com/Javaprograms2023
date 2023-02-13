package NumberProblems;

import java.util.Scanner;

public class BinaryCheck {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Range");
		int num=sc.nextInt();
		int n=num;
		int rem=0;
		
		boolean flag=false;
		while(n!=0) {
			
			rem=n%10;
			n=n/10;
			if(rem>1) {
				flag=true;
			}
		}
		
		if(flag==false) {
			System.out.println("Binary number");
		}else {
			System.out.println("not a binary");
		}
	}

}
