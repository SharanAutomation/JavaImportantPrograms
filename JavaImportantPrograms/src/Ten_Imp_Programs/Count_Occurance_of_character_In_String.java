package Ten_Imp_Programs;

import java.util.HashMap;
import java.util.Map;

public class Count_Occurance_of_character_In_String {

	public static void main(String[] args) {
     
		String word="sharan";
		occurance(word);
		
	}
   public static void occurance(String word)
   {
	   Map<Character,Integer> mp=new HashMap();
	   char[] ch=word.toCharArray();
	   for(char c:ch)
	   {
		   if(mp.containsKey(c))
		   {
			   mp.put(c,mp.get(c)+1);
		   }
		   else
		   {
			   mp.put(c,1);
		   }
	   }
	   System.out.println("Occurance of character: "+mp);
	   
   }
}
