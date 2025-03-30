package Imp_Java_Programs;

public class Min_and_Maximum_Element_In_Array {

	public static void main(String[] args) {
       
  int a[]= {10,3,5,30,20,100};
   min_max(a);	
	}
	
	public static void min_max(int a[])
	{
		if(a==null || a.length==0)System.out.println("Array Is Empty");
		int min=a[0];
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum Element Is "+max);
		System.out.println("Minimum Element Is "+min);
	}

}
