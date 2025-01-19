package ExceptionHandling;

import java.util.Scanner;

public class UncheckedException {

	public static void main(String[] args) {
		System.out.println("Program Started");
		
		//Example1--->Arithmetic Exception
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		
		
		//Example2---->Array Index Out Of Bound Exception
		/*int a[]=new int[5];
		System.out.println("Enter the Position 0-4");
		int pos=sc.nextInt();
		System.out.println("Enter the Value");
		int value=sc.nextInt();
		a[pos]=value;*/
		
		
		//Example3---->Number Format Exception
		/*
		String s="1234";
		int I=Integer.parseInt(s);
		System.out.println(s);*/
		
		//Example4----->Null Pointer Exception
		/*
		String str=null;
		System.out.println(str.length());*/
		
		/*try
		{
			System.out.println(100/num);
		}
		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("Program Stopped");
		}*/
	}

}
