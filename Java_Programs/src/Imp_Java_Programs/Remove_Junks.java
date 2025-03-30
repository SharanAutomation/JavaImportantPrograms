package Imp_Java_Programs;

public class Remove_Junks {

	public static void main(String[] args) {
     
		
		String str="@#$%^&*(*&^%$#@#$%^&*( sharan )(*&^%$#$%^&*(";
		System.out.println("Before Removing the Junks: "+str);
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("After Removing the Junks: "+str);
	}

}
