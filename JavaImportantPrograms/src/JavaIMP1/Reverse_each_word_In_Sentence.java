package JavaIMP1;

public class Reverse_each_word_In_Sentence {

	public static void main(String[] args) {
       
	 String	Str="I Love India";
	 String reverse_word=" ";
	 
	 String []temp=Str.split(" ");
	 
	 for(String sp:temp)
	 {
		 String reverse_String=" ";
		for(int i=sp.length()-1;i>=0;i--)
		{
			reverse_String=reverse_String+sp.charAt(i);
		}
		reverse_word=reverse_word+reverse_String;
	 }
	 System.out.println(reverse_word);
		
	 
	}

}
