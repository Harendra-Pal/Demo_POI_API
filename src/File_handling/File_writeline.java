package File_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_writeline 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("D:\\JavaWorkspace\\Project_3\\file3.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("To check new first line writing.");  //overwrite previous data
		bw.newLine();
		
		bw.write("to check next second line writing");
		bw.newLine();
		
		bw.write("to check next third line writing");
		
		System.out.println("New file has been created and data has been written line by line.");
		
		bw.close();
		
	}
}
