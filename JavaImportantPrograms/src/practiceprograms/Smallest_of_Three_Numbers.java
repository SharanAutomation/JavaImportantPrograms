package practiceprograms;

public class Smallest_of_Three_Numbers {

	public static void main(String[] args) {
       
		
	  int a=20;
	  int b=30;
	  int c=5;
	  
	  if(a<b && a<c)
	  {
		  System.out.println(a + " is a smallest Number");
	  }
	  else if(b<a && b<c)
	  {
		  System.out.println(b + " is a smallest Number");
	  }
	  else
	  {
		  System.out.println(c + " is a smallest Number");
	  }
	}

}
