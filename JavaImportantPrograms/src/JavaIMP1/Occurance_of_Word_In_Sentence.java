package JavaIMP1;

public class Occurance_of_Word_In_Sentence {

	public static void main(String[] args) {
      
		String Sentence="I love My India love";
		String word="love";
		int count=occurance_word(Sentence,word);
		System.out.println("Occurance of Word is: "+count);
	}
    
    public static int occurance_word(String Sentence,String word)
    {
    	
    	String temp[]=Sentence.split(" ");
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
