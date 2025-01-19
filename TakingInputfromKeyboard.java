package javaImportantPrograms;

import java.util.Scanner;

public class TakingInputfromKeyboard {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    //System.out.println("Enter the Number");
    /*int num=sc.nextInt();// int
    System.out.println(num); //read*/
    /*double num1=sc.nextDouble();//double
    // System.out.println(num); //read
    System.out.println(num1); //read*/
    
    System.out.println("Enter your City");
    String str=sc.next();
    System.out.println("Your City is "+ str);
	}

}
