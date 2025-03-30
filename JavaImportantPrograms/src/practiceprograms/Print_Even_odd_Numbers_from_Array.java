package practiceprograms;

public class Print_Even_odd_Numbers_from_Array {

	public static void main(String[] args) {
         int a[]= {1,2,3,4,5,6};
         
         for(int i=0;i<=a.length-1;i++)
         {
        	 if(a[i]%2==0)
        	 {
        		 System.out.println("Even Numbers from Array "+a[i]);
        	 }
        	 else
        	 {
        		 System.out.println("Odds Numbers From Array "+a[i]);
        	 }
         }
	}

}
