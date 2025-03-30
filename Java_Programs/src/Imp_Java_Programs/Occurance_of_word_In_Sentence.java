package Imp_Java_Programs;

public class Occurance_of_word_In_Sentence {

	public static void main(String[] args) {
        
		String Sentence="I Love my India love";
		String Word="love";
		int count=Occurence(Sentence,Word);	
		System.out.println("Count is: "+count);
		
	}
	
	private static int Occurence(String Sentence,String Word)
	{
		String temp[]=Sentence.split(" ");
		int count=0;
		for(int i=0;i<temp.length;i++)
		{
			if(Word.equals(temp[i]))
			count++;
		}
		return count;
	}

}
