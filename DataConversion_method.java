package oopsconcept;

public class DataConversion_method {

	public static void main(String[] args) {

		
		//Converting String into Integer by using Wrapper class
		String s1="10";
		String s2="20";
		Integer i=Integer.parseInt(s1);
		Integer i2=Integer.parseInt(s2);
		System.out.println(i+i2);
		
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		
		//Coverting Primitive type (int,double,char,booloean)  into String type
		
		int a=10;
		boolean b=true;
		char c='A';
		double d=10.0;
		String s=String.valueOf(a);
		System.out.println(s);
		s=String.valueOf(b);
		System.out.println(s);
		s=String.valueOf(c);
		System.out.println(s);
		s=String.valueOf(d);
		System.out.println(s);
		
		
		
	}

}
