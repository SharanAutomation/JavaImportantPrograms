package JavaIMP1;

public class Palindrome_String {

	public static void main(String[] args) {
       String str="RAR";
       String org_str=str;
       String rev="";
       for(int i=str.length()-1;i>=0;i--)
       {
    	   rev=rev+str.charAt(i);
       }
       
       if(rev.equals(org_str))
       {
    	   System.out.println("Palindrome String");
       }
       else
       {
    	   System.out.println("Not a Palindrome String");
       }
		
		
	}

}
