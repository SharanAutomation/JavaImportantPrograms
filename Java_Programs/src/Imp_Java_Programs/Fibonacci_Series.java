package Imp_Java_Programs;

public class Fibonacci_Series {

	public static void main(String[] args) {
       
		int num=10;
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.print(n1+" "+n2);//0 1
		
		for(int i=2;i<=num;i++)
		{
          sum=n1+n2;
          System.out.print(" "+sum);
          n1=n2;
          n2=sum;
		}
		
	}

}
