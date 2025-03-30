package Imp_Java_Programs;

import java.util.HashSet;

public class Find_String_Array_Duplicate {

	public static void main(String[] args) {
		String arr[]= {"java","Selenium","python","Automation","java"};
		boolean flag=false;
		
		
	/*	//Approach1
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Element Found: "+arr[i]);
					flag=true;
					break;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Element Not Found");
		}
		*/
		//Approach2
		HashSet <String> hs=new HashSet();
		for(String st:arr)
		{
			if(hs.add(st)==false)
			{
				System.out.println("Found Duplicates: "+st);
				
			}
		}
		if(flag==true)
		{
			System.out.println("Not Found Duplicates");
		}
		
		
	}

}
