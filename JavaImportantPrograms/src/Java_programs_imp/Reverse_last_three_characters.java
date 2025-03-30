package Java_programs_imp;

public class Reverse_last_three_characters {

	public static void main(String[] args) {
       
		String str="sharan";
		String first=str.substring(0, 3);
		String second=str.substring(3);
		StringBuilder stringbuilder=new StringBuilder();
		for(int i=second.length()-1;i>=0;i--)
		{
			stringbuilder.append(second.charAt(i));
		}
		System.out.println(first+stringbuilder);
	}

}
