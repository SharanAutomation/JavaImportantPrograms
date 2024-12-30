package JavaIMP;

import java.util.Arrays;

public class CheckArrayEquals {

	public static void main(String[] args) {
          
		
		//Logic 1
		int a[]= {1,2,3,4,5,6};
		int b[]= {1,2,3,4,5,6};
		
//		boolean status=Arrays.equals(a,b);
//		if(status==true) {
//			System.out.println("Arrays are Equals");
//		}
//		else {
//			System.out.println("Arrays are not Equals");
//		}
		//Logic 2
		
		boolean status=true;
		if(a.length==b.length) {
			for(int i=1;i<a.length;i++) {
				if(a[i]!=b[i]) {
					status=false;
				}
			}
			
		}
		else {
			status=false;
		}
		if(status==true) {
		System.out.println("Arrays are Equals");
	}
	else {
		System.out.println("Arrays are not Equals");
	}
	}

}
