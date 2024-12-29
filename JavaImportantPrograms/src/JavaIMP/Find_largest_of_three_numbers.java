package JavaIMP;

import java.util.Scanner;

public class Find_largest_of_three_numbers {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the 1st Number");
     int a=sc.nextInt();
     System.out.println("Enter the 2nd Number");
     int b=sc.nextInt();
     System.out.println("Enter the 3rd Number");
     int c=sc.nextInt();
     //Using Conditional Statement
//     if(a>b && a>c)
//     {
//    	 System.out.println(a+" Is the Largest Number");
//     }
//     else if(b>a && b>c)
//     {
//    	 System.out.println(b+" Is the Largest Number");
//     }
//     else
//     {
//    	 System.out.println(c+" Is the Largest Number");
//     }
//     
//     
//     //Ternary Operator
//     
//     int largest=a>b?a:b;
//     largest=c>largest?c:largest;
    int largest=c>(a>b?a:b)?c:(a>b?a:b);
     System.out.println(largest+" Is the Largest Number");
	}

}
