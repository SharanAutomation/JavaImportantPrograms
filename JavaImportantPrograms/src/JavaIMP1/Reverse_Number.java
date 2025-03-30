package JavaIMP1;

public class Reverse_Number {

	public static void main(String[] args) {
       
		
		int num=123456;
		rev_num(num);
	}
	public static void rev_num(int num)
	{
	    int rev=0;
	    while(num!=0)
	    {
	    	rev=rev*10+num%10;
	    	num=num/10;
	    }
	    
	    System.out.println(rev);
	}

}
