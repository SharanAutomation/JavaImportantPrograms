package Imp_Java_Programs;

public class Reverse_String {

	public static void main(String[] args) {
     String str="sharan";
     //reverse(str);
     reversestringbuffer(str);
	}
	
	private static void reversestringbuffer(String str) {
         StringBuffer sb=new StringBuffer(str);
         System.out.println(sb.reverse());
	}

	public static void reverse(String str)
	{
		String rev=" ";
		int len=str.length()-1;
		for(int i=len;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
	}

}
