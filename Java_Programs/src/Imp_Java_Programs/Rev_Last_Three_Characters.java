package Imp_Java_Programs;

public class Rev_Last_Three_Characters {

	public static void main(String[] args) {
         
		String str="sharan";
		String s1=str.substring(0,3);
		String s2=str.substring(3);
		String rev="";
		for(int i=s2.length()-1;i>=0;i--)
		{
			rev=rev+s2.charAt(i);
		}
		
		System.out.println(s1+rev);
	}

}
