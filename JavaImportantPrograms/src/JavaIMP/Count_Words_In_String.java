package JavaIMP;

import java.util.Scanner;

public class Count_Words_In_String {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the Value");
     String word=sc.nextLine();
     int count=1;
     for(int i=0;i<word.length()-1;i++)
     {
    	 if(word.charAt(i)==' ' && word.charAt(i+1)!=' ')
    	 {
    		 count++;
    	 }
     }
     System.out.println("Total Count of Word In Sentence: "+count);
     
     
	}

}
