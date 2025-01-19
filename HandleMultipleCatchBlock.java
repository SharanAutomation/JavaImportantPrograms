package ExceptionHandling;

public class HandleMultipleCatchBlock {

	public static void main(String[] args) {
		
		
		try
		{
			String s="Welcome";
			int length=s.length();
		}
		
		catch(ArithmeticException e)
		
		{
			System.out.println(e.getMessage());
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			System.out.println("You entered into finally block");
		}
		
	}

}
