package NumberProblems;

import java.util.Scanner;

public class PrimeNumberInARange {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Range");
		int range=sc.nextInt();
		int count=0;
		for(int i=1;i<=range;i++) {
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count=1;
				}
			}
			
			if(count==0) {
				System.out.println(i);
			}else {
				
				count=0;
			}
		}

	}

}
