package Arrays;

public class FindNthLargestElement {

	public static void main(String[] args) {
		int[] a= {10,34,23,67,32,5,2,17};
		int temp;
		int n=4;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[j]>a[i]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
			if(i==n-1) {
				
				System.out.println(a[i]);
				break;
			}
		}

	}

}
