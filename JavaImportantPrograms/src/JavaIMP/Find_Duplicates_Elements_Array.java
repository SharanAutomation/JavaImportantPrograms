package JavaIMP;

import java.util.HashSet;

public class Find_Duplicates_Elements_Array {

	public static void main(String[] args) {
//       
//		String arr[]= {"java","python","c#","Java","c++"};
//		//Approach 1
//		boolean flag=false;
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					System.out.println("Duplicate elements Found: "+arr[i]);
//					flag=true;
//				}
//							
//			}
//						
//		}
//		if(flag==false)
//		{
//			System.out.println("Duplicate Element Not Found");
//		}
					
		//Approach 2
		
		String arr[]= {"java","python","c#","java","c++"};
		HashSet <String>lan=new HashSet();
		boolean flag=false;
		for(String l:arr)
		{
			if(lan.add(l)==false)
			{
				System.out.println("Duplicate Element Found: "+l);
				flag=true;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Duplicate Element Not found");
		}
					
		
		
	}

}
