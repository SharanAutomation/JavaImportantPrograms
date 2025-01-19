package javaImportantPrograms;

public class Find_How_Many_Duplicates_In_Array {

	public static void main(String[] args) {
     int a[]= {10,20,30,40,50,100,10,10};
     int num=10;
     int count=0;
     
     for(int i=0;i<a.length;i++)
     {
    	 if(a[i]==num)
    	 {
    		 count++;
    	 }
     }
     
     System.out.println("Count of Duplicate "+num +" is: "+count);
	}

}
