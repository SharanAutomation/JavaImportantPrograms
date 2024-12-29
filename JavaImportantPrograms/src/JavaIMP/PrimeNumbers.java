package JavaIMP;

import java.util.Scanner;

//Number should be >1
//Number is divisible by 1 and itself
//Number is Natural Numbers
public class PrimeNumbers {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the  Number");
 int num=sc.nextInt();
 int count=0;
 
	 for(int i=1;i<=num;i++)
	 {
		 if(num%i==0)
			count++; 
	 }
	 
	 if(count==2)
	 {
		 System.out.println("Prime Number");
	             }
	 else 
	 {
		System.out.println("Not an Prime Number");
	  }
 
	}

}
