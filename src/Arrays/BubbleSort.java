package Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a= {10,34,23,67,32,5,2,17};
		int temp;
		int n=1;
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a.length-1;j++) {
				
				if(a[j]>a[j+1]) {
					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}
			

			
		}
		
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}
		System.out.println();
		
		for(int l=a.length-1;l>=0;l--) {
			System.out.print(a[l]+" ");
		}


	}

}
