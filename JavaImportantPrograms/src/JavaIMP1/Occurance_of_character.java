package JavaIMP1;

import java.util.HashMap;

public class Occurance_of_character {

	public static void main(String[] args) {
       
		String str="sharan";
		occurance_char(str);
	}

	private static void occurance_char(String str) {
        
		HashMap<Character,Integer> hm=new HashMap();
		char ch[]=str.toCharArray();
		for(char c:ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c,hm.get(c)+1);
			}
			else
			{
				hm.put(c,1);
			}
		}
		System.out.println(hm);
		
		
	}

}
