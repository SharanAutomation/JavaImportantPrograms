package JavaIMP;

import java.util.Scanner;

public class CountNumber_Of_Digit_In_Number {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Number");
      int num=sc.nextInt();
      int count=0;
      while(num>0)
      {
    	  num=num/10;
    	  count++;
      }
      System.out.println("Number of Digit In a Number Is "+count);
	}

}
