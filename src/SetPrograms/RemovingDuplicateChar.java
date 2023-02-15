package SetPrograms;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicateChar {

	public static void main(String[] args) {
		//programming--progamin
		String str="programming";
		Set<Character> set =new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			
			if(!set.add(str.charAt(i))) {
				
			}
		}
		System.out.println(set);
		

	}

}
