package Arrays;

public class MaximumValueOfAnArray {

	public static void main(String[] args) {
		int[] a= {10,34,23,67,32,5,2,17};
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println("Maxuimum value of an array is:"+max);
	}

}
