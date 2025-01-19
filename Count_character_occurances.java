package javaImportantPrograms;

public class Count_character_occurances {

	public static void main(String[] args) {
        String str="Sharan Automation SDET";
        int total_count=str.length();
        int total_occurance_after_remove=str.replace("a","").length();
        int result=total_count-total_occurance_after_remove;
        System.out.println("Total Occurance of chracter a is "+result);
        
	}

}
