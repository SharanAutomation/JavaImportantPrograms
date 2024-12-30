package JavaIMP;
//Array should not have duplicates
//Value should be in range

public class Missing_Numbers_in_Array {

	public static void main(String[] args) {
     int a[]= {1,2,3,4,6,7};
     //sum1=23
     //sum2=28
     //sum2-sum1=5
     int sum1=0;
     
     for(int i=0;i<a.length;i++)
     {
    	 sum1=sum1+a[i];
     }
     System.out.println("Total Number of Sum1: "+sum1);
     
     int sum2=0;
     for(int i=1;i<=7;i++)
     {
    	 sum2=sum2+i;
     }
     System.out.println("Total Number of Sum1: "+sum2);
     System.out.println("Missing Numbers In Array Is: "+(sum2-sum1));
	}

}
