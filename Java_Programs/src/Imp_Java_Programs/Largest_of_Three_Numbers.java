package Imp_Java_Programs;

public class Largest_of_Three_Numbers {

	public static void main(String[] args) {
        
		int a=10,b=5,c=40;
		
		if(a>b && a>c)
		{
			System.out.println(a+ "  Is the Largest Number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+ "  Is the Largest Number");
		}
		else
		{
			System.out.println(c+ "  Is the Largest Number");
		}
	}

}
