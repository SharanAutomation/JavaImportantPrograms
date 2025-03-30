package JavaIMP1;

import java.util.HashMap;

public class Find_Duplicates_In_Array {

	public static void main(String[] args) {
        
		int a[]= {10,20,30,40,50,50,20,30};
		//isduplicate(a);
		isduplicatehashmap(a);
		
	}
	private static void isduplicatehashmap(int[] a) {
        boolean flag=false;
		HashMap <Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i:a)
		{
			if(hm.containsKey(i))
			{
				hm.put(i,hm.get(i)+1);
			}
			else
			{
				hm.put(i,1);
			}
		}
		System.out.println(hm);
		
		for(int i:hm.keySet())
		{
			if(hm.get(i)>1)
			{
				System.out.println("Found Duplicates: "+i);
				flag=true;
			}
		}
		if(!flag)System.out.println("Not Found Duplicates");
	}
	public static void isduplicate(int a[])
	{
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Find Duplicates Array: "+a[i]);
					flag=true;
				}
			}
		}
		if(!flag)System.out.println("Not Found Duplicates Array");
	}

}
