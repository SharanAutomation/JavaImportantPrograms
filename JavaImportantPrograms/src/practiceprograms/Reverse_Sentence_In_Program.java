package practiceprograms;

public class Reverse_Sentence_In_Program {

	public static void main(String[] args) {
     String str="I love My India";
     reverse(str);
	}

	private static void reverse(String str) {
       
		String rev=" ";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

}
