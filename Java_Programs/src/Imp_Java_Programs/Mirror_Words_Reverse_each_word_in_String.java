package Imp_Java_Programs;

public class Mirror_Words_Reverse_each_word_in_String {

	public static void main(String[] args) {
     
		String word="I Love India";
		reverse(word);
	}
	public static void reverse(String word)
	{ 
		String spl[]=word.split(" ");
		String reverseword="";
		for(String sp:spl)
		{
		   String revString=" ";
		   for(int i=sp.length()-1;i>=0;i--)
		   {
			   revString=revString+sp.charAt(i);
		   }
		   reverseword=reverseword+revString;
		}
		
		System.out.println(reverseword);
		
	}

}
