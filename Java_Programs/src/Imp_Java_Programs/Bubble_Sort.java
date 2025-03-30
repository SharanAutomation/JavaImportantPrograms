package Imp_Java_Programs;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
        
		int a[]= {20,10,100,1,2,25};
		System.out.println("Array Before Sorting: "+Arrays.toString(a));
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Arrays After Sorting: "+Arrays.toString(a));
	}

}
