package Ten_Imp_Programs;

public class Palindrome_String {

	public static void main(String[] args) {
    
		String str="MadaM";
		ispalindrome(str);
		

	}
	public static void ispalindrome(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println("Palindrome String");
		}
		else
		{
            System.out.println("Not a Palindrome String");
		}
	}

}
