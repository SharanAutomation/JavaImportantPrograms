package Imp_Java_Programs;

public class Number_Of_Digits_In_a_Number {

	public static void main(String[] args) {
         
		int num=123456789;
		
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println("Number Of Digits: "+ count);
	}

}
