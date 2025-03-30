package Ten_Imp_Programs;

public class Reverse_each_word_In_String {

	public static void main(String[] args) {
 
		String str="I love India";
		reverse(str);
	}
   public static void reverse(String str)
   {
	   String []sp=str.split(" ");
	   String reverseword=" ";
	   for(String s:sp)
	   {
		   String reverseString=" ";
		   for(int i=s.length()-1;i>=0;i--)
		   {
			   reverseString=reverseString+s.charAt(i);
		   }
		   reverseword=reverseword+reverseString;
           System.out.print(reverseString);
	   }
   }
}
