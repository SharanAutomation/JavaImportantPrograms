package JavaIMP;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
		
		//Logic-1 -By using third Variable Swapping Two Numbers
		int a=10;
		int b=20;
		System.out.println("Before Swapping Two Numbers "+a+" "+b);
		int t=a;
		a=b;
		b=t;
		//System.out.println("After Swapping Two Numbers "+a+" "+b);
		//Logic-2 -Without using third Variable Swapping Two Numbers
		
		a=a+b;//10+20
		b=a-b;//30-20
		a=a-b;//30-10
		//System.out.println("After Swapping Two Numbers "+a+" "+b);
		
       //Logic -3 Single Statement
		b=a+b-(a=b);  // (30)-(20)=10
		System.out.println("After Swapping Two Numbers "+a+" "+b);
	}

}
