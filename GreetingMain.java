package oopsconcept;

public class GreetingMain {

	public static void main(String[] args) {
           
		Greetings g1=new Greetings();
		g1.m1();
		String str=g1.m2();
		System.out.println(str);
		
		g1.m3("sharan");
		String st=g1.m4("Automation Testing");
		System.out.println(st);
		
	}

}
