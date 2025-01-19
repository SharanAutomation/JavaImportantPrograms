package javaImportantPrograms;

public class Sorting_elements_in_Array_using_for_loop {

	public static void main(String[] args) {
      
		int a[]= {100,200,300,10,2,3};
		
		System.out.print("Array Before Sorting: ");
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[j];
					a[i]=a[j];
					a[j]=temp;
				}
					
			}
		}
		
		System.out.print("Array after Sorting: ");
	
		for(int i=0;i<a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
        
		}
	}


