package classwork;

import java.util.Scanner;

public class Sorting2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in array to be sorted: ");
		int l=sc.nextInt();
		int [] array = new int [l];
		System.out.println("Enter the elements to be sorted: ");
		for (int i=0; i<l; i++) {
			array[i]=sc.nextInt();
		}
		System.out.printf("Select Sorting Method:\n#1-Merge Sort\n#2-Quick Sort\n#3-Counting Sort\n#4-Radix Sort\n");
		int s=sc.nextInt();
		System.out.print("Unsorted Input: ");
		for (int i=0; i<l; i++) {
		System.out.print(array[i]+" ");
		}
		sc.close();
		if(s>=1&&s<=4) {
			
			System.out.printf("\nSorted Output: ");
		
		}
		if (s==1) {
			MergeSort.mergesort(array);

			for (int i=0;i<l;i++) {
				System.out.print(array[i]+" ");
			}
		}
		else if (s==2) {
			int end=array.length-1;
			QuickSort.quicksort(array,0,end);
			for (int i:array) {
				System.out.print(i+ " ");
			}
			
		}
		else if (s==3) {
			
			int [] outputarray= CountingSort.countsort(array);
			
			for (int i=0; i<l; i++) {
				System.out.print(outputarray[i]+" ");
			}
		}
		else if (s==4) {
			
			int n=array.length;
			int [] outputarray = RadixSort.radixsort(array);
			
			for (int i=0; i<n; i++) {
				System.out.print(outputarray[i]+" ");
			}
			
		}
		else {
			System.out.printf("\nInvalid Selection");
		}
		
	}

}
