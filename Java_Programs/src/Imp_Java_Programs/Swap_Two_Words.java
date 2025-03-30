package Imp_Java_Programs;

public class Swap_Two_Words {

	public static void main(String[] args) {
       
		String s1="Sharan";
		String s2="Automation";
		
		System.out.println("Before Swapping: "+s1+" "+s2);
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length()); //sharan
        s1=s1.substring(s2.length());
        System.out.println("After Swapping: "+s1+" "+s2);
	}
}
