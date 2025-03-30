package Imp_Java_Programs;

public class Sum_Of_Digits_In_A_Number {

	public static void main(String[] args) {
         
		
		int num=1234;
		int sum=0;
		/*for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}*/
		
		
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		
		System.out.println("Sum of Digits In a Number: "+sum);
	}

}
