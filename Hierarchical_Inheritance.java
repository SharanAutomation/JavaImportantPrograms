package oopsconcept;


class parent
{
	int a=100;
	void m1(int a)
	{
		System.out.println(a);
	}
	
}
class child1 extends parent
{
	int b=200;
	void m2(int b)
	{
		System.out.println(b);
	}
	
}

class child2 extends parent
{
	int c=200;
	void m3(int c)
	{
		System.out.println(c);
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
          
		child1 c1=new child1();
		c1.m1(200);
		c1.m2(20);
		child2 c2=new child2();
		c2.m1(300);
		c2.m3(400);
		
	}

}
