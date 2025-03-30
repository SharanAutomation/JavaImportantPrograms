package Imp_Java_Programs;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read_Data_From_File {

	public static void main(String[] args) throws IOException {
       
		FileReader fr=new FileReader("C:\\Users\\Asus\\OneDrive\\Documents\\seleniumjava3.txt");
	    Scanner sc=new Scanner(fr);
	    sc.useDelimiter("\\z");
	    System.out.println(sc.next());
	}

}
