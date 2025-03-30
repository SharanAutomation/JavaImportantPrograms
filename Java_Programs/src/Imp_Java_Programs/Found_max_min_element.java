package Imp_Java_Programs;

public class Found_max_min_element {

	public static void main(String[] args) {
		int a[]= {20,10,5,70,100};
	    max_min(a);	
	}
	public static void max_min(int[] a)
	{
		
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++)
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
		
		System.out.println("Minium Element Is: "+min);
		System.out.println("Maximum Element Is: "+max);
	}

}
