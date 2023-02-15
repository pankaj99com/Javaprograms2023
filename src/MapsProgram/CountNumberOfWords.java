package MapsProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountNumberOfWords {

	public static void getCharCount(String name) {
		
		Map<String,Integer> map=new LinkedHashMap<String,Integer>();
		
	String[] strArr=name.split(" ");
	
	for(int i=0;i<strArr.length;i++) {
		
		
		if(!map.containsKey(strArr[i])) {
			
			map.put(strArr[i], 1);
		}else {
			
			map.put(strArr[i],map.get(strArr[i])+1);
		}
	}
		
		
		
		
		System.out.println(name+" "+map);
		System.out.println(map);
		
		for(String s:map.keySet()) {
			
			System.out.println("Count of words  -->"+s+"--> "+map.get(s));
			
		}
	}
	
	
	
	

	public static void main(String[] args) {
		getCharCount("India is great Country and India is beautiful");
	}

}
