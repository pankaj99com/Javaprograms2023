package MapsProgram;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOFCharacters {

	public static void getCharCount(String name) {
		
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		char[] charArr=name.toCharArray();
		
		
		for(char c:charArr) {
			
			
			if(!map.containsKey(c)) {
				map.put(c,1);
			}else {
				
				map.put(c, map.get(c)+1);
			}
		}
		
		
		System.out.println(name+" "+map);
		System.out.println(map);
		
		for(Character c:map.keySet()) {
			
			System.out.println("Count of "+c+" is "+map.get(c));
			
		}
	}
	
	
	
	

	public static void main(String[] args) {
		getCharCount("Pankaj");
	}

}
