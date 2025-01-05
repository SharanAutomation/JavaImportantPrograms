package JavaIMP;

import java.util.Scanner;

public class Reverse_Each_Word_In_String {

	public static void main(String[] args) {
        
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str=sc.nextLine();//Welcome To Java
		
		String[] word=str.split(" ");
		
		String reversewords="";
		for(String w: word)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reversewords=reversewords+sb.toString()+" ";
		}
		
		System.out.println(reversewords);
        
		
	}

}
