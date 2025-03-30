package Imp_Java_Programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
    
	String str1="below";
	String str2="Elbow";
    boolean anagram=anagram(str1,str2);	
    System.out.println("Is Anagram: "+anagram);
	}

	public static boolean anagram(String str1, String str2) {
		
	  if(str1.length()!=str2.length())
		  return false;
	  
	  char ch1[]=str1.toLowerCase().toCharArray();
	  char ch2[]=str2.toLowerCase().toCharArray();
	  
	  Arrays.sort(ch1);
	  Arrays.sort(ch2);
	  
	  return Arrays.equals(ch1,ch2);

}}
