package File_handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_readline 
{
	public static void main(String[] args) throws IOException 
	{
		File f = new File("D:\\JavaWorkspace\\Project_3\\file1.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String s;
		while((s = br.readLine()) != null )
		{
			System.out.println(s);
		}
		fr.close();
		br.close();
	}
}
