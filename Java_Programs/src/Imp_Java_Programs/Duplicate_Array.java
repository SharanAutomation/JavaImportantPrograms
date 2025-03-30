package Imp_Java_Programs;

public class Duplicate_Array {

	public static void main(String[] args) {
       
		int arr[]= {12,13,12,14,15,16,15};
		duplicate(arr);
	}
	public static void duplicate(int[] num)
	{
		
		boolean flag=false;
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					System.out.println("Duplicate Found : "+num[i]);
					flag=true;
				}
			}
		}
		if(!flag)System.out.println("Duplicate Not Found");
		
	}

}
