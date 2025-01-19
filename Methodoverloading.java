package oopsconcept;

public class Methodoverloading {
	int x;
	int y;
	
	void m1()
	{
	System.out.println(x+y);	
	}
	void m1(int x,int y)
	{
		System.out.println(x*y);
	}
	void m1(int x,double y)
	{
		System.out.println(x-y);
	}
	int m1(int x,int y,int z)
	{
		return x+y+z;
	}
	
	Methodoverloading(int x,int y)
	{
		this.x=x;
		this.x=x;
	}
	
	
}

