package classwork;

public class QuickSort {
	
	public static void quicksort(int[] array, int start, int end) {
		
		if (end<=start) return;
			//base case
		int pivot = partition(array,start,end);
		quicksort(array,start,pivot-1);
		quicksort(array,pivot+1,end);
	}

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
	private static int partition(int[] array, int start, int end) {
		/*int pivot= array[end];
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
		
		int pivot= array[start];
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
		return j;
	}

}
