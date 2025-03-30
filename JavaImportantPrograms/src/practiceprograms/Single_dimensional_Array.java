package practiceprograms;

public class Single_dimensional_Array {

	public static void main(String[] args) {
          
		
		int a[]=new int[3];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		
		//System.out.println(a[0]);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		//Enhanced forloop
		
		for(int x:a)
		{
			System.out.println(x);
		}
		
	}

}
