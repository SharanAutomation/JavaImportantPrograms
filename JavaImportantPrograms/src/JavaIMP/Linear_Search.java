package JavaIMP;

public class Linear_Search {

	public static void main(String[] args) {
      
		int a[]= {20,30,40,50,60};
		int searchable_element=60;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(searchable_element==a[i])
			{
				System.out.println(a[i]+ " Element Found at " + i + " Position");
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
