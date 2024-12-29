package JavaIMP;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
    
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();//1234
		//1.using Algorithm 
		int rev=0;
		/*while(num!=0)
		{
		  rev=rev*10+num%10;
		  num=num/10;
		}
		System.out.println("Reverse the Number "+rev);*/
		
		//2.using Stringbuffer
		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev1=sb.reverse();
		System.out.println("Reverse the Number "+rev1);*/
		
		//3.using StringBuilder
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder rev2=sbl.reverse();
        System.out.println("Reverse the Number "+rev2);		
	}

}
