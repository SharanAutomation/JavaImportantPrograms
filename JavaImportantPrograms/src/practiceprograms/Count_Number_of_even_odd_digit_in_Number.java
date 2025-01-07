package practiceprograms;

public class Count_Number_of_even_odd_digit_in_Number {

	public static void main(String[] args) {
          int num=12345;
          int evencount=0;
          int oddcount=0;
          
          while(num!=0)
          {
        	  if(num%2==0)
        	  {
        		  evencount++;
        	  }
        	  else
        	  {
        		  oddcount++;
        	  }
        	  num=num/10;
          }
          
          System.out.println("Total Number of Even is "+evencount);
          System.out.println("Total Number of Odd is  "+oddcount);
	}

}
