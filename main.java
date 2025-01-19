package oopsconcept;

public class main {

	
	
	 void main()
	 {
		 System.out.println("main 1");
	 }
	 void main(String name)
	 {
		 System.out.println("Hello: "+name);
	 }
	 void main(int ID)
	 {
		 System.out.println("ID: "+ID);
	 }
	 
	public static void main(String[] args) {
		
		main m1=new main();
		m1.main();
        m1.main("sharan");
        m1.main(25);

	}

}
