package classwork;

import java.util.Scanner;

public class Selectionsort {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        
        System.out.print("Enter how many digits to sort: ");
        int m = input.nextInt();
        int  n [] = new int [m];
        for (int i=0; i<m; i++){
            System.out.printf("Enter %d digit: ",i+1);
            n[i]= input.nextInt();
        }
        System.out.println("Input digits are: ");
        for (int i=0;i<m;i++){
        	
            System.out.print(n[i]);
        }
        input.close();
        for (int i=0; i<m;i++) {
        	
        	int s_index=i;
        	
        	for (int j=i+1;j<m;j++) {
        		
        		if (n[j]<n[s_index]) {
        			s_index=j;
        		}
        	}
        	int x=n[i];
        	n[i]=n[s_index];
        	n[s_index]=x;
        	
        	System.out.printf("\nintermediate Output: ");
            for (int z = 0; z<m; z++){
                System.out.print(n[z]);
            }  
        }
        
        System.out.printf("\nDesired Output: \n");
        for (int i = 0; i<m; i++){
            System.out.print(n[i]);
        }

	}

}
