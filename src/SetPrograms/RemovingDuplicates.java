package SetPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicates {

	public static void main(String[] args) {
		int [] arr= {12,13,14,8,43,7,12,34,2,8};
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(!set.add(arr[i])) {
				System.out.println("duplicate is "+arr[i]);
			}
		}
		

	}

}
