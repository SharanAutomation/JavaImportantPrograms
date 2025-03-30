package Imp_Java_Programs;

import java.util.HashMap;

public class HashMap_Duplicate_Array {

	public static void main(String[] args) {
       
		int num[]= {12,13,14,12,14};
		duplicate(num);
		
	}
	
	public static void duplicate(int num[])
	{
		
		boolean flag=false;
		HashMap <Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int n:num)
		{
			if(hm.containsKey(n))
			{
				hm.put(n,hm.get(n)+1);
			}
			else
			{
				hm.put(n,1);
			}
		}
		System.out.println(hm);
		
       for(int i:hm.keySet())
       {
    	   if(hm.get(i)>1)
    	   {
    		  System.out.println("Duplicate Found");
    		  flag=true; 
    	   }
    	   
       }
       if(!flag)System.out.println("Duplicate Not Found");
		
	}

}
