package Imp_Java_Programs;

public class Print_Even_Odd_Numbers {

	public static void main(String[] args) {
        
		
		int a[]= {20,3,5,7,9,10};
		int even=0;
		int odd=0;
		
		System.out.println("Even Numbers of Array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}		
	    }
		
		System.out.println("Odd Numbers of Array");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}		
	    }
}
}
