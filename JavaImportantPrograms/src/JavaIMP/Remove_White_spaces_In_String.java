package JavaIMP;

public class Remove_White_spaces_In_String {

	public static void main(String[] args) {
      String s1="Sharan SDET Automation";
      System.out.println("Before Removing White Spaces In String: "+s1);
      s1=s1.replaceAll("\\s","");
      System.out.println("After Removing White Spaces In String: "+s1);
	}

}
