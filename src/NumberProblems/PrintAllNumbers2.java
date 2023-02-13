package NumberProblems;

import java.util.Scanner;

public class PrintAllNumbers2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Range");
		int num=sc.nextInt();
		String str="";
		String ns="";


		
		while(num!=0) {
			int rem=num%10;
			
			num=num/10;
			str=String.valueOf(rem);
			
			for(int i=0;i<str.length();i++) {
				char ch=str.charAt(i);
				
				ns=ch+ns;
						
						
			}
		}
		System.out.println(Integer.parseInt(ns));

	}

}
