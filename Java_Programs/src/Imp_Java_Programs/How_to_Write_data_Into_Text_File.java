package Imp_Java_Programs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class How_to_Write_data_Into_Text_File {

	public static void main(String[] args) throws IOException {
       
		FileWriter fw=new FileWriter("C:\\Users\\Asus\\OneDrive\\Documents\\seleniumjava3.txt");
		fw.write("Selenium 1");
		fw.write("Selenium 2");
		fw.write("Selenium 3");
		fw.close();
		System.out.println("File has been created");
	}

}
