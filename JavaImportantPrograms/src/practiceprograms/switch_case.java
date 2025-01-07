package practiceprograms;

import java.util.Scanner;

public class switch_case {

	public static void main(String[] args) {
        
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Day");
	String str=sc.nextLine();
	switch(str)
	{
	case "Sunday":System.out.println("Day1");break;
	case "Monday":System.out.println("Day2");break;
	case "Tuesday":System.out.println("Day3");break;
	case "Wednesday":System.out.println("Day4");break;
	case "Thursday":System.out.println("Day5");break;
	case "Friday":System.out.println("Day6");break;
	case "Saturday":System.out.println("Day7");break;
	default :System.out.println("No weekday is found");
	}
		
		
		
		
			}

}
