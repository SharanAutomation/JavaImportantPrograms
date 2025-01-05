package JavaIMP;

public class Remove_Junks_Special_Character_In_String {

	public static void main(String[] args) {
       String s1="!@#$%&*( sharan !@#$%&*( SDET";
       s1=s1.replaceAll("[^a-zA-z0-9]","");
       System.out.println(s1);
	}

}
