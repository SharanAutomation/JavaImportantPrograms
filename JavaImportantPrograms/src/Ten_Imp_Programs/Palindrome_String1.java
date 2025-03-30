package Ten_Imp_Programs;

public class Palindrome_String1 {

	public static void main(String[] args) {
       
		String str="MADAM";
		String org_str=str;
		
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		//System.out.println(rev);
		
		if(org_str.equals(rev))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not an Palindrome String");
		}
	}

}
