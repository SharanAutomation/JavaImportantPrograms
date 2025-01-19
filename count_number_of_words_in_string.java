package javaImportantPrograms;

import java.util.Scanner;

public class count_number_of_words_in_string {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the statement");
     String str=sc.nextLine();
     String str1[]=str.split(" ");
     System.out.println("Total Number of String is "+str1.length);
	}

}
