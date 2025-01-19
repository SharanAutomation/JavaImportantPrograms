package javaImportantPrograms;

public class SearchElementInArray {

	public static void main(String[] args) {
     int num[]= {10,20,30,40,50};
     int Search_element=20;
     boolean flag=false;
     
     for(int i=0;i<num.length;i++)
     {
    	 if(Search_element==num[i])
    	 {
    		 System.out.println("Element Found");
    		 flag=true;
    		 break;
    	 }
     }
     if(flag==false)
     {
    	 System.out.println("Element Not Found");
     }
     
	}

}
