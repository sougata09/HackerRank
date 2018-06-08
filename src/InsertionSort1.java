import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class InsertionSort1 {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
    	int n= ar.length;
    	int key=ar[n-1];
    	System.out.println(key);
    	for(int i=n-1;i>=0;i--)
    	{
    		int j =i-1;
    		if(j>-1)
    		{
    		if(ar[j]>key)
    		{
    			ar[j+1]=ar[j];
    		}
    		else
    		{
    			ar[j+1]=key;
    			printArray(ar);
    			break;
    		}
    		printArray(ar);
    		}
    		else
    		{
    			ar[0]=key;
    			printArray(ar);
    		}
    	}
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}