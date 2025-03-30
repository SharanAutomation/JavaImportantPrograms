package Java_Program_Practice_Day1;

public class Palindrome_String {

	public static void main(String[] args) {
    
	String str="MalayalaM";
	String org_str=str;
	String rev="";
	boolean flag=false;
	for(int i=str.length()-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
		
	}
	
	if(org_str.equals(rev))
		
	{
		System.out.println("Palindrome String");
	}
	
	else
	{
		System.out.println("Not a Palindrome String");
	}
		
		
		
		
	}

}
