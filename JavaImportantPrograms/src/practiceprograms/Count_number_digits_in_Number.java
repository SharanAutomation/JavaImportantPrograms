package practiceprograms;

public class Count_number_digits_in_Number {

	public static void main(String[] args) {
      int num=123456;
      int count=0;
      while(num!=0)
      {
    	num=num/10;
    	count++;
      }
      System.out.println("Number of Digit is " +count);
	}

}
