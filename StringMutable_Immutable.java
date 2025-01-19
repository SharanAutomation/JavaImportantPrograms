package javaImportantPrograms;

public class StringMutable_Immutable {

	public static void main(String[] args) {
		
		//String is Immutable
       String s1="sharan";
       String concat=s1.concat("  Automation");
       System.out.println(s1);  //Immutable,we can't change the Original Value 
	   System.out.println(concat);	//We can change the Original Value by assigning variable
		
		//String Buffer/Builder is Mutable
	   StringBuffer sb=new StringBuffer("Qspider");
	   sb.append("Institute");
	   System.out.println(sb);
	}

}
