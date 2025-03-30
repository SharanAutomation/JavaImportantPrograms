package Imp_Java_Programs;

import java.util.HashMap;
import java.util.Map;

public class Occurance_Of_Word_In_String 
{

public static void main(String []args)
{
	String word="sharan";
	occurence(word);	
}
  public static void occurence(String word)

    {
	Map<Character,Integer> map=new HashMap<Character,Integer>();
	char ch[]=word.toCharArray();
	for(char c:ch)
	{
		if(map.containsKey(c))
			map.put(c,map.get(c)+1);
		else
			map.put(c, 1);
	
	}
	
	System.out.println(map);

}
  }
