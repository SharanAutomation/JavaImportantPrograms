package practiceprograms;

public class Occurance_of_Word_In_Sentence {

	public static void main(String[] args) {
    
		
		String sentence="I love My India My";
		String word="My";
		int count=occurance(sentence,word);
		System.out.println(count);
	}
	public static int occurance(String sentence,String word)
	{
		String temp[]=sentence.split(" ");
		
		int count=0;
		for(int i=0;i<temp.length;i++)
		{
			if(word.equals(temp[i]))
			{
				count++;
			}
		}
		return count;
	}

}
