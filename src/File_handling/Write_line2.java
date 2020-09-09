package File_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write_line2 
{
	
	public static void main(String[] args) throws IOException 
	{
		File f = new File("D:\\JavaWorkspace\\Project_3\\file4.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		Scanner in = new Scanner(System.in);
		
		for(int i=1; i<=5; i++)
		{
			System.out.println("Enter string to write in this line.");
			String s = in.nextLine();
			bw.write(s);
			bw.newLine();
		}
		in.close();
		bw.close();
	}
}
