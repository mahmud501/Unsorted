package classwork;

import java.util.Scanner;

public class Sorting {
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
        
        for (int i=0;i<m;i++) {
        	
        	boolean swap=false;
        	
        	for (int j=0;j<m-1;j++) {
        		
        		if (n[j]>n[j+1]) {
        			int x = n[j];
        			n[j]=n[j+1];
        			n[j+1]=x;
        			swap=true;
        		}
            	System.out.printf("\nintermediate Output: ");
                for (int z = 0; z<m; z++){
                    System.out.print(n[z]);
                }
        	}
        		if (swap==false)
        			break;
        }
        
        System.out.printf("\nDesired Output: \n");
        for (int i = 0; i<m; i++){
            System.out.print(n[i]);
        }
	}
		
}
