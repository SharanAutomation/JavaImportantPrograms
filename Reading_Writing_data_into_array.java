package javaImportantPrograms;

import java.util.Arrays;
import java.util.Scanner;
public class Reading_Writing_data_into_array {

	public static void main(String[] args) {	
		
	int a[]=new int[5];	
	Scanner sc=new Scanner(System.in);
	
	for(int i=0;i<a.length;i++)
	{
		System.out.println("Enter the Value for the Position: "+i+" ");
		a[i]=sc.nextInt();
	}
	System.out.println("Priting array elements");
	System.out.println(Arrays.toString(a));
	
	
	}

}
