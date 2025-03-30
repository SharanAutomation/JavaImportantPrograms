package Ten_Imp_Programs;

public class Reverse_A_String {

	public static void main(String[] args) {
  
		String str="Sharan";
		//reverse(str);
		reversestringbuffer(str);
	}
	
	private static void reversestringbuffer(String str) {
       
		StringBuffer sb=new StringBuffer(str);
		System.out.println("StringBuffer: "+sb.reverse());
	}

	public static void reverse(String str)
	{
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}

}
