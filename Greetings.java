package oopsconcept;

public class Greetings {
	
	
	int sid;
	String name;
	String grade;

	
	//1)No params No return Value
	void m1()
	{
		System.out.println("Method m1()");
	}
	
	//2)No params Return Value
	
	 String m2()
	  {
		  return ("Methos m2 with return value");
	  }
	 
	//3)Take Parameter No return Value 
	 
	 void m3(String name)
	 {
		System.out.println("Hello: "+name); 
	 }
	 
	//4)Take Params Return Value 
	 String m4(String role)
	 {
		 return("Designation is: "+role);
	 }

	}


