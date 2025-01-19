package javaImportantPrograms;

public class String_Methods {

	public static void main(String[] args) {
     
		//Length Method return length of the String(Number of characters)
		String s=new String("Automation");
		String str="Sharan";
		System.out.println("Length of the String is:  "+s.length());
		System.out.println("Length of the String is: "+"Sharan".length());
		
		//concat() method
		
		
		String s1="sharan";
		String s2="Automation";
		String s3="qa";
		System.out.println(s1+" "+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(s3));
		
		//trim()
		
		String st=" WELCOME    ";
		System.out.println("Before Trim "+st.length());
		System.out.println("After Trim "+st.trim().length());
		
		//charAt
		
		String c="Sharan Automation";
		System.out.println("Chart At 5th Index is : " +c.charAt(5));
		
		//Contains() return method is  boolean
        String cn="Welcome to JAVA";
        System.out.println(cn.contains("Welcome"));
        System.out.println(cn.toLowerCase().contains("welcome"));
        
        
        //Equals Method
        String  s4="Welcome";
        String s5="welcome";
        System.out.println(s4==s5);
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));
        
        //replace
        String s6="JAVA SELENIUM PYTHON SELENIUM C SELENIUM";
        System.out.println(s6.replace("SELENIUM","PLAYWRIGHT"));
        System.out.println(s6.replace('S', 'm'));
        
        
        //Substring
        String s7="POLIMER";
        System.out.println(s7.substring(1, 7));
        
        //toUppercase()
        //toLowercase()
        
        String s8="sharan";
        System.out.println(s8.toLowerCase());
        
        //Split() split the string into multiple part by using delimeter.
        String sg="abc@gmail.com";
        String sg1[]=sg.split("@");
        System.out.println(sg1[0]);
        System.out.println(sg1[1]);
        
        
		
	}

}
