package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<Object> s=new LinkedHashSet<Object>(5);
		//default fill ratio--0.75 or load factor  ,initial capacity 16
		
		//16*75/100
		
		s.add("10");
		s.add(10);
		s.add("pankaj");
		s.add(10);
		
		s.add('j');
		s.add('7');
		s.add('$');
		s.add("0");
		
		System.out.println(s);
		
		System.out.println(s.contains(10));
	
		Object a[]= {10,20,16,10,2,34,5};
		
	

	}

}
