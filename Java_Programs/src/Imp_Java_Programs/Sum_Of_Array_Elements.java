package Imp_Java_Programs;

public class Sum_Of_Array_Elements {

	public static void main(String[] args) {
           
		
		int a[]= {10,20,30,40};
		int sum=0;
		//Normal ForLoop
		/*for(int i=0;i<a.length;i++)
		{
			
			sum=sum+a[i];
		}
		System.out.println("Sum of Array Elements: "+sum);
		*/
		//Enhanced ForLoop
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println("Sum of Array Elements: "+sum);
	}

}
