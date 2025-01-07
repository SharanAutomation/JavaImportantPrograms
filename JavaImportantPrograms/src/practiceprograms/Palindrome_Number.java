package practiceprograms;

public class Palindrome_Number {

	public static void main(String[] args) {
      int num=4334;
      int rev=0;
      int org_num=num;
      while(num!=0)
      {
    	  rev=rev*10+num%10;
    	  num=num/10;
      }
	  if(org_num==rev)
	  {
		  System.out.println("Palindrome Number");
	  }
	  else
	  {
		  System.out.println("Not a Palindrome Number");
	  }
      
      
	}

}
