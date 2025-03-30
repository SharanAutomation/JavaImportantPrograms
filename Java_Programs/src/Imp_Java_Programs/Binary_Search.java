package Imp_Java_Programs;

public class Binary_Search {

	public static void main(String[] args) {
         
		
		int a[]= {20,10,30,5,100,50};//should be sorted order
		int l=0;
		int h=a.length-1;
		int key=1000;
		
		boolean flag=false;
		
		while(l<=h)
		{
			int m=(l+h)/2;
			if(a[m]==key)
			{
				System.out.println("Element Found");
				flag=true;
				break;
			}
			if(a[m]<key)
			{
				l=m+1;
			}
			if(a[m]>key)
			{
				h=m-1;
			}
		}
		if(flag==false)
		{
			System.out.println("Element Not Found");
		}
		
		
		
		
	}

}
