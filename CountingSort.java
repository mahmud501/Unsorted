package classwork;

//import java.util.Scanner;

public class CountingSort {

	/*public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in array to be sorted: ");
		int l=sc.nextInt();
		int [] array = new int [l];
		System.out.println("Enter the elements to be sorted: ");
		for (int i=0; i<l; i++) {
			array[i]=sc.nextInt();
		}
		System.out.printf("Select Sorting Method:\n#1-Merge Sort\n#2-Quick Sort\n");
		int s=sc.nextInt();
		System.out.print("Unsorted Input: ");
		for (int i=0; i<l; i++) {
		System.out.print(array[i]+" ");
		}
		int [] array = {0,1,5,0,6,2,8,7};
		System.out.print("Unsorted Input: ");
		int l=array.length;
		for (int i=0; i<l; i++) {
		System.out.print(array[i]+" ");
		}
		int [] outputarray= countsort(array);
		
		System.out.printf("\nSorted Output: ");
		for (int i=0; i<l; i++) {
			System.out.print(outputarray[i]);
		}
	}*/
	
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
		/*for(int i=0;i<n;i++) {
			outputarray[countarray[inputarray[i]]-1]=inputarray[i];
			countarray[inputarray[i]]--;
			
		}*/
		
		
		return outputarray;
	}
}
