package javaImportantPrograms;

public class StringComparison {

	public static void main(String[] args) {
         //CASE1
		String s1="ABC";
		String s2="ABC";
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		
		
		//CASE2
		String s3="ABC";
		String s4=new String("ABC");
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true
		
		
		//CASE3
		String s5="ABC";
		String s6=new String("ABC");
		String s7=s6;
		System.out.println(s5==s6);//false
		System.out.println(s5.equals(s6));//true
		System.out.println(s7==s6);//true
		System.out.println(s7.equals(s6));//true	
		
		
		
	}

}
