package Ten_Imp_Programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
           
		String str1="gum";
		String str2="mugg";
		boolean anag =isanagram(str1,str2);
		System.out.println(anag);
		
	}

	private static boolean isanagram(String str1, String str2) {
              
		
		if(str1.length()!=str2.length())
			   return false;
		
		char ch1[]=str1.toLowerCase().toCharArray();
		char ch2[]=str2.toLowerCase().toCharArray();
		
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
		
		
	}

}
