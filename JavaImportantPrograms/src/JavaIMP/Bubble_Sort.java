package JavaIMP;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
       int a[]= {23,2,5,67,9};
       int n=a.length;
       
       System.out.println("Arrays Before Sorting "+ Arrays.toString(a));
       for(int i=0;i<n-1;i++)
       {
    	   for(int j=0;j<n-1;j++)
    	   {
    		   if(a[j]>a[j+1])
    		   {
    			   int temp=a[j];
    			   a[j]=a[j+1];
    			   a[j+1]=temp;
    		   }
    	   }
       }
		
	System.out.println("Arrays After Sorting "+Arrays.toString(a));	
	}

}
