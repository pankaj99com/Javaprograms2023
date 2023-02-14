package MapsProgram;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicates {

	public static void main(String[] args) {
		int [] arr= {12,34,2,12,45,34,24,67,45,89,36,19};
		
		Map<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		for(Integer x:arr) {
			
			if(!map.containsKey(x)) {
				map.put(x, 1);
			}else {
				map.put(x, map.get(x)+1);
			}
		}
		
		System.out.println("Duplicates in an Array is:");
		for(Integer x:map.keySet()) {
			
			if(map.get(x)>1) {
				
				System.out.print(x+" ");
			}
		}
		

	}

}
