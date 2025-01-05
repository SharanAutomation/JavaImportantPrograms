package JavaIMP;

public class Count_Character_Occurance {

	public static void main(String[] args) {
       
		
		
		String s="sharan SDET Automation";
		int total_count=s.length();
		s=s.replace("n","");
		int total_count_after_remove=s.length();
		
		int result=total_count-total_count_after_remove;
		System.out.println("Number of Occurance of n is: "+result);
	}

}
