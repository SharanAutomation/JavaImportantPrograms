package javaImportantPrograms;

public class Remove_Junk {

	public static void main(String[] args) {
       
		
		String str="@#$% Automation @#$%";
		str=str.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(str);
		str=str.trim();
		System.out.println(str);
	}

}
