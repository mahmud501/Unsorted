package classwork;

import java.util.Scanner;

public class Sortingoption1 {

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
        
        System.out.printf("\nPlease select sorting method\n1 for Bubble sort# \n2 for insertion sort# \n3 for Selection sort \n Enter Sorting Method: ");
        int s = input.nextInt();
        input.close();
        
        if (s==1) {
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
        }
        	else if (s==2) {
        		
                for (int i=1;i<m;i++) {
                	int key = n[i];
                	int j=i-1;
                	while (j>=0 && n[j]>key) {
                		n[j+1]=n[j];
                		j=j-1;
                	}
                	n[j+1]=key;
                	System.out.printf("\nintermediate Output: ");
                    for (int z = 0; z<m; z++){
                        System.out.print(n[z]+" ");
                    }           
                }
//        		for (int i = 1; i < m; ++i) {
//                    int key = n[i];
//                    int j = i - 1;
//
//                    /* Move elements of arr[0..i-1], that are
//                       greater than key, to one position ahead
//                       of their current position */
//                    while (j >= 0 && n[j] > key) {
//                        n[j + 1] = n[j];
//                        j = j - 1;
//                    }
//                    n[j + 1] = key;
//                }
        	}
        	else if(s==3) {
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
        	}
        	else {
        		System.out.println("Wrong Selection");
        	}
        
        System.out.printf("\nDesired Output: \n");
        for (int i = 0; i<m; i++){
            System.out.print(n[i]+" ");
        }
        
        }

	}