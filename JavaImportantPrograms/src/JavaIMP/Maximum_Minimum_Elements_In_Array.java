package JavaIMP;

public class Maximum_Minimum_Elements_In_Array {

	public static void main(String[] args) {
       
		int a[]= {20,40,30,50,70};
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
						
		}
		System.out.println("Maximum elements in Array Is: "+max);
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
						
		}
		System.out.println("Minimum elements in Array Is: "+min);
		
					
		
		
	}

}
