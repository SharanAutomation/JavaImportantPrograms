package Imp_Java_Programs;

import java.util.Arrays;

public class Equality_of_Array {

	public static void main(String[] args) {
       
		int a1[]= {20,10,4,200,100};
		int a2[]= {20,10,4,200,100,1001};
		
	/*	boolean status=Arrays.equals(a1,a2);
		
		if(status==true)
		{
			System.out.println("Arrays are Equals");
		}
		else
		{
			System.out.println("Arrays are not Equals");
		}*/
		
		
		boolean status=true;
		 if(a1.length == a2.length)
		 {
			 for(int i=0;i<a1.length;i++)
			 {
				 if(a1[i]!=a2[i])
				 {
					 status=false;
					 
				 }
			 }
		 }
		 else
		 {
			 status=false;
		 }
	
		 if(status==true)
		 {
			 System.out.println("Arrays are Equal");
		 }
		 else
		 {
			 System.out.println("Arrays are Not Equal");
		 }
		
	}

}
