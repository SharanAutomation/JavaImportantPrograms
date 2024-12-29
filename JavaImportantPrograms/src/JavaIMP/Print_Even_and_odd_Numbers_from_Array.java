package JavaIMP;

import java.util.Scanner;

public class Print_Even_and_odd_Numbers_from_Array {

	public static void main(String[] args) {
     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int len=sc.nextInt();
		int a[]=new int[len];
		System.out.println("Enter the Value of an Array");
		for(int i=1;i<len;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
//		System.out.println("Print Even Numbers In Array");
//        for(int i=1;i<a.length;i++)
//        {
//        	if(a[i]%2==0)
//        	{
//        		System.out.println(a[i]);
//        	}
//        }
//		System.out.println("Print Odd Numbers In Array");
//        for(int i=1;i<a.length;i++)
//        {
//        	if(a[i]%2!=0)
//        	{
//        		System.out.println(a[i]);
//        	}
//        }
//        
		System.out.println("Print Even Numbers In Array");
		for(int value:a) {
		  if(value%2==0) {
			  System.out.println(value);
		  }
		}
		System.out.println("Print Odd Numbers In Array");
		for(int value:a) {
			if(value%2!=0) {
				System.out.println(value);
			}
		}
		
		
	}

}
