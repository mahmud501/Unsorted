package classwork;

import java.util.Arrays;

public class RadixSort {

	public static int[] radixsort(int [] array) {
		int n=array.length;
		 int max_value= array[0];
		 for(int i=1;i<n;i++) {
			 if(array[i]>max_value) {
			 max_value = array[i];
			 }
		 }
		 //System.out.println(max_value);
		 
		 for (int deno=1;max_value/deno>0;deno=deno*10) {
			 countsort(array,n,deno);
		 }
		 return array;
	}
	public static void countsort(int [] inputarray, int n, int deno) {
		int [] output=new int[n];
		int [] countarray=new int [10];
		//Arrays.fill(countarray, 0);
		for (int i=0; i<n; i++) {
			countarray[(inputarray[i]/deno)%10]++;
		}
		
		for (int i=1;i<10;i++) {
			
			countarray[i]+=countarray[i-1];//countarray[i]=countarray[i-1]+countarray[i]
			
		}
		
		for(int i=n-1;i>=0;i--) {
			
			output[countarray[(inputarray[i]/deno)%10]-1]=inputarray[i];
			countarray[(inputarray[i]/deno)%10]--;
			
		}
		
		for (int i=0;i<n;i++) {
			inputarray[i]=output[i];
		}
	}
}
