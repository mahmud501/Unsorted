package classwork;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*System.out.print("Enter the number of elements in array to be sorted: ");
		int l=sc.nextInt();
		int [] array = new int [l];
		System.out.println("Enter the elements to be sorted: ");
		for (int i=0; i<l; i++) {
			array[i]=sc.nextInt();
		}*/
		System.out.printf("Select Sorting Method:\n#1-Merge Sort\n#2-Quick Sort\n#3-Counting Sort\n#4-Radix Sort\n");
		int s=sc.nextInt();
		//86,68,25,1,0,98,278,978,23,45,78,1001,9
		int [] array = {45,31,65,7,89,21,205,0,5};
		int l=array.length;
		System.out.print("Unsorted Input: ");
		for (int i=0; i<l; i++) {
		System.out.print(array[i]+" ");
		}
		sc.close();
		if(s>=1&&s<=4) {
			
			System.out.printf("\nSorted Output: \n");
		
		}
		if (s==1) {
			mergesort(array);

			for (int i=0;i<l;i++) {
				System.out.print(array[i]+" ");
			}
		}
		else if (s==2) {
			int end=array.length-1;
			quicksort(array,0,end);
			for (int i:array) {
				System.out.print(i+ " ");
			}
			
		}
		else if (s==3) {
			
			int [] outputarray= countsort(array);
			
			for (int i=0; i<l; i++) {
				System.out.print(outputarray[i]+" ");
			}
		}
		else if (s==4) {
			
			int n=array.length;
			int [] outputarray = radixsort(array);
			for (int i=0; i<n; i++) {
				System.out.print(outputarray[i]+" ");
			}
			
		}
		else {
			System.out.printf("\nInvalid Selection");
		}
		

	}	
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
//		int leftsize=leftarray.length/2;
//		int rightsize=rightarray.length-leftsize;
		int leftsize=leftarray.length;
		int rightsize=rightarray.length;
		 
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
//public static void quicksort(int[] array, int start, int end) {
		/*if (end<=start) return;
			//base case
		int pivot = partition(array,start,end);
		quicksort(array,start,pivot-1);
		quicksort(array,pivot+1,end);
		*/
	
	// Ascending order
	public static void quicksort(int[] array, int left, int right) {		

		if (left < right) {
			
        int pivot = median(array, left, right);
        int i = left+1;
        int j = right-2;
        
        while(true) {
        	while(i<=right && array[i]<pivot)
        		i++;
        	while(j>=left && array[j]>pivot)
        		j--;
        	if(i<j) {
        		int temp=array[j];
        		array[j]=array[i];
        		array[i]=temp;
        	}
        	else
        		break;
		}
        int temp=array[i];
        array[i]=array[right-1];
        array[right-1]=temp;
		quicksort(array,left,i-1);
		quicksort(array,i+1,right);
		}
	}
	public static int median(int[]array,int left,int right) {
		int center=(left+right)/2;
		if(array[left]>array[center]) {
			int temp=array[left];
			array[left]=array[center];
			array[center]=temp;
		}
		if(array[left]>array[right]) {
			int temp=array[left];
			array[left]=array[right];
			array[right]=temp;
		}
		if(array[center]>array[right]) {
			int temp=array[center];
			array[center]=array[right];
			array[right]=temp;
		}
		int temp = array[center];
		array[center]=array[right-1];
		array[right-1]=temp;
		
		return array[right-1];
	}
	// Descending order
//	public static void quicksort(int[] array, int left, int right) {		
//
//		if (left < right) {
//			
//        int pivot = median(array, left, right);
//        int i = left+1;
//        int j = right-2;
//        
//        while(true) {
//        	while(i<=right && array[i]>pivot)
//        		i++;
//        	while(j>=left && array[j]<pivot)
//        		j--;
//        	if(i<j) {
//        		int temp=array[j];
//        		array[j]=array[i];
//        		array[i]=temp;
//        	}
//        	else
//        		break;
//		}
//        int temp=array[i];
//        array[i]=array[right-1];
//        array[right-1]=temp;
//		quicksort(array,left,i-1);
//		quicksort(array,i+1,right);
//		}
//	}
//	public static int median(int[]array,int left,int right) {
//		int center=(left+right)/2;
//		if(array[left]<array[center]) {
//			int temp=array[left];
//			array[left]=array[center];
//			array[center]=temp;
//		}
//		if(array[left]<array[right]) {
//			int temp=array[left];
//			array[left]=array[right];
//			array[right]=temp;
//		}
//		if(array[center]<array[right]) {
//			int temp=array[center];
//			array[center]=array[right];
//			array[right]=temp;
//		}
//		int temp = array[center];
//		array[center]=array[right-1];
//		array[right-1]=temp;
//		
//		return array[right-1];
//	}
	

	/*private static int partition(int[] array, int start, int end) {
		
		int pivot = array[end];
		int i = start - 1;
		
		for(int j = start; j <= end; j++) {
			if(array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		i++;
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;
		
		return i;
	}*/
	/*private static int partition(int[] array, int start, int end) {
		int pivot= array[end];
		int i=start;
		for (int j=start;j<=end;j++) {
			if(array[j]<pivot) {
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				i++;
				//System.out.println(i);
				//System.out.println(array[i]);
			}
		}
		int temp = array[i];
		array[i] = array[end];
		array[end] = temp;
		return i;*/
		
		/*int pivot= array[start];
		int i=start;
		int j=end;
		while(i<j) {
			while (array[i]<=pivot && i<end) {
				i++;
			}
			while(array[j]>pivot && j>=start) {
					j--;
			}
			if(i<j) {
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		int temp=array[start];
		array[start]=array[j];
		array[j]=temp;
		return j;*/


	public static int[] countsort(int[] inputarray) {
			
			int n=inputarray.length;
			int k= 0;
			//finding max value of input array
			for (int i=0;i<n;i++) {
				k=Math.max(k, inputarray[i]);
			}
			
			int [] countarray=new int[k+1];
			
			for (int i=0; i<n; i++) {
				countarray[inputarray[i]]=countarray[inputarray[i]]+1;
			}
			
			for (int i=1;i<=k;i++) {
				
				countarray[i]+=countarray[i-1];//countarray[i]=countarray[i-1]+countarray[i]
				
			}
			
			int [] outputarray = new int [n];
			for(int i=n-1;i>=0;i--) {
				outputarray[countarray[inputarray[i]]-1]=inputarray[i];
				countarray[inputarray[i]]--;
				
			}
			
			return outputarray;
		}
	

		/*
		 * public static int[] radixsort(int [] array) { int n=array.length; int
		 * max_value= array[0]; for(int i=1;i<n;i++) { if(array[i]>max_value) {
		 * max_value = array[i]; } } //System.out.println(max_value); int j=1; int y=1;
		 * while(max_value/j>0) { y++; j*=10; } if(max_value%j!=0) { j=j/10; }
		 * //System.out.println(j); int deno=j; //for (int deno=j;deno>0;deno=deno/10) {
		 * countsort1(array,n,deno, j); //} return array; } public static void
		 * countsort1(int [] inputarray, int n, int deno, int j) { int [] output=new
		 * int[n]; //int [] countarray=new int [10];
		 * 
		 * int [] tempinput=new int[n]; for(deno=j;deno>0;deno=deno/10) { int []
		 * countarray=new int [10]; for(int i=0;i<n;i++) { tempinput[i]=inputarray[i];
		 * //System.out.print(tempinput[i]+" "); } //System.out.println();
		 * 
		 * for(int i=0;i<n;i++) {
		 * 
		 * tempinput[i]=(tempinput[i]/deno)%10; //System.out.print(tempinput[i]+" ");
		 * 
		 * } //System.out.println(); for (int i=0; i<n; i++) {
		 * countarray[tempinput[i]]++; }
		 * 
		 * for (int i=1;i<10;i++) {
		 * 
		 * countarray[i]+=countarray[i-1];//countarray[i]=countarray[i-1]+countarray[i]
		 * 
		 * } //for(int i=0;i<10;i++) { //System.out.print(countarray[i]); //}
		 * 
		 * //System.out.println("n="+n); for(int i=n-1;i>=0;i--) {
		 * //System.out.print("i="+i);
		 * //output[countarray[tempinput[i]]-1]=inputarray[i];
		 * output[countarray[tempinput[i]]-1]=inputarray[i]; countarray[tempinput[i]]--;
		 * 
		 * }
		 * 
		 * for (int i=0;i<n;i++) { inputarray[i]=output[i];
		 * System.out.print(inputarray[i]+" "); } System.out.println();
		 * 
		 * } System.out.println(); }
		 */
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
			 countsort1(array,n,deno);
		 }
		 return array;
	}
	public static void countsort1(int [] inputarray, int n, int deno) {
		int [] output=new int[n];
		int [] countarray=new int [10];
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