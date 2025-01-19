package oopsconcept;


class Bank
{
	void m1()
	{
		System.out.println("M1 method of BANK CLASS");
	}
}

class Office extends Bank
{
	
	void m1()
	{
		System.out.println("M1 method of BANK office");
	}
	
}

public class overridedemo {
	

	public static void main(String[] args) {

		Bank b1=new Office();
		b1.m1();
		
	}

}
