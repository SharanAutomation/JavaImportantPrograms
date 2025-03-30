package Imp_Java_Programs;

public class Palindrome_Program {

	public static void main(String[] args) {
     
		//String str="radar";
		String str1="1232";
		palindrome(str1);
	}
	public static void palindrome(String str)
	{
		String rev="";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println(rev);
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not an Palindrome");
		}
	}

}
