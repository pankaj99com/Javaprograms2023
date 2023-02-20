package StringPrograms;

import java.util.Scanner;

public class PrintingOnlyDigits {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the SString");
		String str= sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			//Character.isSpace(ch)
			if(Character.isUpperCase(ch)) {
				
				System.out.print(ch);
				
				//System.out.println((int)ch);
			}
		}

	}

}

