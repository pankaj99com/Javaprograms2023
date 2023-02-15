package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String str="swiss";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			
			
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			}else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}
		
		System.out.println(map);
		
		for(Entry<Character,Integer> entry:map.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
				break;
			}
			
			for(Character c:map.keySet()) {
				if(map.get(c)==1) {
					System.out.println(c);
					break;
				}
			}
		}

	}

}
