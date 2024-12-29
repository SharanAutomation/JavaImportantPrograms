package JavaIMP;

public class Count_Number_of_EvenandOdd_Digits {

	public static void main(String[] args) {
         int num=123456;
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
         
         System.out.println("Number of Even Digit is "+evencount);
         System.out.println("Number of Odd Digit is "+oddcount);
	}

}
