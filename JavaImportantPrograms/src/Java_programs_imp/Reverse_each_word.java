package Java_programs_imp;

public class Reverse_each_word {

	public static void main(String[] args) {
     
		String sentence="Java Selenium Automation";
		mirror(sentence);
		
	}
	
	public static void mirror(String sentence)
	{
		String word[]=sentence.split(" ");
		String reverseword="";
		
		for(String w:word)
		{
			String rev=" ";
			
			for(int i=w.length()-1;i>=0;i--)
			{
				rev=rev+w.charAt(i);
			}
			
			reverseword=reverseword+rev;
			
		}
		
		System.out.println(reverseword);	
	}

}
