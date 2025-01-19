package Data_abstraction;

public class Interfacedemo implements I1,I2 {
	public void m1()
	{
		System.out.println("m1 Method of I1 Interface");
	}
	
	public void m2()
	{
		System.out.println("m2 Method of I2 Interface");
	}

	public static void main(String[] args) {
		
     

		
		Interfacedemo I1=new Interfacedemo();
		I1.m1();
        I1.m2();
        
        I1 i1=new Interfacedemo();
        i1.m1();
        
		System.out.println(i1.y);
		
		
	}

}
