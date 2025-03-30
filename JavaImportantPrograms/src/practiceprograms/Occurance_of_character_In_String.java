package practiceprograms;

import java.util.HashMap;
import java.util.Map;

public class Occurance_of_character_In_String {

	public static void main(String[] args) {
      
		String str="Sharan";
		Occurance(str);
		
	}
	public static void Occurance(String str)
	{
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char ch[]=str.toCharArray();
		for(char c:ch)
		{
		if(map.containsKey(c))
		{
		   map.put(c,map.get(c)+1);
		}
		else
		{
			map.put(c,1);
		}
		}
		System.out.println(map);
	}

}
