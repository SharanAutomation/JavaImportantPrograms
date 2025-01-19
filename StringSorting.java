package javaImportantPrograms;

import java.util.Arrays;

public class StringSorting {

	public static void main(String[] args) {
       String s[]= {"Dhoni","Ashwin","Brendon","Shami"};
       System.out.println("Arrays Before sorting "+Arrays.toString(s));
       Arrays.sort(s);
       System.out.println("Arrays After Sorting "+Arrays.toString(s));		
	}

}
