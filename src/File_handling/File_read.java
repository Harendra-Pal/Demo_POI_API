package File_handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_read 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("D:\\JavaWorkspace\\Project_3\\file1.txt");
		
		FileReader fr = new FileReader(f);
		
		int r;
		
		while((r = fr.read()) != -1)
		{
			System.out.println((char)r);
		}
		fr.close();
	}

}
