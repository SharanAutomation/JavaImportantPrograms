package Ten_Imp_Programs;

public class Count_the_Occurance_of_Word_In_Sentence {


	public static void main(String[] args) {
    
		String sentence="I Love My India My";
		String word="My";
		int count=occurence(sentence,word);
        System.out.println("Count of Words In String is: "+ count);

}

	private static int occurence(String sentence, String word) {
     
		String temp[]=sentence.split(" ");
		int count=0;
		for(int i=0;i<temp.length;i++)
		{
			if(word.equals(temp[i]))
			
				count++;
			
		}
		return count;
		
	}}
