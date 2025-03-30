package Imp_Java_Programs;

public class Missing_Numbers_In_Array {

	public static void main(String[] args) {

		
		
		int a[]= {1,2,4,5,6};
		
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
		  sum1=sum1+a[i];
		}
		System.out.println(sum1);
		
		int sum2=0;
		for(int i=1;i<6;i++)
		{
		  sum2=sum2+i;	
		}
		
		System.out.println("Sum of range of Values: "+sum2);
		
		System.out.println("Missing Numbers in Array :"+(sum2-sum1));
		
	}

}
