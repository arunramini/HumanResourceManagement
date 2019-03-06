package test;

public class BubbleSort {

	public static void main(String[] args) {
		 
		//First way using sorting algorithm
		Integer arr[]={11,2,2,33,33,4,5,6,0,9};
		/*for(int i=0;i<a.length;i++)
			for(int j=0;j<a.length;j++){
				if(a[i]<a[j]){
					a[i]=a[i]+a[j];
					a[j]=a[i]-a[j];
					a[i]=a[i]-a[j];
					
				}}*/
		
		
		   for (int i = 0; i < arr.length; i++) {
		        for (int j = i + 1; j < arr.length; j++) {
		            int tmp = 0;
		            if (arr[i] > arr[j]) {
		                tmp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = tmp;
		            }
		        }
		   }
		for(int i1=0;i1<arr.length;i1++)
		{
		System.out.println(arr[i1]);
	
	}
	}		
}
