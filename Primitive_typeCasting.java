package TypeCasting;

public class Primitive_typeCasting {

	public static void main(String[] args) {
        //UpCasting/Widening --Converting smaller range data type into Larger range data type.
		//DownCasting/Narrowing--Converting larger range data type into Smaller range data type.
		
		
		//char,int,long,float,double--Smaller to larger--->While Converting Smaller range datatype into larger range datatype there is no possibilities of data loss
		
		//double,float,long,int,char---larger to Smaller--->While Converting Larger range datatype into Smaller range datatype there is possibilities of data loss,so user manually change the type.
		
		
		
		//Example-1 Upcasting
		/*int n=10000;
		double l=n;
		System.out.println(l);
		
		float f=10.0F;
		double d=f;
		System.out.println(d);
		
		
		*/
		//Example-2 DownCasting
		
		double db=10.00;
		int i=(int)db;
		System.out.println(i);
		
		
		
		
		
		
		
	}

}
