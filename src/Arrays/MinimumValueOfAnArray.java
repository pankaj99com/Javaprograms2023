package Arrays;

public class MinimumValueOfAnArray {

	public static void main(String[] args) {
		int[] a= {10,34,23,67,32,5,2,17};
		
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("Minimum value of an array is:"+min);
	}

}
