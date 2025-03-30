package Imp_Java_Programs;

public class Factorial_of_Number {

	public static void main(String[] args) {
         int num=5;
         int factorial=1;
        
         //Approach1
       /*  for(int i=1;i<=num;i++)
         {
        	 factorial=factorial*i;	 
         }
         */
         //Approach2
         
         for(int i=num;i>=1;i--)
         {
        	 factorial=factorial*i;
         }
         System.out.println(factorial);
	}

}
