package javaImportantPrograms;

import java.util.Scanner;

public class Check_String_Is_Palindrome_Or_Not {

	public static void main(String[] args) {
      
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
		String str=sc.next();
		String original_Str=str;
		String rev="";
		boolean flag=false;
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			if(rev.equals(original_Str))
			{
				System.out.println(rev+" is Palindrome String");
				flag=true;
			}
		}
		
		if(flag==false)
		{
			System.out.println(rev+" Not an Palindrome String");
		}
	}

}
