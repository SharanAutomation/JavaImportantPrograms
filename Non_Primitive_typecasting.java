package TypeCasting;

class Animal{ 
	
	int num1=200;
	void m1()
	{
		System.out.println("m1 Method of Animal Class");
	}
	
}



class Cat extends Animal{
	
	int num2=300;
	void m2()
	{
		System.out.println("m2 Method of Cat Class");
	}
	
}


class Dog extends Animal{
	
	int num3=400;
	void m3()
	{
		System.out.println("m3 Method of Dog Class");
	}
	
}
public class Non_Primitive_typecasting {

	public static void main(String[] args) {
      
		/*Animal a=new Animal();
		System.out.println(a.num);
		a.m1();
        */
        /*Animal a=new Cat();
        System.out.println(a.num1);
        a.m1();*/
		
		
		//There are Three Rules we Follow in Primitive Object type Casting
		
		//Rule 1:Conversion is Valid or Not.(there should be relation between Parent to Child or Child to Parent(Downcasting)).
		//Rule 2:Assignment is valid or not.(Downcasted Value should be either same or child of Parent )
		//Rule 3: Underlying Object of Downcasted value must be either Same or Child of Downcasted Value) 
		Animal a=new Cat();
		Cat c=(Cat)a;
		System.out.println(c.num2);
		c.m2();
                 
        
		
		
	}

}
