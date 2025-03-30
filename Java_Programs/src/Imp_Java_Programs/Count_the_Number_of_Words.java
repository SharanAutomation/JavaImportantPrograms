package Imp_Java_Programs;

import java.util.Scanner;

public class Count_the_Number_of_Words {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Sentence");
       String sentence=sc.nextLine();
       
       int count = 0;
       
       String word[]=sentence.split(" ");
       for(String w:word)
       {
    	   count++;
       }
       System.out.println(count);
       
		
		
	}

}
