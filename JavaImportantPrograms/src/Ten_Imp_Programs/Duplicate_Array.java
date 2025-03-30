package Ten_Imp_Programs;

import java.util.HashMap;

public class Duplicate_Array {

	public static void main(String[] args) {
           
		
		int []a= {1,2,3,4,1,2};
		isduplicate(a);
		isduplicatehashmap(a);
	}

	private static void isduplicatehashmap(int[] a) {
        boolean flag=false;
		HashMap <Integer,Integer> hm=new HashMap<Integer,Integer> ();
		for(int i:a)
		{
			if(hm.containsKey(i))
			{
				hm.put(i, hm.get(i)+1);
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
				System.out.println("Found Duplicate: "+i);
				flag=true;
			}
		}
		if(!flag) System.out.println("Not found Duplicate");
		
		
	}

	private static void isduplicate(int[] a) {
       boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate Found: "+a[i]);
					flag=true;
				}
			}
		}
		
		if(!flag){System.out.println("Not Found Duplicate");
		}
		
	}

}
