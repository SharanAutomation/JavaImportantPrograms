package oopsconcept;

class A
{
	int a=10;
	void display()
	{
		System.out.println(a);
	}
}
class B extends A
{
	int b=20;
	void show()
	{
		System.out.println(b);
	}
}
class C extends B
{
	int c=30;
	void print()
	{
		System.out.println(c);
	}
}


public class InheritanceTypes {

	public static void main(String[] args) {
     
		B obj1=new B();
		System.out.println(obj1.a);
		obj1.display();
        obj1.show();
        C obj2=new C();
        obj2.print();
		
	}

}
