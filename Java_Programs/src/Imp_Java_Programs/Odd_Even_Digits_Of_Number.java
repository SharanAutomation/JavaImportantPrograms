package Imp_Java_Programs;

public class Odd_Even_Digits_Of_Number {

	public static void main(String[] args) {

		
		int num=1234567;
		int evencount=0;
		int oddcount=0;
		
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			
			num=num/10;
		}
		System.out.println("Even Number Count is: "+evencount);
		System.out.println("Odd Number Count  is:  "+oddcount);
	}

}
