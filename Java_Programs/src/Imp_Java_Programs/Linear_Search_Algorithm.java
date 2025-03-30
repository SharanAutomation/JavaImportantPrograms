package Imp_Java_Programs;

public class Linear_Search_Algorithm {

	public static void main(String[] args) {
           
		int a[]= {10,20,300,100,1};
		int search_element=300;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(search_element==a[i])
			{
				System.out.println("Element Found "+a[i]);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element Not Found ");
		}
	}

}
