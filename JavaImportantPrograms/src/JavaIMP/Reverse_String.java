package JavaIMP;

public class Reverse_String {
	
	public static void main(String[] args)
	{
		
		String str="ABCD";
		//1.Using Concatenation
		
		String rev="";
		/*int len=str.length();//4
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		System.out.println("Reverse the String"+rev);*/
       
		
		//2.Using Character Array
		char ch[]=str.toCharArray();
		int len2=ch.length;
		
		for(int i=len2-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println("Reverse the String "+rev);
	}

}
