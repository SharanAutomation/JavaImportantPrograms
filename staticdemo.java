package oopsconcept;

public class staticdemo {

     static int a=10;
     static void m1()
     {
    	System.out.println("static m1"); 
     }
     void m2()
     {
    	 System.out.println("static m2");
    	 System.out.println(a);
    	 m1();
     }
     
     public static void main(String[] args)
     {
    	 System.out.println(a);
    	 m1();
    	 staticdemo s1=new staticdemo();
    	 s1.m2();
    	 
     }
		
		
	}

