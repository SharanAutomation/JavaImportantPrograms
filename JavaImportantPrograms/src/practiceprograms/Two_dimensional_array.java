package practiceprograms;

public class Two_dimensional_array {

	public static void main(String[] args) {
        
		
		int a[][]= {
				{100,200},
				{300,400},
				{500,600}
				
		};
		
		
		for(int r=0;r<=a.length-1;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				System.out.print(a[r][c]+" ");
			}
			
			System.out.println( );
		}
		
		
		for(int arr[]:a)
		{
			for(int c:arr)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
			
	}

}
