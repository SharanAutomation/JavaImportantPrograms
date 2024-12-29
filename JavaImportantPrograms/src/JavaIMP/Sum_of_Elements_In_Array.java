package JavaIMP;

import java.util.Scanner;

public class Sum_of_Elements_In_Array {

	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int len=sc.nextInt();
		int a[]=new int[len];
		System.out.println("Enter Elements of the Number");
		for(int i=1;i<len;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
//		for(int i=1;i<a.length;i++)
//		{
//			sum=sum+a[i];
//		}
//		System.out.println("Sum of the Array is "+ sum);
//					
		for(int value:a)
		{
			sum=value+sum;
			
		}
		System.out.println("Sum of the Array is "+ sum);
		
	}

}
