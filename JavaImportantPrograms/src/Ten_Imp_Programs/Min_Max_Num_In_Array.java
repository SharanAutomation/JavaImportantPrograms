package Ten_Imp_Programs;

public class Min_Max_Num_In_Array {

	public static void main(String[] args) {
     
		
		int a[]= {};
		minmax(a);
	}
	public static void minmax(int[] a)
	{
		if(a.length==0 || a==null)System.out.println("Array is Empty");
		int min=a[0];
		int max=a[1];
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]<min)
			{min=a[i];}
			else
			{
				max=a[i];
			}
		}
		System.out.println("Minimum Element is:  "+min);
		System.out.println("Maximum Element is:  "+max);
	}

}
