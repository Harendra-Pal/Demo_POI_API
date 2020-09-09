package File_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_write 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("D:\\JavaWorkspace\\Project_3\\file2.txt"); //if file does not exist, it will create new file
		FileWriter fw = new FileWriter(f);
		fw.write("This file is created by using JAVA file handling concept."); //erase all previous data and write provided data in file
		fw.write("it is end");
		System.out.println("File has been created at the given path.");
		fw.close();
	}

}
