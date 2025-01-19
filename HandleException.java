package ExceptionHandling;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		System.out.println("Program Started");
		
		//Example1--->Arithmetic Exception
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		try
		{
			System.out.println(100/num);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Invalid Data");
		}
		
		
	}

}
