package SetPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindingDuplicates {

	public static void main(String[] args) {
		String str="I love love India I my Country India";
		String[] strArr=str.split(" ");
		String ss="";
		Set<String> set=new LinkedHashSet<String>();
		StringBuilder sb= new StringBuilder();
		for(String w:strArr) {
			if(!set.add(w)) {
				
			
				sb.append(w+",");
			}
		}
		System.out.println(sb);

	}

}
