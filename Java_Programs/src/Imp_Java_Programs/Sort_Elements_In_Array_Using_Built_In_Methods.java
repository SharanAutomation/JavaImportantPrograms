package Imp_Java_Programs;

import java.util.Arrays;
import java.util.Collections;

public class Sort_Elements_In_Array_Using_Built_In_Methods {

	public static void main(String[] args) {
          
		
	    /*int a[]= {20,10,3,1,500};
		System.out.println("Array Before Sorting: "+ Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("Arrays After Sorting: "+ Arrays.toString(a));
		*/
		
		//Reverse Order
		
		Integer a[]= {20,10,3,1,500};
		System.out.println("Array Before Sorting: "+ Arrays.toString(a));
		
		Arrays.sort(a,Collections.reverseOrder());
		
		System.out.println("Arrays After Sorting: "+ Arrays.toString(a));
	}

}
