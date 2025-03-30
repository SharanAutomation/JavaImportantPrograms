package practiceprograms;

public class Sum_of_elements_in_array {

	public static void main(String[] args) {
		
		
         int a[]= {2,3,4,5,6};
         int sum=0;
         
         for(int i=0;i<a.length;i++)
         {
        	 sum=sum+a[i];
         }
         System.out.println("Total Sum of Elements in Array Is "+sum);
	}

}
