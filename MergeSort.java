package classwork;

public class MergeSort {

	public static void mergesort(int [] array) {
		
		int l=array.length;
		if (l<=1) //base case
			return;
		int m=l/2;
		int [] leftarr=new int[m];
		int [] rightarr = new int[l-m];
		
		int i=0; //for leftarr
		int j=0; // for rightarr
		
		for(;i<l;i++) {
			if (i<m) {
				leftarr[i]=array[i];
			}
			else {
				rightarr[j]=array[i];
				j++;
			}
		}
		mergesort(leftarr);
		mergesort(rightarr);
		merge(leftarr, rightarr, array);
	}
	private static void merge(int [] leftarray, int[] rightarray, int [] array) {
		int leftsize=array.length/2;
		int rightsize=array.length-leftsize;
		 
		int i=0; //for array
		 int l=0; //for leftarr
		 int r=0; //for rightarr
		 
		while(l<leftsize && r<rightsize) {
			if(leftarray[l]<rightarray[r]) {
				array[i]=leftarray[l];
				i++;
				l++;
			}
			else {
				array[i]=rightarray[r];
				i++;
				r++;
			}
		}
		while(l<leftsize) {
			array[i]=leftarray[l];
			i++;
			l++;
		}
		while(r<rightsize) {
			array[i]=rightarray[r];
			i++;
			r++;
		}
	}
}
