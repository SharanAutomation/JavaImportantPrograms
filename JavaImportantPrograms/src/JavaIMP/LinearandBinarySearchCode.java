package JavaIMP;

public class LinearandBinarySearchCode {

	public static void main(String[] args) {
       int num[]= {1,2,3,4,5};
       int target=9;
       
      // int result1=linearsearch(num,target);
       int result2=binarysearch(num,target);
       if(result2 != -1)
       {
       System.out.println("Element Found at Index: "+result2);
       }
       else
       {
    	   System.out.println("Element Not Found");
       }
       
	}

//	public static int linearsearch(int[] num, int target) {
//		
//		for(int i=1;i<num.length;i++)
//		{
//			if(num[i]==target)
//			{
//				return i;
//			}
//		}
//		
//		
//		return -1;
//	}
	
	public static int binarysearch(int[] num,int target)
	{
		
		int left=0;
		int right=num.length-1;
		
		while(left<=right)
		{
			int mid=(left+right)/2;
			if(num[mid]==target)
			{
		    return mid;			
		    }
			else if(num[mid]<target)
			{
				left=mid+1;
			}
			else
			{
				right=mid-1;
			}
		}
		
	return -1;
	

}
		
}
