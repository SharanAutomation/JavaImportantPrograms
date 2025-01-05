package JavaIMP;

import java.util.Arrays;
import java.util.Collections;

public class Sort_Elements_Array_In_Built_In_Methods {

	public static void main(String[] args) {
     int num[]= {24,25,20,15,10,17};
     
     //Approach1
//     System.out.println("Arrays Before Sorting"+Arrays.toString(num));
//     Arrays.sort(num);
//     System.out.println("Arrays After Sorting"+Arrays.toString(num));
     //Approach2
//     System.out.println("Arrays Before Sorting"+Arrays.toString(num));
//     Arrays.parallelSort(num);
//     System.out.println("Arrays After Sorting"+Arrays.toString(num));
     
     //Sort in Descending Order
     Integer a[]= {24,25,20,15,10,17};
     System.out.println("Arrays Before Sorting"+Arrays.toString(a));
     Arrays.sort(a,Collections.reverseOrder());
     System.out.println("Arrays After Sorting"+Arrays.toString(a));
     
     
	}

}
