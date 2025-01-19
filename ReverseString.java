package javaImportantPrograms;

public class ReverseString {

	public static void main(String[] args) {
          
		//Approach1
		/*String s1="Sharan";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		System.out.println(rev);
		
		StringBuilder str= new StringBuilder("WELCOME");
		str.reverse();
		System.out.println(str);
		StringBuffer str1=new StringBuffer("ABC");
		str1.reverse();
		System.out.println(str1);*/
		
		//Approach2 without using length() method and chatAt method
		
		String S="KARTHICK";
		char arr[]=S.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		
		
		
		
	}

}
