package Imp_Java_Programs;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		//Approach1 By using third Variable;
	/*	System.out.println("Before Swapping A is "+a);
		System.out.println("Before Swapping B is "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping A is "+a);
		System.out.println("After Swapping B is "+b);*/
		
		//Approach2 Without Using third Variable by using + and - operator
		/*System.out.println("Before Swapping A is "+a);
		System.out.println("Before Swapping B is "+b);
		a=a+b;
		b=a-b;
		a=a-b;		
		System.out.println("After Swapping A is "+a);
		System.out.println("After Swapping B is "+b);*/
		
		//Approach3 Without Using third Variable by using * and / operator
		 
		System.out.println("Before Swapping A is "+a);
		System.out.println("Before Swapping B is "+b);
		a=a*b;
		b=a/b;
		a=a/b;		
		System.out.println("After Swapping A is "+a);
		System.out.println("After Swapping B is "+b);
	}

}
