package File_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_append 
{

	public static void main(String[] args) throws IOException 
	{
		File f = new File("D:\\JavaWorkspace\\Project_3\\file3.txt");
		FileWriter fw = new FileWriter(f,true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.newLine();
		bw.write("To append new lines.");  //append the file , it won't delete any previous data 
		bw.newLine();
		
		bw.write("to append next new line");
		System.out.println("new line has been added");

		bw.close();
		fw.close();
		
	}

}
