package Ten_Imp_Programs;

public class Factorial {

	public static void main(String[] args) {
        
		
		
		int f=fact(3);
		System.out.println("Factorial of Number is: "+f);
	}
	
	public static int fact(int f)
	{
		
		int fact=1;
		for(int i=1;i<=f;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

}
