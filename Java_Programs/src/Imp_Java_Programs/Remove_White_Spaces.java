package Imp_Java_Programs;

public class Remove_White_Spaces {

	public static void main(String[] args) {
       
		String str="Automation Testing Java Selenium";
		System.out.println("Before Removing the Space: "+str);
		str=str.replaceAll("\\s", "");
		System.out.println(str);
		
		
		
	}

}
