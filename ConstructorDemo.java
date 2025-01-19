package oopsconcept;

public class ConstructorDemo {
	
	int x,y;
	
	ConstructorDemo()
	{
		 x=100;
		 y=200;
	}
	ConstructorDemo(int a,int b)
	{
		 x=a;
		 y=b;
	}
	void sum()
	{
		System.out.println(x+y);
	}
	

	public static void main(String[] args) {

		
		ConstructorDemo cd=new ConstructorDemo();
		ConstructorDemo cd1=new ConstructorDemo(300,400);
		cd.sum();
		cd1.sum();
		
	}

}
