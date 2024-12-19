package classwork;

import java.util.Scanner;

public class Insertionsort {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
        
        System.out.print("Enter how many digits to sort: ");
        int m = input.nextInt();
        int  n [] = new int [m];
        for (int i=0; i<m; i++){
            System.out.printf("Enter %d digit: ",i+1);
            n[i]= input.nextInt();
        }
        input.close();
        System.out.println("Input digits are: ");
        for (int i=0;i<m;i++){
        	
            System.out.print(n[i]);
        }
        
        for (int i=1;i<m;i++) {
        	int j=i;
        	while (j>0 && n[j-1]>n[j]) {
        		int x=n[j];
        		n[j]=n[j-1];
        		n[j-1]=x;
        		j--;
        	}
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
