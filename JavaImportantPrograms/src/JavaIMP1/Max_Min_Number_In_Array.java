package JavaIMP1;

public class Max_Min_Number_In_Array {

	public static void main(String[] args) {
         
		int num[]= {1,24,56,77,33,21};
		minmax(num);
	}
	
	public static void minmax(int num[])
	{
		if(num.length==0 || num==null)System.out.println("Array is Empty");
		int min=num[0];
		int max=num[1];
		for(int i=0;i<=num.length-1;i++)
		{
			if(num[i]<min)
			{
				min=num[i];
			}
			else
			{
				max=num[i];
			}
		}
		System.out.println("Maximum Numbers in Array: "+max);
		System.out.println("Minimum Numbers in Array: "+min);
		
	}

}
