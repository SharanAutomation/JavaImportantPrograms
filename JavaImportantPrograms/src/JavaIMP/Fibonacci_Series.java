package JavaIMP;

//0 1 1 2 3 5 8 13 21 34 50
//Fibonacci series Means Series of a Numbers in which each Number is the Sum of Two Preceding Numbers

public class Fibonacci_Series {

	public static void main(String[] args) {
      int n1=0,n2=1,sum=0;
      System.out.println(n1+" "+n2);
     for(int i=2;i>=0;i++)
     {
    	sum=n1+n2; //0+1
    	System.out.print(" "+sum);
    	n1=n2 ;//1
    	n2=sum;//1
     }

	}

}
