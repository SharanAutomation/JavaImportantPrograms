package JavaIMP1;

public class Reverse_String {

	public static void main(String[] args) {
  
		String str="sharan";
		rev_String(str);
		
	}

	private static void rev_String(String str) {
         String rev=" ";
         for(int i=str.length()-1;i>=0;i--)
         {
        	 rev=rev+str.charAt(i);
         }
         
         System.out.println(rev);
	}

}
