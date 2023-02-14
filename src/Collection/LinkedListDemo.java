package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		List<Object> arr = new LinkedList<Object>();

		// List<Object> obj= new ArrayList<Object>();

		int[] z = new int[10];
		// z[10]=10;
		// z[1]="pankaj";
		arr.add("pankaj");// 0
		arr.add(10);// 1
		arr.add(10.2);// 2
		arr.add('A');// 3
		arr.add(true);// 4
		arr.add("pankaj");// 5
		arr.set(3, "Accolite");// 6
		arr.add(3, "vishwa");
		System.out.println(arr);
		System.out.println(arr.get(3));
		System.out.println(arr.size());

		List<Object> arr1 = new ArrayList<Object>();

		arr1.add('#');
		arr1.add('$');
		arr1.addAll(arr);

		System.out.println(arr1);

		System.out.println(arr1.contains("pankaj"));

		// How to print Arrlist

		for (int i = 0; i < arr1.size(); i++) {
			System.out.print(arr1.get(i) + " ");
		}
		System.out.println();
		for (Object ele : arr) {
			System.out.print(ele + " ");
		}

		System.out.println();
		Iterator<Object> it = arr1.iterator();

		while (it.hasNext()) {

			System.out.print(it.next() + " ");
		}

		System.out.println();
		System.out.println(arr);

		System.out.println(arr.indexOf("Accolite1"));

		String s = "kumar";

		char[] o = s.toCharArray();
		System.out.println(o);

		arr.clear();

		System.out.println(arr);

		LinkedList<Object> obj = new LinkedList<Object>();
		
		obj.add(10);
		obj.add("pank");
		obj.addFirst("India");
		obj.add('#');
		obj.addLast("Country");
		
		System.out.println(obj);
	}

}
